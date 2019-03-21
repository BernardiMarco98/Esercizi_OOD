package chainOfResonsability;

public class Responsabile extends AumentoStipendio {

	private double aumentoMassimo = 1.25 * stipendioBase;

	public void processRequest(RichiestaAumento request) {
		if (request.getImportoStipendio() < aumentoMassimo) {
			System.out.println("Il Responsabile accetta la richiesta dell'aumento: " + request.getImportoStipendio()
					+ " -> " + request.getImportoStipendio() * 1.25);
			return;
		} else if (successivo != null) {
			successivo.processRequest(request);
		}
	}

}
