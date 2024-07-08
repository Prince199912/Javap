package constructors;

public class Test2 {
    private String name;
    private int age;
    
	public Test2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("name="+this.name);
		System.out.println("age="+this.age);
	}

	public static void main(String[] args) {
		Test2 t=new Test2("Prince", 777);
		t.show();

	}

}
