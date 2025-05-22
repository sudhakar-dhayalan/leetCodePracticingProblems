package interview_problems;

public class MethodReference {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        MethodReference hello = new MethodReference();

        // Method reference to instance method
        GreetService service = hello::sayHello;
        service.greet();  // Outputs: Hello!
    }
}


@FunctionalInterface
interface GreetService {
    void greet();
}