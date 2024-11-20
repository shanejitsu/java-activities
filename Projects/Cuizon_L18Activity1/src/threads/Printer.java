package threads;

public class Printer implements Runnable {
	String document;

	public Printer(String document) {
		this.document = document;
	}

	@Override
	public void run() {
		printDocuments();
	}

	void printDocuments() {
		synchronized (this) {
			try {
				System.out.println("Printing: " + document);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
		System.out.println("\n" + Thread.currentThread().getName()
				+ (Thread.currentThread().isAlive() ? " status: running\n" : " status: terminated\n"));
		System.out.println("Finished printing: " + document);
	}
}
