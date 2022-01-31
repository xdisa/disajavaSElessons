package Anon;

class Animal {
    public void eat(){
        System.out.println("im eating...");

    }
}

//class OtherAnimal extends Animal {
   // public void eat(){
   //     System.out.println("Outher animal is eating...");
   // }
//}


public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();

       // OtherAnimal oa1 = new OtherAnimal();
      //  oa1.eat();

        Animal a2 = new Animal() {
            public void eat(){
                System.out.println("Outher animal eating...");

            }
        };
        a2.eat();

    }
}
