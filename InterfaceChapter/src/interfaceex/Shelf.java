package interfaceex;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>(); //����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
