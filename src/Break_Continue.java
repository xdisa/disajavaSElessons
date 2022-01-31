public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            //можно написать if(){continue}
            if(i==15) break;
            System.out.println(i);
            i++;
         }

        for(int j=0;j<=15;j++){
             //можно написать с if(){continue}
             if(j%2==0) continue;

            System.out.println("Это не четное число: "+j);
        }
    }
}
