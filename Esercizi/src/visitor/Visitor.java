package visitor;

public interface Visitor {
	public void visit(Fattoria fattoria);

	public void visit(Gallina gallina);

	public void visit(Mucca mucca);

	public void visit(Pecora pecora);

}
