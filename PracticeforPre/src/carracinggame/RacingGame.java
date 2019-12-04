package carracinggame;

import java.util.*;

public class RacingGame {
	private int trialTime = 0;
	private List<Car> carlist;
	private InputManager inputManager;
	private String winners = "";
	
	public RacingGame() {
		carlist = new ArrayList<>();
		inputManager = new InputManager();
	}

	public void play() {
		prepareRacing();
		racing();
		showWinners();
	}
	
	private void prepareRacing() {
		inputManager.initialize();
		trialTime = inputManager.getTrialTime();
		for (String name : inputManager.getCarNames()) {
			carlist.add(new Car(name));
		}
	}
	
	private void racing() {
		System.out.println("실행 결과");
		for (int i = 0; i < trialTime; i++) {
			for (Car car : carlist) {
				car.goForwardOrNot();
				car.showPosition();
			}
			System.out.println();
		}
	}

	private void showWinners() {
		int MAX = 0;
		for (Car car : carlist) {
			if (MAX < car.getPosition()) {
				MAX = car.getPosition();
				winners = car.getName();
			} else if (MAX == car.getPosition()) {
				winners += ", " + car.getName();
			}
		}
		System.out.println(winners + "가 최종 우승했습니다.");
	}

}
