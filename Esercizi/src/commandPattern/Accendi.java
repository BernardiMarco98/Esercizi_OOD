package commandPattern;

public class Accendi implements Command {

	private Luce luce;

	public Accendi(Luce luce) {
		this.luce = luce;
	}

	public void execute() {
		luce.accendi();
	}
}
