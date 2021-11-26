package observerPattern;

import observerPattern.model.Persona;
import observerPattern.model.PersonaObserver;
import observerPattern.model.PersonaObserverNuovi;
import observerPattern.model.Stato;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Persona persona = new Persona("SILVANO", "PALONI", 26, Stato.MASCHIO);

		new PersonaObserver(persona);
		new PersonaObserverNuovi(persona);

		System.out.println();
		persona.setNome("Umberto");
		System.out.println();
		persona.setNome("Vincenzo");
		persona.setCognome("Pipitone");
		System.out.println();
		persona.setEta(27);
		System.out.println();
		persona.setNome("Anna");
		persona.setCognome("Olivieri");
		persona.setEta(30);
		persona.setSesso(Stato.FEMMINA);
		System.out.println();
	}
}