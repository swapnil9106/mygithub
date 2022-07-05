
package Exception;
import java.io.*;
public class Test_1 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
	}

}
