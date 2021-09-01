import java.util.Scanner;
public class VoteEligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age = scanner.nextInt();
		if(age<18)
		{
			System.out.println("cant vote");
		}
		else
		{
			System.out.println("can vote");
			
	}
	}
}

