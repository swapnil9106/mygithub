//How many maximum frames in stack area
package Programs;

public class HowManyFrames {
	static int count = 0;
	public static void main(String[] args) {
		m1();

	}

	public static void m1() {
		System.out.println(count++);
		m1();
	}

}
