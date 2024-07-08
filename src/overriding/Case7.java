package overriding;
class Home{
	public static void m1() {
		System.out.println("Home method");
	}
}
class Garden extends Home{
	public static void m1() {
		System.out.println("Garden Method");
	}
}
public class Case7 {

	public static void main(String[] args) {
		Home h=new Garden();
		h.m1();

	}

}
