package visitor;

public class ConcreteVisitor implements Visitor{

	public void visit(Fattoria fattoria) {
		// TODO Auto-generated method stub
		System.out.println("Numero Animali Fattoria: " + fattoria.getNumeroAnimale());
	}

	public void visit(Gallina gallina) {
		// TODO Auto-generated method stub
		System.out.println("Numero Animali Gallina : " + gallina.getNumeroAnimale());
	}

	public void visit(Mucca mucca) {
		// TODO Auto-generated method stub
		System.out.println("Numero Animali Mucca : " + mucca.getNumeroAnimale());
	}

	public void visit(Pecora pecora) {
		// TODO Auto-generated method stub
		System.out.println("Numero Animali Pecora : " + pecora.getNumeroAnimale());
	}

}
