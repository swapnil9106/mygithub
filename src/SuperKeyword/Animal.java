// super is used refer immediate parent class instance variable
package SuperKeyword;

class Animal {
	String color = "White";
}

class Dog extends Animal {
	String color = "Black";

	void printColor() {
		System.out.println(color);// print color of Dog class
		System.out.println(super.color);// print color of Animal class
	}
}

class TestSuper {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}

}
