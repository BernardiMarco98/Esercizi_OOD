package abstractFactory;

public class ConcreteSmussatoFactory extends AbstractFactory {

	Forma getForma(String tipoForma) {
		if (tipoForma == null) {
			return null;
		}
		if (tipoForma.equalsIgnoreCase("Rettangolo")) {
			return new RettangoloSmussato();
		}
		if (tipoForma.equalsIgnoreCase("Quadrato")) {
			return new QuadratoSmussato();
		}
		return null;
	}
}
