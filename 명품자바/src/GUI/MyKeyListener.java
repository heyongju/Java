package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter{
	public void KeyPress(KeyEvent e) {
		int keyCode = e.getKeyCode(); //Ű �ڵ� �˾Ƴ���
		char keyChar = e.getKeyChar(); //Ű ���� �� �˾Ƴ���
		KeyListenerEx.keyMessage[0].setText(Integer.toString(keyCode));
		KeyListenerEx.keyMessage[1].setText(Character.toString(keyChar));
		KeyListenerEx.keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
		System.out.println("KeyPressed");
	}
	
	public void KetReleased(KeyEvent e) {
		System.out.println("KeyReleased");
	}
	
	public void KeyTyped(KeyEvent e) {
		System.out.println();
	}
	
	

}
