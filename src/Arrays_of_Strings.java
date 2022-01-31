public class Arrays_of_Strings {
    public static void main(String[] args) {

        int[] num = new int[5];
        num[0]=10;
        String[] str = new String[3];
        str[0] = "dis";
        str[1] = "disq";
        str[2] = "disw";

     //   for(int i = 0; i< str.length;i++){
     //       System.out.println(str[i]);
     //   }
      for(String x:str){
          System.out.println(x);
      }
int[] num1 = {1,2,3};
      int sum = 0;
      for(int z:num1){
          //System.out.println(sum);
          sum += z;
          //System.out.println(sum);
      }
        System.out.println();
        System.out.println(sum);

       int value = 0;


    }
}
