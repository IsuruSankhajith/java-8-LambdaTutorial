package javalambdabasics_unit2;

public class ThisReferenceExample {
    public void doprocess(int i, Process p) {
        p.process(i);
    }
	
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        
        thisReferenceExample.doprocess(10, i -> {
            System.out.println("Value of i is " + i);
            // You cannot use 'this' in this context because it refers to the outer class, not the lambda expression
        });
    }
}

interface Process {
    void process(int i);
}
