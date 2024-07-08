package overriding;

class Vegeta{
	 int x=888;
}
class Trunks extends Vegeta{
	int x=999;
}
public class Case9 {

	public static void main(String[] args) {
		Vegeta v=new Vegeta();
		System.out.println(v.x);
		Trunks t=new Trunks();
		System.out.println(t.x);
		Vegeta v1=new Trunks();
		System.out.println(v1.x);
		
	}

}
