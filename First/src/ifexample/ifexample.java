package ifexample;

public class ifexample {

	public static void main(String[] args) {
		int score = 60 ;
		char grade;
		
		if (score > 89){
			grade = 'A';
			}
		else if (score > 79) {
			grade = 'B';
		}
		else if (score > 69) {
			grade = 'C';
		}
		else if (score > 59) {
			grade = 'D';
		}
		else {
			grade = 'F';
			
						
		}
		
		System.out.println("������ " + score + "��, ����� " + grade);

	}
}
