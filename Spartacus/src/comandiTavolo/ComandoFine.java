package comandiTavolo;

import main.Spartacus;
import main.Tavolo;
import main.Utente;

public class ComandoFine implements ComandoTavolo{

	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		System.out.println("Programma terminato!");
		System.exit(0);		
	}

}
