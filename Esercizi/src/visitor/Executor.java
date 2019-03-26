package visitor;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fattoria fattoria = new Fattoria();
		
		fattoria.accept(new ConcreteVisitor());
	}

}
