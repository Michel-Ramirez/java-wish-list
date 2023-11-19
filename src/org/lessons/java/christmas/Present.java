package org.lessons.java.christmas;

import java.util.List;

public class Present {

	private String presName;
	private String receiver;

	public Present(String presName, String receiver) {

		setPresName(presName);
		setReceiver(receiver);
	}

	public String getPresName() {
		return presName;
	}

	public void setPresName(String presName) {
		this.presName = presName;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	// METODO PER L'ORDINAMENTO RICEVENTE LA LISTA, CICLO E ORDINO
	public static void orderByPresName(List<Present> list) {
		for (Present present : list) {
			System.out.println(present.getPresName() + " -> " + present.getReceiver());
		}
	}

	public static void orderByReceiver(List<Present> list) {
		for (Present present : list) {
			System.out.println(present.getReceiver() + " -> " + present.getPresName());
		}
	}

	@Override
	public String toString() {
		return "Destinatario: " + getReceiver() + "\n" + "Regalo: " + getPresName();
	}

}
