package OverLoading;

public class Case5 {
    public void m1(int x) {
    	System.out.println("General method");
    }
    public void m1(char[] x) {
    	System.out.println("Char array method");
    }
    public void m1(int... x) {
    	System.out.println("Var-arg method");
    }
    
	public static void main(String[] args) {
		Case5 c=new Case5();
		c.m1();
		c.m1(10);
		c.m1(13,14,15);
		c.m1('a','b');

	}

}
