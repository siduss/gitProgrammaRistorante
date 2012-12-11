package comandiTavolo;

import main.Tavolo;
import main.Utente;

public class ComandoInvalido implements ComandoTavolo{
	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		System.out.println("Devi inserire un numero tra le parentesi tonde");
	}
}
