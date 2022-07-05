package GarbageCollection;

public class TestGarbage1 {
	public void finalized() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
		TestGarbage1 T1 = new TestGarbage1();
		TestGarbage1 T2 = new TestGarbage1();
		T1 = null;
		T2 = null;
		System.gc();

	}

}
