package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // just책이생길수 있는 방을 만듬
		Book[] copyLibrary = new Book[5];
		
		//직접 객체를 생성해줘야한다.
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for(int i=0; i<copyLibrary.length; i++) {
			copyLibrary[i] = new Book();
		}
		
		for(int i=0; i<library.length; i++) { //깊은 복사
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("나목");
		library[1].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}

}
