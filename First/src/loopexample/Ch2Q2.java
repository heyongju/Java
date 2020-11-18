package loopexample;

public class Ch2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				if (i % 2 != 0 ) {
					continue;
				}
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
