import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheck {
	
	private File file = new File("/usr/share/dict/words");
	
	public boolean Check(String w)
	{
		boolean flag = false;
		Scanner sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String d = sc.nextLine();
				if (d.equalsIgnoreCase(w))
				{
					flag = true;
					break;
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flag;
	}
	

}
