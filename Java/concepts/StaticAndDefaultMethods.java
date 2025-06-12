package concepts;

// Interface with default and static method
interface BankAccount {
    default void printBalance() {
        System.out.println("Default: Printing the statement");
    }

    static void showTerms() {
        System.out.println("Static: Banks terms and conditions");
    }
}

class SavingsAccount implements BankAccount {
}

public class StaticAndDefaultMethods {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();

        acc.printBalance(); // Calls default method
        BankAccount.showTerms(); // Calls static method directly on interface and by reference we can't call static method
    }
}
