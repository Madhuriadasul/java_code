package OOOPSConcept;
class Animals2{
	public void run() {
		System.out.println("animal is running");
	}
}
class Zebra extends Animals2{
	public void eat() {
		System.out.println("eating the zebra");
	}
}
class Tiger extends Zebra{
	public void put() {
		System.out.println("puting the Tiger");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Tiger t= new Tiger();
		t.put();
		t.eat();
		t.run();
	}

}
