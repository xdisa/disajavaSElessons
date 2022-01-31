import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
       //  if(age==10){
      //       System.out.println("ollololo SHCOLOTRON!!!");
      //   } else if(age==18){
      //       System.out.println("IN THE ARMY NOW!!! ");
      //   } else if(age==100){
      //       System.out.println("RIP"); //не логично использовать такой цикл тк у нас 1000 значений на переменную и куча условий для каждого значения, нужно использовать Switch
        switch(age){
            case 0 :
                System.out.println("рождение дебила");
                break;
            case 7 :
                System.out.println("школотрон");
                break;
            case 14 :
                System.out.println("малолетний дебил");
                break;
            case 16 :
                System.out.println("куплена подписка на тупичок");
                break;
            case 18 :
                System.out.println("IN THE ARMY NOW!!!!");
                break;
            default:
                System.out.println("ни одно из условий для малолетнего дебила не подошло, малолетний дебил - есть малолетний дебил");
         }
    }
}
