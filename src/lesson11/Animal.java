package lesson11;

import java.util.Objects;

public class Animal {
    public String name;
    public String color;
    public int age;
    public boolean gender;

    public Animal() {

    }

    public void makeSound() {
        System.out.println("...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && gender == animal.gender && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
