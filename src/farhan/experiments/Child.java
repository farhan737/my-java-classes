package farhan.experiments;

public class Child extends Parent {
	Child() {
		super.display();
		this.display();
	}
	void display() {
		System.out.println("display from Child");
	}

	public static void main(String[] args) {
		Child child = new Child();
	}
}
