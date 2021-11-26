package observerPattern.model;

public class PersonaObserverNuovi implements ObserverNuovi {

	protected Persona persona;

	public PersonaObserverNuovi(Persona persona) {
		this.persona = persona;
		this.persona.attach(this);
	}

	@Override
	public void cambioEta() {
		System.out.println("Adesso hai: " + persona.getEta());
	}

	@Override
	public void cambioSesso() {
		System.out.println("Adesso sei:" + persona.getSesso());
	}
}