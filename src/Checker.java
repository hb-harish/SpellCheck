import java.util.Scanner;

public class Checker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SpellCheck s = new SpellCheck();
		while(true)
		{
			System.out.println("Enter the sentence");
			String w = sc.nextLine();
			String delim = " ";
			String[] parts = w.split(delim);
			boolean flag = true;
			for (int i =0; i<parts.length; i++)
			{
				if (!s.Check(parts[i]))
				{
					System.out.println( parts[i] + " is not a word, please reenter");
					flag = false;
				}
			}
			if (flag)
			{
				System.out.println("Good job");
				break;
			}
		}
		
	}

}
