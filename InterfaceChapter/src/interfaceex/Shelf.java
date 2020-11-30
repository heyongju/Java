package interfaceex;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>(); //디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성됨
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
