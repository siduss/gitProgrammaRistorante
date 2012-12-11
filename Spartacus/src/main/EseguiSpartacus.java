package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EseguiSpartacus {
	private Parser parser;
	private Spartacus spartacus;

	public EseguiSpartacus() {
		this.parser = new Parser();

		Tavolo t1 = new Tavolo(1);
		Tavolo t2 = new Tavolo(2);
		Tavolo t3 = new Tavolo(3);
		List<Tavolo> tavoli = new ArrayList<Tavolo>();
		tavoli.add(t1);
		tavoli.add(t2);
		tavoli.add(t3);

		Utente u1 = new Utente("Patrizio", "pat,", tavoli);
		Utente u2 = new Utente("Mario", "pat,", tavoli);
		List<Utente> utenti = new ArrayList<Utente>();
		u1.setAmministratore(true);
		utenti.add(u1);
		utenti.add(u2);

		Voce v1 = new Voce("birra", 3.50);
		Voce v2 = new Voce("averna", 4);
		Voce v3 = new Voce("acqua", 1.20);

		List<Voce> menu = new ArrayList<Voce>();
		menu.add(v1);
		menu.add(v2);
		menu.add(v3);

		this.spartacus = new Spartacus(utenti, tavoli, menu);
	}

	public static void main(String[] argc) {
		EseguiSpartacus programma = new EseguiSpartacus();
		List<Utente> lu = programma.spartacus.getListaUtenti();
		Scanner lineInput = new Scanner(System.in);
		System.out.println("Puoi eseguire il login con questi utenti: ");
		for (Utente u : lu) {
			System.out.println(u.getNome());
		}
		System.out.println("Digita il nome di uno di questi utenti: ");
		String name = lineInput.nextLine();
		Utente u = programma.convalidaLogin(name, lu);
		if (u != null) {
			programma.esegui(u);
		}
	}

	private Utente convalidaLogin(String nomeUtente, List<Utente> lu) {
		for (Utente u : lu) {
			if (nomeUtente.equals(u.getNome())) {
				System.out.println("Login eseguito come " + u.getNome() + "!");
				return u;
			}
		}
		return null;
	}

	private void esegui(Utente u) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		try {
			int i = -1;
			while (i != 0) {
				System.out.println("Cosa vuoi fare?");
				System.out.println(" (0)  Esci");
				System.out.println(" (1)  Apri Tavolo");
				i = Integer.parseInt(in.readLine());
				parser.parseCommand(i).esegui(spartacus, u);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
