
public class Arrays {
    public static void main(String[] args) {
int n = 10;// примитивный тип данных                // [10]
     //   char c = 'a'; // примитивный тип данных
      //  String s = "Hello"; //
      //  String s1 = new String("Hello");

       int [] numbers = new int[5];                 // numbers -> [array] ссылочный тип данных
          for(int i =0; i< numbers.length;i++){
              numbers[i]= i*10;

          }
         for(int i=0;i< numbers.length;i++){
             System.out.println(numbers[i]);
         }

        System.out.println();

          int [] numbers1 ={1,2,3};
         for(int i =0; i<numbers1.length;i++){
             System.out.println(numbers1[i]);
         }
    }

}
