package Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class throws1 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		System.out.println("Hello");
	}

}
