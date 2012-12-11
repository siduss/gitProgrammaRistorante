//package main;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import javax.print.DocFlavor;
//import javax.print.PrintServiceLookup;
//
//public class Main {
//
//	public static void main(String[] argc) {
//		InitSpartacus programma = new InitSpartacus();
//		List<Utente> lu = programma.spartacus.getListaUtenti();
//		Scanner lineInput = new Scanner(System.in);
//		System.out.println("Puoi eseguire il login con questi utenti: ");
//		for (Utente u : lu) {
//			System.out.println(u.getNome());
//		}
//		System.out.println("Digita il nome di uno di questi utenti: ");
//		String name = lineInput.nextLine();
//		boolean eseguiLogin = programma.eseguiLogin(name, lu);
//		if (eseguiLogin) {
//			programma.esegui();
//		}
//		DocFlavor flavor;
//		PrintServiceLookup.lookupPrintServices(flavor, null);
//	}
//
//	private boolean eseguiLogin(String nomeUtente, List<Utente> lu) {
//		for (Utente u : lu) {
//			if (nomeUtente.equals(u.getNome())) {
//				System.out.println("Login eseguito!");
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private void esegui() {
//		InputStreamReader reader = new InputStreamReader(System.in);
//		BufferedReader in = new BufferedReader(reader);
//		try {
//			System.out.println("Cosa vuoi fare?");
//			System.out.println(" (0)  Esci");
//			System.out.println(" (1)  Prendi Ordinazione Al Tavolo");
//			int i;
//			i = Integer.parseInt(in.readLine());
//			parser.parseCommand(i).esegui(spartacus);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}
