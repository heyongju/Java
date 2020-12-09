package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter  extends MouseAdapter{

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		MouseListenerEx.la.setLocation(x, y); //레이블의 위치를 (x, y)로 이동
	}
}
