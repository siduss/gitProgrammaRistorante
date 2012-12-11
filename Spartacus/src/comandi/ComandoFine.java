package comandi;

import main.Spartacus;
import main.Utente;

public class ComandoFine implements Comando{

	@Override
	public void esegui(Spartacus spartacus, Utente utente) {
		System.out.println("Programma terminato!");
		System.exit(0);		
	}

}
