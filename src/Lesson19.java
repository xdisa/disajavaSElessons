public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Disa");
        human1.setAge(23);
        human1.getInfo();
    }
}

class Human{
    String name;
    int age;

    public void setName(String name){   //сеттер для поля name
        this.name = name;
    }

    public void setAge(int age){     ////сеттер для поля age
        this.age = age;
    }

    public String getName(){
        return name;

    }
    public int getAge() {
        return age;
    }
        public void getInfo(){

            System.out.println(name+" "+age);
        }

    }
