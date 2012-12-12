package comandiTavolo;

import main.Tavolo;
import main.Utente;

public class ComandoFine implements ComandoTavolo{

	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		tavolo.setInUso(false);
	}

}
