package visitor;

public class Pecora implements AnimaliFattoria{

	public int numeroPecore = 25;

	public int getNumeroAnimale()
	{		
		return numeroPecore;
	}
	
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
