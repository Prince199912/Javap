package OverLoading;

public class Test {
   public void m1(double b) {
	 System.out.println("double-arg"); 
   }
  /* public void m1(int i) {
	   System.out.println("int-arg");
   }*/
   public void m1(float f) {
	   System.out.println("float-arg");
   }
   public static void main(String[] args) {
	Test t=new Test();
	t.m1(0);
	t.m1(0.0);
	t.m1('a');
	t.m1(127);
	t.m1(123456789123l);
}
}
