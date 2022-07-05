package Interface;

interface print1 {
	void print();
}

interface show1 {

	void show();
}

class A7 implements print1, show1 {
	public void print() {
		System.out.println("print Hello");
	}

	public void show() {
		System.out.println("Show Hello");
	}

public static void main(String[] args) {
	A7 ob=new A7();
	ob.print();
	ob.show();
}
}