package messaging;

public class Main {
	public static void main(String[] args) {
		Messaging m = new Messaging();
		MessageThreads st1 = new MessageThreads("Hello", m);
		MessageThreads st2 = new MessageThreads("My name is JavaBot.", m);
		MessageThreads st3 = new MessageThreads("Nice to meet you!", m);

		try {
			st1.start();
			st1.join();
			st3.start();
			
			st3.join();
			st2.start();
			
			st2.join();
			
			System.out.println(st1.isAlive());
			System.out.println(st3.isAlive());
			System.out.println(st2.isAlive());
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		if(Thread.activeCount()==1) {
			System.out.println("Threads terminated.");
		}
	}
}
