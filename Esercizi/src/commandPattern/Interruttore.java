package commandPattern;

public class Interruttore {

	public Interruttore() {
	}

	public void execute(Command command) {
		command.execute();
	}
}
