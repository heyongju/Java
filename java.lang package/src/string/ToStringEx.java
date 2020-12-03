package string;

class Book {
	int booknumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.booknumber = bookNumber;
		this.bookTitle = bookTitle;  //책 번호와 제목을 매개변수로 입력받는 생성자
	}

	@Override
	public String toString() {
		return bookTitle + ", " + booknumber;
	}
	
	
	
}

public class ToStringEx{
	public static void main (String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
	
}
