package utility;

import java.util.List;

import main.Spartacus;
import main.Tavolo;
import main.Voce;

public class Utility {

	public static Tavolo getTavolo(List<Tavolo> lt, int num_tavolo) {
		for (Tavolo t : lt) {
			if (t.getNumeroTavolo() == num_tavolo && !t.isInUso()) return t;
		}
		return null;
	}

	public static List<Voce> getMenu(Spartacus spartacus) {
		return spartacus.getListaVoci();
	}
}
