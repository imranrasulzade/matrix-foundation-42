package lesson11;

public class Main {

    public void test(String a) {
        System.out.println(a);
    }

    public void test(int a) {
        System.out.println(a);
    }

    public void plus(int a, int b) {
        System.out.println(a + b);
    }

    public void plus(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void plus(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }


    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.name = "Tom";
//        dog.age = 3;
//        dog.color = "Gray";
//        dog.gender = true;
//        dog.makeSound();
//
//
//        Cat cat = new Cat();
//        cat.name = "Jerry";
//        cat.age = 2;
//        cat.color = "Brown";
//        cat.gender = true;
//        cat.makeSound();

//        Bird bird = new Bird();
//        bird.name = "pigon";
//        bird.age = 3;
//        bird.color = "red";
//        bird.gender = true;
//        bird.makeSound();
//
//
//        Author author = new Author();
//        author.name = "Gulsen";
//        author.surname = "Zeynalova";
//
//        Book book = new Book();
//        book.title = "Java";
//        book.author = author;
//        book.pageCount = 500;

//        Animal animal = new Dog();
//        animal.name = "Salam";
//        animal.color = "scfshfbsc";
//        animal.makeSound();
//        System.out.println(animal.toString());
//
//        if (animal instanceof Dog dog)
//             dog = (Dog) animal;


//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Animal animal = null;
//        animal = dog;
////        animal = cat;

//        Animal animal = new Dog();
//        animal.makeSound();
//        if (animal instanceof Dog dog) {
//            dog.hav();
//        }

//        Main main = new Main();
//        main.plus(1, 2);
//        main.plus(1, 3, 5);
//        main.plus(1, 4, 6, 9);
//
//        main.test(8);
//        main.test("A");


        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();
        Animal animal4 = new Puppy();

        Animal[] animals = {animal1, animal2, animal3, animal4};

//
//        for (Animal a : animals) {
//            a.makeSound();
//        }
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

    }
}
