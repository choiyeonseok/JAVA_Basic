package lotto;

import java.util.HashMap;
import java.util.List;

public class WinningCalculator {

	/* 로또 결과 계산에 필요한 상수들 */
	private static final int WINNING_BORDER = 3;
	private static final int FIRST_PLACE = 7;
	private static final int BONUS_PLACE = 6;
	private static final int THIRD_PLACE = 5;
	private static final int FOURTH_PLACE = 4;
	private static final int FIFTH_PLACE = 3;
	private static final int PERCENTAGE = 100;
	private static final long FIRST_PLACE_REWARD = 200000000L;
	private static final long BONUS_PLACE_REWARD = 30000000L;
	private static final long THIRD_PLACE_REWARD = 1500000L;
	private static final long FOURTH_PLACE_REWARD = 50000L;
	private static final long FIFTH_PLACE_REWARD = 5000L;
	
	/* 로또 등수 통계 */
	private HashMap<Integer, Integer> scoreStatistics = new HashMap<Integer, Integer>() {{
		put(FIFTH_PLACE, 0);
		put(FOURTH_PLACE, 0);
		put(THIRD_PLACE, 0);
		put(BONUS_PLACE, 0);
		put(FIRST_PLACE, 0);
	}};  
	
	/* 로또 등수 별 상금 통계 */
	private HashMap<Integer, Long> rewardInformation = new HashMap<Integer,Long>() {{
		put(FIFTH_PLACE, FIFTH_PLACE_REWARD);
		put(FOURTH_PLACE, FOURTH_PLACE_REWARD);
		put(THIRD_PLACE, THIRD_PLACE_REWARD);
		put(BONUS_PLACE, BONUS_PLACE_REWARD);
		put(FIRST_PLACE, FIRST_PLACE_REWARD);
	}}; 
	
	/* 로또 당첨 번호 */
	private List<Integer> winningNumbers;
	
	/* 보너스 당첨 번호 */
	private int bonusNumber;
	
	public WinningCalculator(List<Integer> winningNumbers, int bonusNumber) {
		this.winningNumbers = winningNumbers;
		this.bonusNumber = bonusNumber;
	}
	
	/*
	 * 해당 플레이어의 로또 당첨 결과 및 수익률 계산
	 */
	public void calculatePlayerScore(Player player) {
		List<Lotto> lottoSet = player.getLottoSet();
		for (Lotto lotto : lottoSet) {
			calculateEachLotto(lotto);
		}
		showTotalScoreAndRateOfReturn(player);
	}
	
	/*
	 * 로또 별 당첨 번호 갯수 계산
	 */
	private void calculateEachLotto(Lotto lotto) {
		int count =  (int)lotto.getNumbers()
					.stream()
					.filter(i -> winningNumbers.contains(i))
					.count();
		if (count >= WINNING_BORDER) {
			saveToScoreStatistics(count, lotto);
		}
	}
	
	/*
	 * 당첨 결과 저장
	 */
	private void saveToScoreStatistics(int count, Lotto lotto) {
		if (count == THIRD_PLACE && lotto.getNumbers().contains(bonusNumber)) {
			scoreStatistics.put(BONUS_PLACE, scoreStatistics.get(BONUS_PLACE) + 1);
			return;
		}
		scoreStatistics.put(count, scoreStatistics.get(count) + 1);
	}
	
	/*
	 * 당첨 결과 및 수익률 출력
	 */
	private void showTotalScoreAndRateOfReturn(Player player) {
		for (Integer key : scoreStatistics.keySet()){
		    System.out.println(showEachScore(key, scoreStatistics.get(key)));
		}
		System.out.printf("총 수익률은 %.3f%%입니다.", calculateRateOfReturn(player));
	}
	
	/*
	 * [보너스 번호] + 각 로또 별 당첨번호 출력
	 */
	private String showEachScore(Integer key, Integer value) {
		if (key == BONUS_PLACE) {
			return String.format(THIRD_PLACE +"개 일치, 보너스 볼 일치("+rewardInformation.get(key) + ")- " + value);
		}
		return restEachScore(key, value);
	}
	
	/*
	 * 각 로또 별 당첨 번호 출력
	 */
	private String restEachScore(Integer key, Integer value) {
		if (key == FIRST_PLACE) {
			return String.format(BONUS_PLACE + "개 일치("+rewardInformation.get(key) + ")- " + value);
		}
		return String.format(key+"개 일치("+rewardInformation.get(key) + ")- " + value);
	}
	
	/*
	 * 플레이어의 수익률 계산
	 */
	private float calculateRateOfReturn(Player player) {
		long winningAmount = 0;
		long purchaseAmount = player.getAmount();
		
		for (Integer key : scoreStatistics.keySet()){
		    winningAmount += rewardInformation.get(key) * scoreStatistics.get(key);
		}
		return (float)winningAmount / purchaseAmount * PERCENTAGE;
	}
	
}
