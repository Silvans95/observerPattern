package observerPattern.model;

public class PersonaObserver extends Observer {

	public PersonaObserver(Persona persona) {
		this.persona = persona;
		this.persona.attach(this);
	}

	@Override
	public void cambioNome() {
		System.out.println("hai cambiato nome in: " + persona.getNome());
	}

	@Override
	public void cambioCognome() {
		System.out.println("hai cambiato cognome in: " + persona.getCognome());
	}

}