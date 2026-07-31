package lesson11;

public class Main {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.name = "Tom";
//        dog.age = 3;
//        dog.color = "Gray";
//        dog.gender = true;
//        dog.makeSound();
//
//        Cat cat = new Cat();
//        cat.name = "Jerry";
//        cat.age = 2;
//        cat.color = "Brown";
//        cat.gender = true;
//        cat.makeSound();
//
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

        Animal animal = new Dog();
        animal.name = "Salam";
        animal.color = "scfshfbsc";
        animal.makeSound();
        System.out.println(animal.toString());

        if (animal instanceof Dog dog)
             dog = (Dog) animal;




    }
}
