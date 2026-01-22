package exam2;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Sheep();
        animals[1] = new Horse();
        animals[2] = new Goat();
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
    }
}
