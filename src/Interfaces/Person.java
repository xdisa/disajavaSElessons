package Interfaces;

public class Person implements Info {




     public String name;




     public Person(String name) {
          this.name = name;
     }


     public void sayHello(){
          System.out.println("hello");
     }


    
     public void showInfo() {
          System.out.println("hello my name is"+this.name);

     }
}
