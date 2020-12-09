package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyListener extends KeyAdapter{
	public void KeyPress(KeyEvent e) {
		int keyCode = e.getKeyCode(); //키 코드 알아내기
		char keyChar = e.getKeyChar(); //키 문자 값 알아내기
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
