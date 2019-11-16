package oop;

abstract class Unit{
	int x, y; // 현재 위치
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{ // 보병
	void stimPack() {}

	@Override
	void move(int x, int y) {
		
	} 
}
class Tank extends Unit{ // 탱크
	void changeMode() {} 
	@Override
	void move(int x, int y) {
		
	} 
}
class Dropship extends Unit{ // 수송선
	void load() { } 
	void unload() { }
	@Override
	void move(int x, int y) {
		
	} 
}

public class Ex7_17 {

}
