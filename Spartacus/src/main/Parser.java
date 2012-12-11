package main;

import comandi.Comando;
import comandi.ComandoApriTavolo;
import comandi.ComandoFine;
import comandi.ComandoInvalido;

public class Parser {
	public Comando parseCommand(int i){
		switch (i){
			case 0:
				return new ComandoFine();
			case 1:
				return new ComandoApriTavolo();
			default:
				return new ComandoInvalido();
		}
	}
}
