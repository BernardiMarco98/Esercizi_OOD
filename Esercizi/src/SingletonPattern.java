
public class SingletonPattern {

	private static SingletonPattern instance = new SingletonPattern();

	private SingletonPattern() {
		System.out.println("Singleton(): Initializing Instance");
		int x=0;
		System.out.println(x);	
	}

	public static SingletonPattern getInstance() {
		return instance;
	}

	public void doSomething() {
		System.out.println("Singleton is doing something");
	}
}
