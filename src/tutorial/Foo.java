package tutorial;

public class Foo {
	private int number;
	Foo(int i){
		number = i;
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int i){
		number = i;
	}
	public static void main(String[] args){
		System.out.println("Creating myFoo of the object Foo");
		Foo myFoo = new Foo(5);
		System.out.println("Number set to myFoo.number = " + myFoo.getNumber());
		myFoo.setNumber(10);
		System.out.println("Used the getter and the setter of the class to reset the number saved in Foo.number variable");
		System.out.println("Set the new number to: " + myFoo.getNumber());
	}
}
