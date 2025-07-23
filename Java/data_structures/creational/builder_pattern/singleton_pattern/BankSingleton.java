package data_structures.creational.builder_pattern.singleton_pattern;

public class BankSingleton {
    private BankSingleton() {}
    private BankSingleton instance;

    private String initialVal = "Initial value - same for all instance " +
            "and if modified on one instance, reflects in other instance's as well";

    private static class Holder {
        private final static BankSingleton instance = new BankSingleton();
    }

    public static BankSingleton getInstance() {
        return Holder.instance;
    }

    public void setInitialVal(String val) {
        initialVal = val;
    }

    public void print() {
        System.out.println(initialVal);
    }
}
