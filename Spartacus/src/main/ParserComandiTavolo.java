package main;

import comandiTavolo.ComandoAggiungiUnCopertoAlTavolo;
import comandiTavolo.ComandoDammiPreConto;
import comandiTavolo.ComandoFine;
import comandiTavolo.ComandoInvalido;
import comandiTavolo.ComandoTavolo;

public class ParserComandiTavolo {
	public ComandoTavolo parseCommand(int i){
		switch (i){
			case 0:
				return new ComandoFine();
//			case 1:
//				return new ComandoPrendiOrdineAlTavolo();
			case 2: 
				return new ComandoDammiPreConto();
			case 3:
				return new ComandoAggiungiUnCopertoAlTavolo();
			default:
				return new ComandoInvalido();
		}
	}
}
