package abstractFactory;

public class FactoryMaker {

	public static AbstractFactory getFactory(boolean isSmussato)
	{
		if(isSmussato)
		{
			return new ConcreteSmussatoFactory();
			
		}else {
			return new ConcreteFactory();
		}
		
	}
}
