package visitor;

public class Fattoria implements AnimaliFattoria{

	AnimaliFattoria[] elementiFattoria;
	
	public Fattoria()
	{
		elementiFattoria = new AnimaliFattoria[] {new Gallina(), new Mucca(), new Pecora()};
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		for(int i = 0; i < elementiFattoria.length; i++)
		{
			elementiFattoria[i].accept(visitor);
		}
		visitor.visit(this);
	}
	@Override
	public int getNumeroAnimale() {
		// TODO Auto-generated method stub
		int totaleAnimali = 0;
		
		for(int i = 0; i < elementiFattoria.length; i++)
		{
			totaleAnimali += elementiFattoria[i].getNumeroAnimale();
		}
		
		return totaleAnimali;
	}

}
