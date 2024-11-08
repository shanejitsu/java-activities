package test;

public class Main {

	public static void main(String[] args) {
//		GenericClass<Integer> genericInt = new GenericClass<>(5);
//		GenericClass<String> genericString = new GenericClass<>("hello");
//		GenericClass<Double> genericDouble = new GenericClass<>(10.5);
		Fruit f;
		Vegetable v;
		Basket<Fruit,Vegetable> fruitBasket = new Basket<>();
		Banana b = new Banana();
		System.out.println(fruitBasket.data.getName());
		
		
//		System.out.println(genericFruit);
//		System.out.println("generic int: " + genericInt.data);
//		System.out.println("generic String: " + genericString.data);
//		
//		GenericMethod generic = new GenericMethod();
//		
//		generic.<String>getGenericValue("3y0pH0wzx");
//		generic.<Integer>getGenericValue(555);	
//		generic.getGenericValue(555);
//		generic.getGenericValue("123456");
		
	}

}
