import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Short Name: ");
		int ShortName = scanner.nextInt();
		if(ShortName >= 2 && ShortName <= 6)
		{
			System.out.println("Valid Short Name");
			
	}
		else {
			System.out.println("Not a Valid Short Name");
		}

}
}
 
