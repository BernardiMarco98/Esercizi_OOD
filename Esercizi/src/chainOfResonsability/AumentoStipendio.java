package chainOfResonsability;

public abstract class AumentoStipendio {

	protected int stipendioBase = 1500;
	protected AumentoStipendio successivo;

	public void setSuccessor(AumentoStipendio successivo) {
		this.successivo = successivo;
	}

	abstract public void processRequest(RichiestaAumento request);
}
