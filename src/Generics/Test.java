package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        String animal2 = animals2.get(1);

        ///////////////////////
        List<String> animals3 = new ArrayList<>();
         
    }
}
