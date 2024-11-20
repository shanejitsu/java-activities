package messaging;

public class Messaging {
	synchronized void sendMessage(String message) {
		System.out.println("\nSending a message: \"" + message + "\"");

		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("\n\"" + message + "\" sent");
	}
}
