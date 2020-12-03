package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(androidStr));  //새로운 인스턴스로 메모리 사용
		
		javaStr = javaStr.concat(androidStr);				
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr)); // 이것도 새로운 메모리 사용
	}

}
