import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;





public class Lesson36 {


    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;


String path = separator+"Users"+separator+"disa"+separator+"Documents"+separator+"disajava"+separator+"text.txt";
File f = new File (path);

    Scanner s = new Scanner(f);
    String line = s.nextLine();
    String[] numString = line.split(" ");
    int [] num = new int[3];
    int count = 0;
    for(String x : numString){
        num[count++] = Integer.parseInt(x);

    }
        System.out.println(Arrays.toString(num));

    s.close();

//String input = s.nextLine();
//while(s.hasNextLine()){
 //   System.out.println(s.nextLine());
//}
//s.close();

//String f1 = String.valueOf(f);
     //   System.out.println(f1);
       // Scanner scnr = new Scanner(System.in);
       // System.out.print("enter text:");
      //  String input = scnr.nextLine();
      //  System.out.println(input);
    }
}
