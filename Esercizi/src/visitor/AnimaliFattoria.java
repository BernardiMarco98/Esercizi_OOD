package visitor;

public interface AnimaliFattoria {

	public int getNumeroAnimale();
	
	public void accept(Visitor visitor);
}
