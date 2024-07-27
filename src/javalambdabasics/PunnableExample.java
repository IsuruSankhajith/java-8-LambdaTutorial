package javalambdabasics;

public class PunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside the Runnable :");
			}
			
		}); 
		
		myThread.run();
		
		Thread myLambdaThread = new Thread(() ->System.out.println("Printed inside the Runnable :"));
		myLambdaThread.run();
		
		}
}
