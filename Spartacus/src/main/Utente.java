package main;

import java.util.List;

public class Utente {
	private String nome;
	private String cognome;
	private String password;
	private boolean amministratore;
	private boolean inUso;
	private List<Tavolo> listaTavoli;
	
	public Utente(String nome, String password, List<Tavolo> listaTavoli){
		this.nome = nome;
		this.password = password;
		this.listaTavoli = listaTavoli;
		this.setAmministratore(false);
		this.setInUso(false);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public String getPassword() {
		return password;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAmministratore() {
		return amministratore;
	}

	public void setAmministratore(boolean amministratore) {
		this.amministratore = amministratore;
	}

	public boolean isInUso() {
		return inUso;
	}

	public void setInUso(boolean inUso) {
		this.inUso = inUso;
	}
}
