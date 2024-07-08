package statics;

class Parent4 { 
    static final int a = 1; 
    static
    { 
        System.out.println( 
            "Inside static block of Parent class"); 
        System.out.println("a = " + a); 
    } 
} 
class Child4 extends Parent4 { 
    static final int b = 2; 
    static
    { 
        System.out.println( 
            "Inside static block of Child class"); 
        System.out.println("b = " + b); 
    } 
} 
public class Sta {
 public static void main(String[] args) {
	 System.out.println(Child4.a); 
     System.out.println(Child4.b);
}
}
