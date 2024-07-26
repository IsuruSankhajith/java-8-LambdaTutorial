package javalambdabasics;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String args[]) {
		Greeter greeter = new Greeter();
		
		//	Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting LambdaGreeting = ()-> System.out.print("Hello World");	
		
		 
		Greeting innerClassGreeting	= new Greeting() {
			public void perform() {
				System.out.println("Hello wolrd");
			}
		};
		
		//innerClassGreeting.perform();
		greeter.greet(()-> System.out.print("Hello World"));
		greeter.greet(innerClassGreeting);
	}
}








