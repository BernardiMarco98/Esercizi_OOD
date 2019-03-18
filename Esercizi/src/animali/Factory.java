package animali;

public class Factory {

	public Animale getAnimale(String tipoAnimale) {
		if (tipoAnimale == null) {
			return null;
		}
		if (tipoAnimale.equalsIgnoreCase("Cane")) {
			return new Cane();
		}
		if (tipoAnimale.equalsIgnoreCase("Gatto")) {
			return new Gatto();
		}
		if (tipoAnimale.equalsIgnoreCase("Pecora")) {
			return new Pecora();
		}
		return null;
	}
}
