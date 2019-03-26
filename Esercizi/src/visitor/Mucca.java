package visitor;

public class Mucca implements AnimaliFattoria{

	public int numeroMucche = 10;

	public int getNumeroAnimale()
	{		
		return numeroMucche;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
