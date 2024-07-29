package javaLambdabasics_unit3;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceExample::printMessage);
		t.start();
	}
	public static void printMessage() {
		System.out.print("Hello mwssage");
	}

}
