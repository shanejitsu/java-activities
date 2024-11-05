package abstract_and_interface;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee("Shane", 143, 25000);
		System.out.println("Full Time Employee: " + ft.calculatePay());
		ParttimeEmployee pt = new ParttimeEmployee("Denney", 420, 911.13, 250);
		System.out.println("Parttime Employee: " + pt.calculatePay());
		Contractor c = new Contractor("Cuizon", 911, 1420.50, 200);
		System.out.println("Contractor: " + c.calculatePay());
	}

}
