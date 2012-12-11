package comandiTavolo;

import main.Tavolo;
import main.Utente;

public class ComandoRimuoviUnCopertoAlTavolo implements ComandoTavolo{
	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		comandoRimuoviUnCopertoAlTavolo(tavolo, utente);
		
	}

	private void comandoRimuoviUnCopertoAlTavolo(Tavolo tavolo,Utente utente) {
		tavolo.rimuoviUnCoperto();
	}
}
