package constructors;

public class Test5 {
    Test5() {
		System.out.println("default constructor");
	}
    Test5(int i){
    	this();
    	System.out.println("parameterized constructor");
    }
	public static void main(String[] args) {
		Test5 t=new Test5(10);
	
	}

}
