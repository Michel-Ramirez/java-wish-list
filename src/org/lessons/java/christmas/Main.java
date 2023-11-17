package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// DICHIARAZIONE DELLA LISTA
		List<Present> wishList = new ArrayList<>();

		// DICHIARAZIONE INPUT UTENTE PER IL PROGRAMMA
		int userComand = 0;

		// CICLO FIN QUANDO L'UTENTE NON DECIDE DI STOPPARE
		while (true) {

			System.out.println();

			// RICHIESTA ALL'UTENTE
			if (wishList.size() == 0) {
				System.out.println("Inserisci regalo alla lista: \n" + "1 - Si \n" + "2 - Stop programma");
			} else {
				System.out.println(
						"Inserisci regalo alla lista: \n" + "1 - Inserisci altro regalo \n" + "2 - Stop programma");
			}

			// ELABORO LA RICHIESTA
			String strIn = in.nextLine();
			userComand = Integer.valueOf(strIn);

			if (userComand == 2) {
				System.out.println("---------------------\n");
				System.out.println("| Programma terminato | \n");
				break;
			} else if (userComand != 1) {
				System.out.println("Scelta non valida! Digita una delle opzioni \n");
				continue;
			}

			// PRINT DOMANDE
			System.out.print("Per chi è il ragalo?: ");
			String receiver = in.nextLine();

			System.out.print("Digita regalo: ");
			String presName = in.nextLine();

			// PREPATO L'OGGETTO E PASSO I DATI
			Present p = new Present(presName, receiver);

			// AGGIUNGO ALLA LISTA L'OGGETTO
			wishList.add(p);

		}

		// STAMPO LA LISTA
		for (Present p : wishList) {
			System.out.println("Lunghezza Lista: " + wishList.size());
			System.out.println("Lista dei regali: \n" + p.getReceiver() + ": " + p.getPresName());
		}

		// ----- BONUS -------------

		System.out.println("-------------------------------------------\n");

		// SCELTA DELL'UTENTE PER L'ORDINAMENTO
		if (userComand == 2) {

			System.out.println("Scegli come odinare la lista: (Per nome del regalo o per Destinatario \n "
					+ "1 - Nome regalo \n" + "2 - Destinatario del regalo");

			String strOrder = in.nextLine();
			int order = Integer.valueOf(strOrder);

			if (order == 1) {

				orderByPresName(wishList);

			} else if (order == 2) {
				orderByReceiver(wishList);
			}

		}
	}

	// FUNZIONI PER L'ORDINAMENTO (PASSO LA LISTA E UTILIZZO IL METODO SORT DELLE
	// COLLECTIONS
	public static void orderByPresName(List<Present> wishList) {
		Collections.sort(wishList, Comparator.comparing(Present::getPresName));
	}

	public static void orderByReceiver(List<Present> wishList) {
		Collections.sort(wishList, Comparator.comparing(Present::getReceiver));
	}

}
