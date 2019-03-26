package visitor;

public class Gallina implements AnimaliFattoria{

	public int numeroGalline = 40;
	
	public int getNumeroAnimale()
	{	
		return numeroGalline;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	
}
