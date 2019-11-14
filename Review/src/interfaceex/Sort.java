package interfaceex;

public interface Sort {

	public void ascending();
	public void descending();
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
	
	public void showInfo();
	
}
