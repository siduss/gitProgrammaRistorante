package comandi;

import main.Spartacus;
import main.Utente;

public class ComandoInvalido implements Comando{
	@Override
	public void esegui(Spartacus spartacus, Utente utente) {
		System.out.println("Devi inserire un numero tra le parentesi tonde");
	}
}
