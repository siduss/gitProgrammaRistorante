package comandiTavolo;

import main.Tavolo;
import main.Utente;

public interface ComandoTavolo {
	public void esegui(Tavolo tavolo, Utente utente);
}
