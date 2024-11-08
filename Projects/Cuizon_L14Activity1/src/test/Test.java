package test;

public class Test {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This value does nt exist in the array.");
		}
		
		System.out.println("____________________________");
		System.out.println("|                          |");
	 	System.out.println("---The rest of the code.---");
	 	System.out.println("|__________________________|");
	 }

}
