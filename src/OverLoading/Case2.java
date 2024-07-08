package OverLoading;

public class Case2 {
      public void m1(String s) {
    	  System.out.println("String version");
      }
      public void m1(Object o) {
    	  System.out.println("Object Version");
      }
      public static void main(String[] args) {
		Case2 c=new Case2();
		c.m1(null);
		c.m1("prince");
		c.m1(new Object());
	}
}
