package singleton;

public class Case1 {
    private static Case1 c=null;
    public String s;
    private Case1() {
		s="String";
	}	
    public static Case1 getInstance() {
    	if(c==null)
    		c=new Case1();
    	return c;
    }
    public static void main(String[] args) {
		Case1 x=Case1.getInstance();
		Case1 y=Case1.getInstance();
		Case1 z=Case1.getInstance();
		System.out.println("Hashcode of x:"+x.hashCode());
		System.out.println("Hashcode of y:"+y.hashCode());
		System.out.println("Hashcode of z:"+z.hashCode());
		if(x==y && y==z) {
			System.out.println("Three Objects point to same memory location on heap");
		}
		else {
			System.out.println("Objects are not pointing to same location");
		}
	}

}
