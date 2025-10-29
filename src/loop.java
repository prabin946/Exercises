import java.util.Scanner;

public class loop {
    public  static  void loop(String [] args){
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //Ejercicio 2
        for (int i = 1; i <= 5; i++) {
            System.out.println("Fare sempre la feina de M3 de DAM");
        }

        //Ejerciicio 3
        int a5 = sc.nextInt();
        int a6 = sc.nextInt();

        for (int i = a5; i <= a6; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }

        //Ejerciicio 4
        a5 = sc.nextInt();
         a6 = sc.nextInt();
        for (int i = a5; i >= a6; i--) {
            System.out.println(i);
        }

        //Ejerciico 5
        a5 = sc.nextInt();
        //   int a6 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a5 ; i++) {
              a6= sc.nextInt();
            sum+=a6;
        }

        System.out.println(sum);

        // Ejercicio 6
         a5 = sc.nextInt();
        //   int a6 = sc.nextInt();
        sum = 0;
        for (int i = 0; i < a5 ; i++) {
              a6= sc.nextInt();
            if (a6%11==0){
                sum+=a6;
            }

        }

        System.out.println(sum);

        //Ejercicio 7
         a5 = sc.nextInt();
        //   int a6 = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

         sum = 0;
        for (int i = 0; i < a5 ; i++) {
              a6= sc.nextInt();
            if (a6>max){
                max = a6;
            }
            if (a6<min){
                min = a6;
            }

        }

        System.out.println(max);
        System.out.println(min);
    }
}
