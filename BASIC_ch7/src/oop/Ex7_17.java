package oop;

abstract class Unit{
	int x, y; // ���� ��ġ
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{ // ����
	void stimPack() {}

	@Override
	void move(int x, int y) {
		
	} 
}
class Tank extends Unit{ // ��ũ
	void changeMode() {} 
	@Override
	void move(int x, int y) {
		
	} 
}
class Dropship extends Unit{ // ���ۼ�
	void load() { } 
	void unload() { }
	@Override
	void move(int x, int y) {
		
	} 
}

public class Ex7_17 {

}
