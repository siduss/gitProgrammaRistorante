package main;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Spartacus {
	private String nome;
	private List<Utente> listaUtenti;
//	private List<Gruppo> listaGruppi;
//	private List<Sala> listaSale;
	private List<Tavolo> listaTavoli;
	private List<Voce> listaVoci;
//	private Calendar calendar;
//	private Date primoAccesso;
	
	public Spartacus(){
		this.nome = "Spartacus";
//		this.calendar =  Calendar.getInstance();
//		this.setPrimoAccesso(initDataAperturaAttivita(this.calendar)); 
	}
	
	public Spartacus(List<Utente> listaUtenti, List<Tavolo> listaTavoli, List<Voce> listaVoci){
		this.nome = "Spartacus";
		this.setListaUtenti(listaUtenti);
		this.listaTavoli = listaTavoli;
		this.listaVoci = listaVoci;
		
//		this.calendar =  Calendar.getInstance();
//		this.setPrimoAccesso(initDataAperturaAttivita(this.calendar));
	}

	private Date initDataAperturaAttivita(Calendar c) {
		//Questo metodo è chiamato solo dai costruttori
		Date d = c.getTime();
		c.setTime(d);
		return d;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tavolo> getListaTavoli() {
		return this.listaTavoli;
	}

	public void setListaTavoli(List<Tavolo> listaTavoli) {
		this.listaTavoli = listaTavoli;
	}

	public List<Voce> getListaVoci() {
		return this.listaVoci;
	}

	public void setListaVoci(List<Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}


//	public Date getPrimoAccesso() {
//		return this.primoAccesso;
//	}

//	private void setPrimoAccesso(Date dataAperturaAttivita) {
//		this.primoAccesso = dataAperturaAttivita;
//	}
	
	public List<Utente> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(List<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}

//	public List<Gruppo> getListaGruppi() {
//		return listaGruppi;
//	}
//
//	public void setListaGruppi(List<Gruppo> listaGruppi) {
//		this.listaGruppi = listaGruppi;
//	}
}
