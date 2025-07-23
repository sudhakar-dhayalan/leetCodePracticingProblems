package concepts;

// Uses: Bill Pugh Singleton (Recommended) to create Singleton class
public class SingletonClass {
    public static void main(String[] args) {
        System.out.println("Singleton");
        BankServiceSingleton bankService = BankServiceSingleton.getInstance();
        bankService.printSomething("Sachin");

        BankServiceSingleton bs = BankServiceSingleton.getInstance();
        bs.printSomething("Dravid");


        System.out.println();
        System.out.println("Non-Singleton");
        BankServiceNotSingleton bankService2 = new BankServiceNotSingleton();
        bankService2.printSomething("Sachin");

        BankServiceNotSingleton bs2 = new BankServiceNotSingleton();
        bs2.printSomething("Dravid");
    }
}

class BankServiceSingleton {
    private BankServiceSingleton() {}

    private static class Holder {
        private static final BankServiceSingleton INSTANCE = new BankServiceSingleton();
    }

    public static BankServiceSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private String name = ""; // validate SingletonByChangingValInOneInstance And PrintingInOtherInstance
    public void printSomething(String temp) {
        System.out.println("Name : " + name);
        name = temp;
    }
}

class BankServiceNotSingleton {
    public BankServiceNotSingleton() {}

    private String name = "if singleton instance, this value gets overriden, else this VALUE STAYS"; // validate SingletonByChangingValInOneInstance And PrintingInOtherInstance
    public void printSomething(String temp) {
        System.out.println("Name : " + name);
        name = temp;
    }
}
