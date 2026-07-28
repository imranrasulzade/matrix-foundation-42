package lesson8;

import lesson9.Animal;

public class Main {

    static void printGroupDetails(Group group) {
        System.out.println(group.name);
        System.out.println(group.subject);
        for (int i = 0; i < group.studentCount; i++){
            System.out.println(group.studentNames[i]);
        }
    }

    public static void main(String[] args) {


        int a = 5;
        Student s = new Student();
        s.name = "Huseyn";
        s.surname = "Mammadov";
        s.age = 15;


        Student s2 = new Student();
        s2.name = "Kanan";
        s2.surname = "Hasanov";
        s2.age = 18;


        Group group1 = new Group();
        group1.name = "Foundation 42";
        group1.instructorName = "Imran";
        group1.studentCount = 4;
        group1.subject = "Java";
        String[] names = {"Gulsen", "Xanim", "Esmer", "Narmin"};
        group1.studentNames = names;

        Group group2 = new Group();
        group2.name = "Android";
        group2.instructorName = "Hilal";
        group2.studentCount = 3;
        group2.subject = "Kotlin";
        String[] names1 = {"Ali", "Vali", "Messi", "Leo"};
        group2.studentNames = names1;

        printGroupDetails(group1);

        printGroupDetails(group2);



    }

}
