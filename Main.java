import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Animal dog = new Dog("Sharik", LocalDate.of(2019, 10, 24), new Illness("Distemper"));
        animals.add(dog);

        Animal cat = new Cat("Barsik", LocalDate.of(2017, 05, 01), new Illness("Lichen"));
        animals.add(cat);

        Animal duck = new Duck("Donald", LocalDate.of(2021, 05, 06), new Illness());
        animals.add(duck);

        Animal penguin = new Penguin("Lolo", LocalDate.of(2018, 01, 01), new Illness());
        animals.add(penguin);

        Animal beaver = new Beaver("Justin", LocalDate.of(2015, 02, 07), new Illness());
        animals.add(beaver);

        Shark shark = new Shark("Sharp", LocalDate.of(2012, 11, 20), new Illness());
        animals.add(shark);

        for (Animal animal : animals) {
            System.out.println("------ " + animal.getType() + " ------");
            animal.go();
            animal.fly();
            animal.swim();
            System.out.println();
        }
    }
}