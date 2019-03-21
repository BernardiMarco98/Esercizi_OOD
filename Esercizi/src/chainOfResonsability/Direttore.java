package chainOfResonsability;

public class Direttore extends AumentoStipendio {

	private double aumentoMassimo = 2 * stipendioBase;

	public void processRequest(RichiestaAumento request) {
		if (request.getImportoStipendio() < aumentoMassimo) {
			System.out.println("Il Direttore accetta la richiesta dell'aumento: " + request.getImportoStipendio()
					+ " -> " + request.getImportoStipendio() * 2);
			return;
		} else if (successivo != null) {
			successivo.processRequest(request);
		} else {
			System.out.println("Il suo stipendio è già alto, richiesta non accettabile");
		}
	}
}
