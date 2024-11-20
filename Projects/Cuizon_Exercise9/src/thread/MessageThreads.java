package thread;

import java.util.LinkedList;

public class MessageThreads extends Thread {
	private String message;

	/**
	 * This is the class constructor that initializes the field message.
	 * 
	 * @param holds the value string
	 */
	MessageThreads(String message) {
		this.message = message;
	}

	/**
	 * Overrides the run() function of Thread.
	 * Calls the sendMessage function
	 * @return void
	 */
	@Override
	public void run() {
		sendMessage(message);
	}

	/**
	 * Displays the that the message parameter is sent
	 * 
	 * @param name holds the value String
	 * @return void
	 */
	void showStatus(String name) {
		System.out.println(name + " is sent.");
	}

	/**
	 * Displays the message that is sending. Waits for 1 second.
	 * 
	 * @param name holds the value String
	 * @return void
	 */
	void sendMessage(String message) {
		synchronized (this) {
			try {
				System.out.println("Sending message: \"" + message + "\"");
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

	}
}
