package interview_problems;

public class FinallyException {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            throw new RuntimeException("Exception from try");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("In finally block");
            throw new RuntimeException("Exception from finally");
        }
    }
}

