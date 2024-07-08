package constructors;

public class Test3 {
    private String name;
    private int age;
    public Test3(String name) {
    	this(20);
    	System.out.println("Name of student:"+name);
	}
    public Test3(int age) {
		System.out.println("Age of Student:"+age);
	}
    public Test3() {
    	this("Prince");
    }
	public static void main(String[] args) {
		Test3 t=new Test3();
	}

}
