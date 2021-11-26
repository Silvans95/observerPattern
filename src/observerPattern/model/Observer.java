package observerPattern.model;

public abstract class Observer {
	protected Persona persona;

	public abstract void cambioNome();
	public abstract void cambioCognome();

}