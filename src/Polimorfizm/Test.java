package Polimorfizm;

public class Test {
    public static void main(String[] args) {
//Animal a1 = new Dog();
//a1.eat();

//Dog d1 = new Dog();
//a1.eat();
//d1.eat();

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

test(a1);
        test(d1) ;
        test(c1);

        }
    public static void test(Animal a){

        a.eat();
    }
}
