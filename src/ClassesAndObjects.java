public class ClassesAndObjects {
    public static void main(String[] args) {
Person person1 = new Person();//объект класса Person
//person1.name = "Disa";
//person1.age = 23;
        Person person2 = new Person();
       // person2.name = "Sascha";
       // person2.age = 20;

        person1.skolkoDoPensii();
        int years1 = person1.skolkoDoPensii1();
        //System.out.println(person1.name + " этому человеку " + years1 + "лет до пенсии");
        //System.out.println("My name is - "+" "+person1.name +" "+"my age is "+" "+person1.age);

        person1.setName("disa");
        person1.setAge(23);
        System.out.println("выводим значение в psvm из приватного поля: "+person1.getName());
        System.out.println("выводим значение в psvm из приватного поля: "+person1.getAge());
    }


}
class Person{
    //у класса могут быть:
    // 1. данные(поля)
   // 2. Действие , которое может совершать(методы)

   private String name; //поле класса Person
    private int age;//поле класса Person

public void setName(String userName){
    if(userName.isEmpty()){
        System.out.println("error");
    } else {
        name = userName;

    }
}


public String getName(){
    return name;
}
    public void setAge(int userAge){
    if(userAge<0){
        System.out.println("error");
    }else{

        age = userAge;}
    }
    public int getAge(){

        return age;
    }

    //м
    // етод для представления
    void speak() {
        System.out.println("меня зовут - " + " " + name + " " + "мне " + " " + age + "лет");
    }

    //ебанутый человек представляется 3 раза - вот метод для этого
    void speakX3(){
        for(int i = 0; i<3; i++){
            System.out.println("меня зовут - " + " " + name + " " + "мне " + " " + age + "лет");
        }
    }
    //пустой метод , ниче не возвращает
void skolkoDoPensii(){
        int years = 65 -age;
    System.out.println("кол-во лет до пенсии : "+years);
}
    //метод возвращает переменную int
    int skolkoDoPensii1(){
        int years = 65 -age;
       return years;
    }
void setName(String userName, int x){
        name = userName;
        age = x;

}
}