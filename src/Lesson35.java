interface ToEat {public void eat();}
//class Animal35  implements ToEat {

 //   @Override
   // public void eat() {
   //     System.out.println("eating...");
  //  }}
public class Lesson35 {
    public static void main(String[] args) {
    //    ToEat a1 = new Animal35();
     //   a1.eat();

        ToEat a2 = new ToEat() {
            @Override
            public void eat() {
                System.out.println("eating...");
            }
        };

       a2.eat();
    }
}


