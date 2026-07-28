package lesson9;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.name = "Tom";
        animal1.color = "Blue";
        animal1.age = 4;
        animal1.gender = false;

        Animal animal2 = new Animal();

        animal2.name = "Jerry";
        animal2.color = "Gray";
        animal2.age = 2;
        animal2.gender = true;

        Animal animal3 = new Animal("Puma", 5, "brown", false);

        Animal animal4 = new Animal();

        Animal animal5 = new Animal();
        animal5.name = "Tom";
        animal5.color = "Blue";
        animal5.age = 4;
        animal5.gender = false;

        System.out.println(ValidationUtility.isValidName(animal1.name));


//        animal1.print();
//        animal2.print();
//        animal3.print();
//        animal4.print();

        System.out.println(Animal.getCOUNT());

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.equals(animal5));

    }

}
