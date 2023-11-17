package org.lessons.java.christmas;

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

	@Override
	public String toString() {
		return "Destinatario: " + getReceiver() + "\n" + "Regalo: " + getPresName();
	}

}
