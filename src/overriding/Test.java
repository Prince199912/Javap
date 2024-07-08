package overriding;

class Parent{
	public void property() {
		System.out.println("Land+Cash+Gold");
	}
	public void marriage() {
		System.out.println("parent method");
	}
}
class Child extends Parent{
	public void marriage() {
		System.out.println("child method");
	}
}
public class Test {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.marriage();
        Child c=new Child();
        c.marriage();
        Parent p1=new Child();
        p1.marriage();
	}

}
