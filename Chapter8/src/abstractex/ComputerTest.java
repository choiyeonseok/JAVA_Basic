package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer computer = new Computer(); // �ȉ�
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		Computer myNote = new MyNoteBook();
		myNote.display();
		myNote.typing();

	}

}
