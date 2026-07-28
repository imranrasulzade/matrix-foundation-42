package lesson9;

public class Animal {
    String name;
    int age;
    String color;
    boolean gender;
    private static int COUNT;

    public void print() {
        System.out.println("Name:" + this.name + ", Color:" + this.color + ", Age:"
                + this.age + ", Gender:" + (this.gender ? "Female" : "Male"));
    }



    boolean equals(Animal animal) {
        return this.name.equals(animal.name) && this.color.equals(animal.color) && this.age == animal.age
                && this.gender == animal.gender;
    }

    public Animal() {
    }

    Animal(String name, int age, String color, boolean gender) {
        incrementCount();
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
    }


//    Animal(String name) {
//        this.name = name;
//    }

     public static int getCOUNT(){
        return COUNT;
    }

    private void incrementCount() {
        COUNT++;
    }


}
