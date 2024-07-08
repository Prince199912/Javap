package constructors;

public class Test {
    static int count=0;
    {
    	count++;
    }
    public Test() {
		// TODO Auto-generated constructor stub
	}
    public Test(int i) {
    	
    }
    public Test(double d) {
    	
    }
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(10);
		Test t3=new Test(10.5);
		Test t4= new Test();
		System.out.println("No. of Objects creates in class:"+count);

	}

}
