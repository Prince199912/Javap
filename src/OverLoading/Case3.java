package OverLoading;

public class Case3 {
     public void m1(String s) {
    	 System.out.println("String Version");
     }
     public void m1(StringBuffer sb) {
    	 System.out.println("StringBuffer Version");
     }
	public static void main(String[] args) {
		Case3 c=new Case3();
		//c.m1(null);
		c.m1("Prince");
		c.m1(new StringBuffer("Prince"));

	}

}
