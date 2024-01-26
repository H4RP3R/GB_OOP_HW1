import java.time.LocalDate;

/**
 * Dog
 */
public class Dog extends Animal {
    public Dog(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can't fly!");
    }
}
