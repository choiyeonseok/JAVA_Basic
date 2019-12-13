package domain.balckjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import domain.card.Card;
import domain.card.CardFactory;
import domain.user.Dealer;
import domain.user.Player;

public class BlackJackGame {

	private static final int INITIAL_CARDS = 2;
	private static final int LOSE_FACTOR = -1;
	private static final double BLACKJACK_FACTOR = 1.5;
	private static final double DEFAULT_REWARD = 0.0;
	private static final int DEALER_BORDER_SCORE = 16;
	private static final int BLACKJACK_SCORE = 21;
	private static final int ACE_SCORE_FACTOR = 10;
	private static final int TOP_OF_CARDS = 0;
	private static final char HIT = 'y';
	private static final char STAY = 'n';
	
	private String[] playerNames;
	private List<Player> playerList = new ArrayList<>();
	private Dealer dealer = new Dealer();
	private List<Card> cardList = new ArrayList<>(CardFactory.create());
	
	private int dealerScore;
	private int dealerReward;
	private HashMap<String, Integer> playerScores = new HashMap<>();
	private HashMap<String, Double> playerReward = new HashMap<>();

	
	Scanner input = new Scanner(System.in);
	
	public void play() {
		initialize();
		takePlayTurns();
		showResults();
	}
	
	private void initialize() {
		inputPlayerInfos();
		initialDivideCards(playerNames);
		initializeRewards();
		showInitialStatus();
	}
	
	private void takePlayTurns() {
		playersTurn();
		dealerTurn();
	}
	
	private void showResults() {
		showGameResult();
		showRewards();
	}
	
	private void initializeRewards() {
		for (String name : playerNames) {
			playerReward.put(name, DEFAULT_REWARD);
		}
	}
	
	private void inputPlayerInfos() {
		System.out.println("���ӿ� ������ ����� �̸��� �Է��ϼ���.(��ǥ �������� �и�)");
		playerNames = input.next().split(",");
	
		for (String name : playerNames) {
			System.out.println(name + "�� ���� �ݾ���?");
			double bettingMoney = input.nextDouble();
			playerList.add(new Player(name, bettingMoney));
		}
	}
	
	private void initialDivideCards(String[] playerNames) {
		System.out.println("������ " + String.join(",", Arrays.asList(playerNames)) + "���� " + INITIAL_CARDS + "���� ī�带 ���������ϴ�."); 
		Collections.shuffle(cardList);
		for (int i = 0; i < INITIAL_CARDS; i++) {
			dealer.addCard(cardList.remove(TOP_OF_CARDS));
			divideCards();
		}
	}
	
	private void divideCards() {
		for (Player player : playerList) {
			player.addCard(cardList.remove(TOP_OF_CARDS));
		}
	}
	
	private void showInitialStatus() {
		dealer.showCardInfo();
		System.out.println();
		for (Player player : playerList) {
			player.showCardInfo();
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	/* */
	
	private void playersTurn() {
		for (Player player : playerList) {
			int playerScore = eachPlayerTurn(player);
			playerScores.put(player.getName(), playerScore);
			if (playerScore > BLACKJACK_SCORE) {
				whenPlayerBurst(player);
			}
		}
	}
	
	private int eachPlayerTurn(Player player) {
		boolean hit = true;
		int playerScore = player.getPlayerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR);
		if (playerScore == BLACKJACK_SCORE) {
			blackJackCase(player);
			return playerScore; 
		}
		while (playerScore < BLACKJACK_SCORE && hit) {
			System.out.println(player.getName() + "�� ���� ������ " + player.getPlayerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR) + "�Դϴ�.\n �� ���� ī�带 �� �ްڽ��ϱ�? (���� y, �ƴϿ��� n)" );
			char choice = input.next().charAt(TOP_OF_CARDS);
			hit = isChoiceHit(choice, player);
			playerScore = player.getPlayerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR);
		}
		return playerScore;
	}
	
	private void blackJackCase(Player player) {
		if (dealer.getDealerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR) != BLACKJACK_SCORE) {
			System.out.println("���ϵ帳�ϴ�. �����Դϴ�.");
			playerReward.put(player.getName(), player.getBettingMoney() * BLACKJACK_FACTOR);
			dealerReward -= player.getBettingMoney() * BLACKJACK_FACTOR;
		}
	}

	private boolean isChoiceHit(char choice, Player player) {
		if (choice == HIT) {
			player.addCard(cardList.remove(TOP_OF_CARDS));
			player.showCardInfo();
			System.out.println();
			return true;
		}
		return false;
	}
	
	/*
	 * �÷��̾� �� ���� �� ������ ���� 
	 */
	private void dealerTurn() {
		while (dealer.getDealerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR) <= DEALER_BORDER_SCORE) {
			System.out.println("������ " + DEALER_BORDER_SCORE + "���϶� ������ ī�带 �� �޾ҽ��ϴ�.");
			System.out.println();
			dealer.addCard(cardList.remove(TOP_OF_CARDS));
		}
		dealerScore = dealer.getDealerScore(BLACKJACK_SCORE, ACE_SCORE_FACTOR);
	}
	
	/*
	 * ���� ���� �� ������ �÷��̾��� ī�� �� ���� ����� ���.
	 */
	private void showGameResult() {
		dealer.showCardInfo();
		System.out.println("- ��� : " + dealerScore);
		for (String key : playerScores.keySet()){
			playerList.stream()
					.filter(c -> c.getName().equals(key))
					.findAny().get()
					.showCardInfo();
		    System.out.println("- ��� : " + playerScores.get(key));
		}
	}
	
	private void showRewards() {
		calculateRewards();
		System.out.println("## ���� ����");
		System.out.println("���� : " + dealerReward);
		for (String key : playerReward.keySet()){
		    System.out.println(key + " : " + playerReward.get(key));
		}
	}
	
	private void calculateRewards() {
		for (Player player : playerList) {
			int playerScore = playerScores.get(player.getName());
			whenDealerWin(playerScore, player);
			whenPlayerWin(playerScore, player);
		}
		if (dealerScore > BLACKJACK_SCORE) {
			whenDealerBurst();
		}
	}
	
	private void whenPlayerBurst(Player player) {
		playerReward.put(player.getName(), player.getBettingMoney() * LOSE_FACTOR);
		dealerReward += player.getBettingMoney();
	}
	
	private void whenDealerBurst() {
		for (Player player : playerList) {
			if (playerReward.get(player.getName()) == DEFAULT_REWARD) {
				playerReward.put(player.getName(), player.getBettingMoney());
				dealerReward -= player.getBettingMoney();
			}
		}
	}
	
	private void whenDealerWin(int playerScore, Player player) {
		if (dealerScore <= BLACKJACK_SCORE && dealerScore > playerScore) {
			dealerReward += player.getBettingMoney();
			playerReward.put(player.getName(), player.getBettingMoney() * LOSE_FACTOR);
		}
	}
	
	private void whenPlayerWin(int playerScore, Player player) {
		if (playerScore <= BLACKJACK_SCORE && dealerScore < playerScore) {
			dealerReward -= player.getBettingMoney();
			playerReward.put(player.getName(), player.getBettingMoney());
		}
	}
	
}
