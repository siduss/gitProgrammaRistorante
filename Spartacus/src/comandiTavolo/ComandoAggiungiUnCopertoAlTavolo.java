package comandiTavolo;

import main.Tavolo;
import main.Utente;

public class ComandoAggiungiUnCopertoAlTavolo implements ComandoTavolo {
	
	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		comandoAggiungiUnCopertoAlTavolo(tavolo, utente);
		
	}

	private void comandoAggiungiUnCopertoAlTavolo(Tavolo tavolo,Utente utente) {
		tavolo.aggiungiUnCoperto();
	}
}
