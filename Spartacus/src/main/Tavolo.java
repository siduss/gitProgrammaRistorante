package main;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {
	private int coperti;
	private int numero_tavolo;
	private List<Voce> ordine;
	private boolean inUso;
	private Utente utente;

	public Tavolo(int numeroTavolo){
		this.coperti = 0;
		this.numero_tavolo = numeroTavolo;
		this.ordine = new ArrayList<Voce>();
		this.inUso = false;
	}
	
	public boolean isInUso() {
		return this.inUso;
	}
	
	public void setInUso(boolean inUso) {
		this.inUso = inUso;
	}
	
	public int getNumeroTavolo() {
		return numero_tavolo;
	}

	public void setNumeroTavolo(int numero_tavolo) {
		this.numero_tavolo = numero_tavolo;
	}
	
	public List<Voce> getOrdine(){
		return this.ordine;
	}

	public int getCoperti() {
		return this.coperti;
	}

	public void setCoperti(int coperti) {
		this.coperti = this.coperti + coperti;
	}
	
	public String rimuoviUnCoperto(){
		if (this.coperti > 0){
			this.coperti--;
			return "Rimosso un coperto";
		}
		return "";
	}
	
	public String aggiungiUnCoperto(){
		this.coperti++;
		return "Aggiunto un coperto";
	}
	
	public void prendiOrdine(Voce voce){
		this.ordine.add(voce);
	}
	
	public Voce rimuoviVoce(Voce voce){
//		TODO è possibile solo dall'amministratore
		this.ordine.remove(voce);
		return voce;
	}
	
	public List<Voce> rimuoviVoci(Voce voce){
		/*Rimuove tutte le voci con lo stesso nome che sono nella lista ordine*/
//		TODO è possibile solo dall'amministratore
		List<Voce> o = this.ordine;
		String na; //nome attuale
		String nv = voce.getNome();
		Voce v;
		List<Voce> lv = new ArrayList<Voce>();
		for (int i=0; i<o.size(); i++){
			v = o.get(i);
			na = v.getNome();
			if (na.equals(nv)){
				lv.add(v);
				o.remove(i);
				i--;
			}
		}
		this.ordine = o;
		return lv;
	}

	public void prendiOrdine(List<Voce> lv) {
		for (Voce v : lv){
			this.ordine.add(v);
		}
	}
	
	public void rimuoviOrdine(List<Voce> lv) {
//		TODO è possibile solo dall'amministratore
//		TODO DA TESTARE
		for (Voce v : lv){
			this.ordine.remove(v);
		}
	}
	
	public List<Voce> modificaOrdineMenoUno(){
		/*TODO è possibile solo dall'amministratore
		 * Questo metodo modifica l'ordine sul tavolo
		 *quindi dalla lista degli ordini farà un -1 sulla voce selezionata. se la voce
		 *è uguale a 0 cancella la voce
		 *ritorna la lista delle voci che hanno subito variazioni 
		 * */
		return null;
	}
	
	public List<Voce> modificaOrdinePiuUno(){
		/*TODO è possibile solo dall'amministratore
		 * Questo metodo modifica l'ordine sul tavolo
		 *quindi dalla lista degli ordini farà un +1 sulla voce selezionata.
		 *ritorna la lista delle voci che hanno subito variazioni 
		 * */
		return null;
	}
	
	public void modificaOrdine(List<Voce> lv){
//		TODO è possibile sono dall'amministratore
	}
	
	public void trasferisciTavolo(Tavolo tavolo_sorgente, Tavolo tavolo_target){
		List<Voce> os = tavolo_sorgente.getOrdine(); //os=ordine Sorgente
		
		tavolo_target.prendiOrdine(os);
		tavolo_sorgente.rimuoviOrdine();
	}
		
	public StringBuffer dammiPreConto() {
		StringBuffer sb = new StringBuffer();
		sb.append("Tavolo: " +numero_tavolo+ " \n");
		sb.append("Coperti: " +coperti + "\n");
		List<Voce> o = this.ordine;
		String n;
		int q;
		double p;
		double totale = 0;
		for (Voce v : o){
			n = v.getNome();
			q = v.getQuantita();
			p = v.getPrezzo();
			double cv = q*p; //cv: costo voci
			totale = totale + cv; //pc: preConto
			sb.append(q+ " " +n+ " " +cv+ "\n");
		}
		sb.append("Totale a pagare: " +totale+ "€ \n");
		if (this.coperti > 1) sb.append("Totale a pagare a persona: " +totale/this.coperti+ "€\n");
		sb.append("Non valido ai fini fiscali");
		return sb;
	}
	
	public StringBuffer dammiPreContoConSconto(int sconto){
		StringBuffer sb = new StringBuffer();
		sb.append("Tavolo: " +numero_tavolo+ " \n");
		sb.append("Coperti: " +coperti + "\n");
		List<Voce> o = this.ordine;
		String n;
		int q;
		double p;
		double totale = 0;
		for (Voce v : o){
			n = v.getNome();
			q = v.getQuantita();
			p = v.getPrezzo();
			double cv = q*p; //cv: costo voci
			totale = totale + cv; //pc: preConto
			sb.append(q+ " " +n+ " " +cv+ "\n");
		}
		double s = totale*sconto/100; //s=sconto
		double ts = totale-s; //ts=totale scontato
		
		sb.append("Sconto del: " +sconto+ "% = " + s+ "€\n");
		if (this.coperti > 1) sb.append("Totale a pagare a persona: " +ts/this.coperti+ "€\n");
		sb.append("Totale a pagare: " +ts+ "€ \n");
		sb.append("Non valido ai fini fiscali\n");
		return sb;
	}

	/*Rimuove tutto l'ordine del tavolo e restituisce la lista delle voci rimosse*/
	public List<Voce> rimuoviOrdine() {
//		TODO è possibile solo dall'amministratore
		List<Voce> o = this.ordine;
		List<Voce> l = new ArrayList<Voce>();
		Voce v;
		for (int i=0; i<o.size(); i++){
			v = o.get(i);
			l.add(v);
			o.remove(v);
			i--;
		}
		this.ordine=o;
		return l;
	}

	public List<Voce> setOrdinazione(List<Voce> listaVoci) {
		List<Voce> lv = new ArrayList<Voce>();
		for (Voce v : listaVoci){
			lv.add(v);
			this.ordine.add(v);
		}
		return lv;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	public Utente getUtente(){
		return this.utente;
	}
}
