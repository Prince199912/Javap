package constructors;

public class Test1 {
   
	  Test1() {
		this(10);
		System.out.println("No-arg Constructor");
	  }
	  Test1(int i){
		  this(10.5);
		  System.out.println("Int-arg Constructor");
	  }
	  Test1(double d){
		  System.out.println("Double-arg Constructor");
	  }
	public static void main(String[] args) {
		Test1 t1= new Test1();
		Test1 t2= new Test1(10);
		Test1 t3= new Test1(10.5f);
		Test1 t4= new Test1(10.5);
		Test1 t5= new Test1(10l);
	}
}
