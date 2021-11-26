package observerPattern.model;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private List<Observer> observers = new ArrayList<Observer>();
	private List<ObserverNuovi> osservatoriNuovi = new ArrayList<ObserverNuovi>();
	

	private String nome;
	private String cognome;
	private Integer eta;
	private Stato Sesso;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nome, String cognome, Integer eta, Stato sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		Sesso = sesso;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		notifyNome();
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
		notifyCognome();
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
		notifyEta();
	}

	public Stato getSesso() {
		return Sesso;
	}

	public void setSesso(Stato sesso) {
		Sesso = sesso;
		notifySesso();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void attach(ObserverNuovi observer) {
		osservatoriNuovi.add(observer);
	}
	
	public void notifyNome() {
		for (Observer observer : observers) {
			observer.cambioNome();
		}
	}

	public void notifyCognome() {
		for (Observer observer : observers) {
			observer.cambioCognome();
		}
	}

	public void notifyEta() {
		for (ObserverNuovi osservatoriNuovi : osservatoriNuovi) {
			osservatoriNuovi.cambioEta();
		}
	}

	public void notifySesso() {
		for (ObserverNuovi osservatoriNuovi : osservatoriNuovi) {
			osservatoriNuovi.cambioSesso();
		}
	}
}