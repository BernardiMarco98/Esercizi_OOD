package commandPattern;

public class Spegni implements Command {

	private Luce luce;

	public Spegni(Luce luce) {
		this.luce = luce;
	}

	public void execute() {
		luce.spegni();
	}
}
