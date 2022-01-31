package Interfaces;

public class Test {

    public static void main(String[] args) {


        Animal a1 = new Animal(5);
        Person p1 = new Person("Bob");
        a1.sleep();

        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

info1.showInfo();
info2.showInfo();

outputInfo(info2);
        outputInfo(info1);

    }

    public static void outputInfo(Info info){
info.showInfo();

    }
}
