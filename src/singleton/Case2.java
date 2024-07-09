package singleton;

public class Case2 {
    private static Case2 c=null;
    public String s;
    private Case2() {
		s="String";
	}	
    public static Case2 getCase2() {
    	if(c==null)
    		c=new Case2();
    	return c;
    }
    public static void main(String[] args) {
		Case2 x=Case2.getCase2();
		Case2 y=Case2.getCase2();
		Case2 z=Case2.getCase2();
		x.s=(x.s).toUpperCase();
		System.out.println("String from x:"+x.s);
		System.out.println("String from y:"+y.s);
		System.out.println("String from z:"+z.s);
		z.s=(z.s).toLowerCase();
		System.out.println("String from x:"+x.s);
		System.out.println("String from y:"+y.s);
		System.out.println("String from z:"+z.s);
	}

}
