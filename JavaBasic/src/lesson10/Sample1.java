package lesson10;

public class Sample1 {

	public static void main(String[] args) {
		String str = "Hello";
		char ch1 = str.charAt(0); //첫번째 문자를 추출
		char ch2 = str.charAt(1); // 두번째 문자를 추출
		int len = str.length(); // 문자열의 길이를 반환
		System.out.println(str + "의 첫 번째 문자는 " + ch1 + " 입니다.");
		System.out.println(str + "의 두 번째 문자는 " +  ch2 + " 입니다.");
		System.out.println(str + "의 길이는" + len + "입니다.");
	}

}
