package constructors;

abstract class Car{
	Car(){
		System.out.println("Car is created");
	}
}
class Benz extends Car{
	void run() {
		System.out.println("Benz is running");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Benz b=new Benz();
		b.run();

	}

}
