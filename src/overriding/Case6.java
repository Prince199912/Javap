package overriding;

import java.io.IOException;

class P{
	public void m1() throws IOException{
		
	}
}
abstract class c extends P{
	public abstract void m1();
}
public class Case6 {

	public static void main(String[] args) {
		P p=new c() {
			
			@Override
			public void m1() {
				System.out.println("cccc");
				
			}
		};
		try {
			p.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
