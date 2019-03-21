package chainOfResonsability;

public class RichiestaAumento {

	private double importoStipendio;
	private String motivoAumento;

	public RichiestaAumento(double importoStipendio, String motivoAumento) {
		this.importoStipendio = importoStipendio;
		this.motivoAumento = motivoAumento;
	}

	public double getImportoStipendio() {
		return importoStipendio;
	}

	public void setImportoStipendio(double importoStipendio) {
		this.importoStipendio = importoStipendio;
	}

	public String getMotivoAumento() {
		return motivoAumento;
	}

	public void setMotivoAumento(String motivoAumento) {
		this.motivoAumento = motivoAumento;
	}

}
