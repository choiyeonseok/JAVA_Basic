package interfaceex;

public interface Sort {

	public void ascending();
	public void descending();
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
	
	public void showInfo();
	
}
