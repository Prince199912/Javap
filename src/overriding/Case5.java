package overriding;

abstract class Mother{
	public abstract void m1();
}
class daughter extends Mother{
	public void m1() {
		System.out.println("daughter type method");
	}
}
public class Case5 {

	public static void main(String[] args) {
      Mother m=new daughter();
      m.m1();

	}

}
