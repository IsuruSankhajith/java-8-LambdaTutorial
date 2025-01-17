package javalambdabasics_unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = {1, 2, 3, 4, 5};
		int key = 2;

		// Using a lambda expression as the BiConsumer with exception handling
		process(someNumbers, key,wrapperLambda((v, k) -> System.out.println(v + k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				System.out.print("Exception caught in wrapped lambda");
			}
			
		};
		
	}
}
