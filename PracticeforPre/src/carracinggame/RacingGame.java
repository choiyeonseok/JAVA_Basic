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
		System.out.println("���� ���");
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
			MAX = updateMAX(MAX, car);
			if (MAX == car.getPosition() && winners != car.getName()) {
				winners += ", " + car.getName();
			}
		}
		System.out.println(winners + "�� ���� ����߽��ϴ�.");
	}
	
	private int updateMAX(int MAX, Car car) {
		if (MAX < car.getPosition()) {
			winners = car.getName();
			return car.getPosition();
		}
		return MAX;
	}

}
