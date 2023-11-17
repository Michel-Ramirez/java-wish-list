package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<Present> wishList = new ArrayList<>();

		int userComand = 0;

		while (true) {

			System.out.println();

			if (wishList.size() == 0) {
				System.out.println("Inserisci regalo alla lista: \n" + "1 - Si \n" + "2 - Stop programma");
			} else {
				System.out.println(
						"Inserisci regalo alla lista: \n" + "1 - Inserisci altro regalo \n" + "2 - Stop programma");
			}

			String strIn = in.nextLine();
			userComand = Integer.valueOf(strIn);

			if (userComand == 2) {
				System.out.println("Programma terminato");
				break;
			} else if (userComand != 1) {
				System.out.println("Scelta non valida! Digita una delle opzioni \n");
				continue;
			}

			System.out.print("Per chi è il ragalo?: ");
			String receiver = in.nextLine();

			System.out.print("Digita regalo: ");
			String presName = in.nextLine();

			Present p = new Present(presName, receiver);

			wishList.add(p);

		}

		for (Present p : wishList) {
			System.out.println(p.getReceiver() + ": " + p.getPresName());
		}
	}

}
