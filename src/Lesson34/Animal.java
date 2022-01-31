package Lesson34;

public class Animal {
    private int id;


    public Animal(){

    }

    public Animal(int id){
        this.id=id;

    }
    public String ToString(){
        return String.valueOf(id);

    }

    public  void eat(){
        System.out.println("animal is eating");
    }
}
