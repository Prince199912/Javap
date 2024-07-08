package overriding;

class Goku{
	public void m1(int...x ) {
		System.out.println("Goku here");
	}
}
/*class Gohan extends Goku{
	public void m1(int x) {
		System.out.println("Gohan here");
	}
}*/
class Gohan extends Goku{
	public void m1(int...x ) {
		System.out.println("Gohan here");
	}
}

public class Case8 {

	public static void main(String[] args) {
		Goku g=new Gohan();
		g.m1(10);

	}

}
