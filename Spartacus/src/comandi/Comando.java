package comandi;

import main.Spartacus;
import main.Utente;

public interface Comando {
	public void esegui(Spartacus spartacus, Utente utente);
}
