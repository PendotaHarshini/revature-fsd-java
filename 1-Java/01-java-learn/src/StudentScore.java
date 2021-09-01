import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score");
		int score = scanner.nextInt();
		if(score >= 60 && score <= 70) {
			System.out.println("Average Student");
			
	}
		else {
			System.out.println("Not Average Student");
		}

}
}
 