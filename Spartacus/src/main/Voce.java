package main;

public class Voce {
	private String nome;
	private double prezzo;
	private String descrizione;
	private int quantita;
	private String notaLibera;
//	private Gruppo gruppoAppartenenza;
	
	public Voce(String nome, double prezzo){
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public Voce (Voce voce){
		this.nome = voce.getNome();
		this.prezzo = voce.getPrezzo();
		this.descrizione = voce.getDescrizione();
		this.quantita = voce.getQuantita();
		this.notaLibera = voce.getNotaLibera();
	}
	
//	public Voce(String nome, double prezzo, Gruppo gruppoAppartenenza){
//		this.nome = nome;
//		this.prezzo = prezzo;
//		this.gruppoAppartenenza = gruppoAppartenenza;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public String getNotaLibera() {
		return this.notaLibera;
	}
	
	public void setNotaLibera(String notaLibera) {
		this.notaLibera = notaLibera;
	}
}
