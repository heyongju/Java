package string;

class Book {
	int booknumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.booknumber = bookNumber;
		this.bookTitle = bookTitle;  //å ��ȣ�� ������ �Ű������� �Է¹޴� ������
	}

	@Override
	public String toString() {
		return bookTitle + ", " + booknumber;
	}
	
	
	
}

public class ToStringEx{
	public static void main (String[] args) {
		Book book1 = new Book(200, "����");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
	
}
