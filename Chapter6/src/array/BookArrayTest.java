package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		
		Book[] library = new Book[5]; // just책이생길수 있는 방을 만듬
		
		//직접 객체를 생성해줘야한다.
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
	}

}
