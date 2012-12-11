package comandiTavolo;

import main.Tavolo;
import main.Utente;

public class ComandoDammiPreConto implements ComandoTavolo{

	@Override
	public void esegui(Tavolo tavolo, Utente utente) {
		if (utente.isAmministratore()) eseguiComandoDammiPreConto(tavolo, utente);
		else System.out.println("Non puoi eseguire questa operazione perchè non sei amministratore");
	}

	private void eseguiComandoDammiPreConto(Tavolo tavolo, Utente utente) {
		if (tavolo!=null){
			StringBuffer dammiPreConto = tavolo.dammiPreConto();
			System.out.println(dammiPreConto.toString());
		}
	}
}
