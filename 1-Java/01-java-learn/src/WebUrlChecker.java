import java.util.Scanner;
public class WebUrlChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the website address:");
		String url = scanner.nextLine();
		if(url.startsWith("https://")||url.startsWith("http://"))
		{
			System.out.println("This is a Web URL");
		}
			else
			{
				System.out.println("This is NOT a Web URL");
			}
		}

	}


