
public class Executor {

	public static void main(String[] args) {

		for (int x = 0; x < 5; x++) {
			SingletonPattern.getInstance();
			SingletonPattern.getInstance().doSomething();
		}
	}
}
