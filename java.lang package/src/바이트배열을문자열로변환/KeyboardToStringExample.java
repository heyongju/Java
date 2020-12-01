package 바이트배열을문자열로변환;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; //읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); // 배열에 읽은 바이트를 저잘하고 읽은 바이트 수를 리턴
		
		String str = new String(bytes, 0, readByteNo-2); //배열을 문자열로 변환 -2한 이유는 캐리지리턴(\r)과 리파인드(\n)을 없애기 위해
		System.out.println(str);
	}

}
