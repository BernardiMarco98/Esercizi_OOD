package src;

public abstract class Videogame {

	public abstract void initialize();

	public abstract void start();

	public abstract void end();

	public final void play() {

		initialize();

		start();

		end();

	}
}
