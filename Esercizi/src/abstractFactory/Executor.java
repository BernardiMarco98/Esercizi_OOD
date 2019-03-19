package abstractFactory;

public class Executor {

	public static void main(String[] args) {
		AbstractFactory normalFactory = FactoryMaker.getFactory(false);
		AbstractFactory smussatoFactory = FactoryMaker.getFactory(true);
		
		Forma rettangolo = normalFactory.getForma("rettangolo");
		Forma rettangoloSmussato = smussatoFactory.getForma("rettangolo");
		
		Forma quadrato = normalFactory.getForma("quadrato");
		Forma quadratoSmussato = smussatoFactory.getForma("quadrato");
		
		rettangolo.disegna();
		rettangoloSmussato.disegna();
		
		quadrato.disegna();
		quadratoSmussato.disegna();
	}

}
