package Lesson34;

import java.util.List;
import java.util.ArrayList;
public class Test {
   public static void main(String[] args) {
      List<Animal> ListOfAnimals = new ArrayList<>();
ListOfAnimals.add(new Animal(1));
ListOfAnimals.add(new Animal(2));


      List<Dog> ListOfDogs = new ArrayList<>();
      ListOfDogs.add(new Dog());
      ListOfDogs.add(new Dog());


test(ListOfAnimals);
test(ListOfDogs);


   }

   private static void test(List< ? extends Animal> list){
for(Animal animal : list){
   System.out.println(animal);
   animal.eat();

}

   }
}
