package thread;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	/**
	 * This is the main function. initializes a Queue of type MessageThreads
	 * 
	 * @param args holds the value String
	 */
	public static void main(String[] args) {
		Queue<MessageThreads> messages = new LinkedList<>();
		Queue<MessageThreads> toDequeue = new LinkedList<>();
		messages.add(new MessageThreads("Hello"));
		messages.add(new MessageThreads("My name is JavaBot."));
		messages.add(new MessageThreads("Nice to meet you!"));
		while (messages.size() > 0) {
			MessageThreads t = messages.poll();
			toDequeue.add(t);
			t.start();
			try {
				t.join();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		while (toDequeue.size() > 0) {
			MessageThreads t = toDequeue.poll();
			if (!t.isAlive()) {
				t.showStatus(t.getName());
			}
		}

		if (Thread.activeCount() == 1) {
			System.out.println("Threads terminated.");
		}
	}
}
