package loopexample;

public class Ch2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char star = '*';
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 3; j >i ; j--) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < 2*i+1 ; k++) {
				System.out.print(star);
			}
			System.out.println();}


	
	}
}