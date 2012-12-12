package comandi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import main.ParserComandiTavolo;
import main.Spartacus;
import main.Tavolo;
import main.Utente;
import utility.Utility;

public class ComandoApriTavolo implements Comando {

	@Override
	public void esegui(Spartacus spartacus, Utente utente) {
		comandoApriTavolo(spartacus, utente);
	}

	private void comandoApriTavolo(Spartacus spartacus, Utente utente) {
		List<Tavolo> lt = spartacus.getListaTavoli();
		System.out.println("Inserisci il numero del tavolo: ");
		Scanner lineInput = new Scanner(System.in);
		int num_tavolo = lineInput.nextInt();
		
		Tavolo t = Utility.getTavolo(lt,num_tavolo);
		if (t!=null){
			t.setInUso(true);
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(reader);
			ParserComandiTavolo pct = new ParserComandiTavolo();
			try {
				int i = -1;
				while (i != 0 || t.isInUso()) {
					System.out.println("Sei dentro il tavolo: " + t.getNumeroTavolo() + ". Puoi eseguire queste operazioni");
					System.out.println(" (0) Esci dal tavolo"); // esce dal tavolo
					System.out.println(" (1) Prendi ordine del tavolo"); //prende l'ordine del tavolo
					System.out.println(" (2) Dammi pre-conto");
					System.out.println(" (3) Aggiungi un coperto");
					
//					System.out.println(" (4) Cancella voce/i del tavolo"); //cencella tutte le voci del tavolo
//					System.out.println(" (5) Rimuovi un coperto");
//					System.out.println(" (6) Dammi ordine del tavolo"); ////fa la stampa (a video) delle voci del tavolo con la quantita
//					System.out.println(" (7) Dammi conto");
//					System.out.println(" (8) Dammi fattura");
					
					i = Integer.parseInt(in.readLine());
					pct.parseCommand(i).esegui(t, utente);
				}
			t.setInUso(false);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				t.setInUso(false);
			}
		}
		else{
			System.out.println("Il tavolo non esiste");
		}
		
	}
}
