package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter  extends MouseAdapter{

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		MouseListenerEx.la.setLocation(x, y); //���̺��� ��ġ�� (x, y)�� �̵�
	}
}
