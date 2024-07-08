package overriding;

class parent1{
	public Object m1() {
    	System.out.println("Object class return type");
    	return null;
    }
}
class child1 extends parent1{
	public String m1() {
    	System.out.println("String class return type");
    	return null;
    }
}
public class Case2 {
    	public static void main(String[] args) {
		parent1 p=new child1();
		p.m1();
	}

}
