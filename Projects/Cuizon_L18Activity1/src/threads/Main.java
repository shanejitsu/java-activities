package threads;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Printer("Manuscript_Final.pdf"));
		Thread t2 = new Thread(new Printer("Manuscript_Final_Final.pdf"));

		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (Thread.activeCount() == 1) {
			System.out.println("\nThread has ended.");

			System.out.println(t1.getName() + " status: " + (t1.isAlive() ? "running" : "terminated"));

			System.out.println(t2.getName() + " status: " + (t2.isAlive() ? " running" : "terminated"));

		}
	}

}
