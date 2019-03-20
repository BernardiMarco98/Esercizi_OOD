package prototypePattern;

public class Client {

	public static void main( String arg[] ) throws CloneNotSupportedException 
	{
		ConcretePrototype obj1= new ConcretePrototype ();
		
		obj1.setName("Pippo");
		
		ConcretePrototype obj2 = (ConcretePrototype) obj1.clone();
		
		System.out.println("Personaggio 1 :" + obj1.getName());;
		System.out.println("Personaggio 2 :" + obj2.getName());;
	}
}
