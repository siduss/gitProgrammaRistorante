//package comandiTavolo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import comandi.Comando;
//
//import utility.Utility;
//
//import main.Spartacus;
//import main.Tavolo;
//import main.Utente;
//import main.Voce;
//
//public class ComandoPrendiOrdineAlTavolo implements ComandoTavolo {
//
//	@Override
//	public void esegui(Tavolo tavolo, Utente utente) {
//		comandoPrendiOrdineAlTavolo(tavolo, utente);
//	}
//
//	private void comandoPrendiOrdineAlTavolo(Tavolo tavolo, Utente utente) {
//		Utility.getMenu(spartacus);
//		List<Tavolo> lt = spartacus.getListaTavoli();
//		System.out.println("Inserisci il numero del tavolo: ");
//		Scanner lineInput = new Scanner(System.in);
//		int num_tavolo = lineInput.nextInt();
//		
//		Tavolo t = Utility.getTavolo(lt,num_tavolo);
//		List<Voce> menu = spartacus.getListaVoci();
//		initOrdinazione(menu, utente, lineInput, t);
//	}
//
//	private void initOrdinazione(List<Voce> menu, Utente utente, Scanner lineInput, Tavolo t) {
//		if (t != null) {
//			t.setInUso(true);
//			int i = t.getCoperti();
//			System.out.println("Il tavolo è stato aperto da: "+ utente.getNome());
//			System.out.println("Coperti Totali: " + i);
//			if (i < 1) {
//				System.out.println("Inserisci i coperti: ");
//				i = lineInput.nextInt();
//				System.out.println("Coperti inseriti: " + i);
//				t.setCoperti(i);
//			}
//			
//			System.out.println("Scegli cosa vuoi ordinare. Questo è il menu: ");
//
//			for (Voce v : menu){
//				System.out.println(v.getNome());
//			}
//
//			String scelta = "";
//			i = 0;
//			List<Voce> lv = new ArrayList<Voce>();
//			while (!scelta.equals("salva")){
//				
//				System.out.println("Scrivi 'salva' per salvare e uscire dal tavolo");
//				System.out.println("Cosa vuoi scegliere? (inserisci il nome della voce)");
//				scelta = lineInput.next();
//				if (!scelta.equals("salva")) {
//					Voce voce = esisteVoce(scelta, menu);
//					if (voce != null) {
//						Voce v1 = new Voce(voce);
//						System.out.println("Quante "+ scelta+ " vuoi prendere? (inserisci la quantita in numero)");
//						i = lineInput.nextInt();
//						v1.setQuantita(i);
//						lv.add(v1);
//						System.out.println("Voce inserita nell'ordine");
//					} else
//						System.out.println("Quello che hai scelto non esiste nel menu");
//				}
//				
//				if (!scelta.equals("esci")){
//					
//				}
//			}
//			t.setOrdinazione(lv);
//			t.setInUso(false);
//		} else
//			System.out.println("Il tavolo non esiste");
//	}
//
//	private Voce esisteVoce(String scelta, List<Voce> menu) {
//		for (Voce v : menu) {
//			if (v.getNome().equals(scelta)) {
//				return v;
//			}
//		}
//		return null;
//	}
//}
