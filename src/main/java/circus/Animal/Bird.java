package circus.Animal;

public abstract class Bird extends Animal {
    // does not need speak() because abstract relinquishes responsibility
    public void fly() {
        System.out.println("Whee ...");
    }
}
