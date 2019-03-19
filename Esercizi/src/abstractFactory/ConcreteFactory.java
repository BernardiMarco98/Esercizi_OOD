package abstractFactory;

public class ConcreteFactory extends AbstractFactory {

	Forma getForma(String tipoForma) {
		if (tipoForma == null) {
			return null;
		}
		if (tipoForma.equalsIgnoreCase("Rettangolo")) {
			return new Rettangolo();
		}
		if (tipoForma.equalsIgnoreCase("Quadrato")) {
			return new Quadrato();
		}
		return null;
	}

}
