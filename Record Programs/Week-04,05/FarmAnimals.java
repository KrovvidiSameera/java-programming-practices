package javacore;
class FarmAnimal {
    String name;
    String place;
    String food;
    FarmAnimal() {
        name = "Unknown";
        place = "Farm";
        food = "Grass";
    }
    FarmAnimal(String name, String place, String food) {
        this.name = name;
        this.place = place;
        this.food = food;
    }
    void display() {
        System.out.println("Animal: " + name);
        System.out.println("Lives in: " + place);
        System.out.println("Eats: " + food);
    }
    void sound(String sound) {
        System.out.println("Sound: " + sound);
    }
    void sound(String sound, int times) {
        System.out.println("Sound: " + sound);
        System.out.println("Number of times: " + times);
    }
}
public class FarmAnimals {
    public static void main(String[] args) {
        FarmAnimal cow = new FarmAnimal(
                "Cow", "Cowshed", "Grass");

        FarmAnimal pig = new FarmAnimal(
                "Pig", "Pigsty", "Corn");

        FarmAnimal horse = new FarmAnimal(
                "Horse", "Stable", "Hay");

        cow.display();
        cow.sound("Moo");
        System.out.println();
        pig.display();
        pig.sound("Oink");
        System.out.println();
        horse.display();
        horse.sound("Neigh", 3);
    }
}
