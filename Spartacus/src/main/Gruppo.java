package main;

import java.util.ArrayList;
import java.util.List;

public class Gruppo {
	private List<Voce> listaVoci;
	private String nome;
	
	public Gruppo(String nome){
		this.listaVoci = new ArrayList<>();
		this.nome = nome;
	}
	
	public Gruppo(String nome, List<Voce> listaVoce){
		this.listaVoci = listaVoce;
		this.nome = nome;
	}

	public List<Voce> getListaVoce() {
		return listaVoci;
	}

	public void setListaVoce(List<Voce> listaVoce) {
		this.listaVoci = listaVoce;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeGruppo) {
		this.nome = nomeGruppo;
	}
	
	public void addVoce(Voce voce){
		this.listaVoci.add(voce);
	}
	
	public void removeVoce(Voce voce){
		this.listaVoci.remove(voce);
	}
}
