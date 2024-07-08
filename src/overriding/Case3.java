package overriding;

class Gta{
	private void m1() {
		System.out.println("Good game with okay graphics");
	}
}
class GtaV extends Gta{
	private void m1() {
		System.out.println("Great game with nice graphics");
	}
}
public class Case3 {

	public static void main(String[] args) {
		Gta g=new GtaV();
		//g.m1();

	}

}
