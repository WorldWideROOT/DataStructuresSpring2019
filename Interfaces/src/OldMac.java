import java.util.ArrayList;

public class OldMac {
    public static void main(String [] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Duck());
        animals.add(new Cow());
        animals.add(new Pig());

        for (Animal animal: animals) {
            printVerse(animal);
        }
    }

    public static void printVerse(Animal theAnimal) {
        String name = theAnimal.getName();
        String sound = theAnimal.getSound();
        String verse = "Old MacDonald had a farm, \n" +
                "E-I-E-I-O\n" +
                "And on his farm he had a " + name + ",\n" +
                "E-I-E-I-O\n" +
                "With a " + sound + ", " + sound + " here,\n" +
                "And a " +  sound + ", " + sound + " there,\n" +
                "Here a " + sound + ", there a " + sound +",\n" +
                "Everywhere a  " +  sound + ", " + sound + ",\n" +
                "Old Mac Donald had a farm,\n" +
                "E-I-E-I-O";
        System.out.println(verse + "\n");
    }
}