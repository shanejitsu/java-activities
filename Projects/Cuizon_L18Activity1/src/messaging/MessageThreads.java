package messaging;

public class MessageThreads extends Thread {
	private String message;
	Messaging m;

	MessageThreads(String message, Messaging m) {
		this.message = message;
		this.m = m;
	}

	@Override
	public void run() {
		m.sendMessage(message);
	}

}
