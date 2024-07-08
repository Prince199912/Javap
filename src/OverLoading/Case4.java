package OverLoading;

public class Case4 {
    public void m1(int i,float f) {
    	System.out.println("int-float version");
    }
    public void m1(float f,int i) {
    	System.out.println("float-int version");
    }
	public static void main(String[] args) {
		Case4 c=new Case4();
		c.m1(10, 0f);
		c.m1(5.678f, 10);
//		c.m1(0, 0);

	}

}
