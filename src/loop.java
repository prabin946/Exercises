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

        //Ejercicio 8
         a5 = sc.nextInt();
         a6 = sc.nextInt();
         max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

         sum = 1;
        for (int i = 1; i <=a6 ; i++) {

            sum*=a5;
        }
        System.out.println(sum);

        //Ejercicio 9
         a5 = sc.nextInt();
         a6 = sc.nextInt();
        sum = 0;
        for (int i = 1; i <=a5 ; i++) {
            sum+=a6;
        }
        System.out.println(sum);

        //Ejercicio 10
         a5 = sc.nextInt();

        for (int i = 1; i <=a5 ; i++) {
            System.out.print("*");
        }

        //Ejerciciio 11
         a5 = sc.nextInt();

        for (int i = 1; i <=a5 ; i++) {
            for (int j = 0; j <=a5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ejercicio 12
         a5 = sc.nextInt();

        for (int i = 1; i <=a5 ; i++) {
            for (int j = 1; j <=a5 ; j++) {
                if (i ==1 || i==a5 || j==1 || j==a5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Ejercicio 13
         a5 = sc.nextInt();

        for (int i = 1; i <=a5 ; i++) {
            for (int j = 1; j <=a5 ; j++) {
                if (i ==j || j==a5-i+1 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Ejercicio 14
         a5 = sc.nextInt();

        for (int j = 1; j <=a5 ; j++) {
            if (a5%j==0){
                System.out.println(j);
            }
        }
        //Ejercicio 15
         a5 = sc.nextInt();
        boolean isprime = true;
        int divisor = 2;
        for (int j = 2; j <=a5 ; j++) {
            if (a5<=1){
                isprime=true;
            }else {
                if (a5%j==0){
                    isprime=false;
                    break;
                }
            }

        }
        if (isprime){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }

        //Ejercicio 16
         a5 = sc.nextInt();
        int copy = a5;
        int c = a5 % 10;       // last digit
        a5 = a5 / 10;           // remove last digit

        int b = a5 % 10;       // middle digit
        int a = a5 / 10;       // first digit

        // calculate sum of cubes
        int result = (a * a * a) + (b * b * b) + (c * c * c);

        if (result == copy) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //Ejercicio 17
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <=num1/2 ; i++) {
            if (num1%i==0){
                sum1+=i;
            }
        }
        for (int i = 1; i <=num2/2 ; i++) {
            if (num2%i==0){
                sum2+=i;
            }
        }
        if (sum1==num2 && sum2==num1){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //Ejercicio 18
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            reversed = reversed * 10 + digit;
            System.out.println(reversed);
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //Ejercicio 19
         num = sc.nextInt();

        int resultado= 2;

        while (num > 1) {
            if (num % resultado == 0) {
                System.out.print(resultado+" ");
                num /= resultado;
            } else {
                resultado++;
            }
        }
        //Ejercicio 20
        int N = sc.nextInt();  // the number
        int X = sc.nextInt();  // the digit to count
        int count = 0;

        while (N != 0) {
            int digit = N % 10;   // extract last digit
            if (digit == X) {
                count++;
            }
            N = N / 10;           // remove the last digit
        }

        System.out.println(count);

        //Ejercicio 21
        int previous = sc.nextInt();  // first number
        boolean found = false;

        while (true) {
            int current = sc.nextInt();

            if (current == 0) {
                break;  // stop reading numbers
            }

            if (current == previous) {
                found = true;
                break;  // we can stop early, we already found two equal numbers
            }

            previous = current;  // update previous for next comparison
        }

        if (found) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //Ejercicio 22 Scrabble
        Scanner myObj = new Scanner(System.in);
        String first = myObj.nextLine().toUpperCase();
        int puntos = 0;

        for (int i = 0; i < first.length() ; i++) {
//            System.out.println(test.charAt(i));
            char caracter = first.charAt(i);
//            switch (caracter){
//                case  'A'+'E'+'I' -> puntos++;
//            }
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter =='U' || caracter == 'L' || caracter=='N' || caracter=='R'||caracter=='S'||caracter=='T') {
                puntos++;
            } else if (caracter == 'D' || caracter == 'G') {
                puntos += 2;
            } else if (caracter== 'B' || caracter=='C' || caracter=='M'|| caracter=='P' ) {
                puntos += 3;
            } else if (caracter=='F' || caracter=='H' || caracter=='V' || caracter=='W' || caracter=='Y') {
                puntos+=4;
            } else if (caracter=='K') {
                puntos+=5;
            } else if (caracter=='J'|| caracter=='X') {
                puntos+=8;
            } else if (caracter=='Q'|| caracter=='Z') {
                puntos+=10;
            }

        }
        System.out.println(puntos);

        // Gràfic coronavirus
        int moltGreu = 0;
        int greu = 0;
        int normal = 0;
        int lleu = 0;
        int moltLleu = 0;

        while (true) {
            int casos = sc.nextInt();
            if (casos == -1) {
                break;
            }

            if (casos >= 200) {
                moltGreu++;
            } else if (casos >= 150) {
                greu++;
            } else if (casos >= 100) {
                normal++;
            } else if (casos >= 50) {
                lleu++;
            } else {
                moltLleu++;
            }
        }


        System.out.print("MG: ");
        for (int i = 0; i < moltGreu; i++) System.out.print("#");
        System.out.println();

        System.out.print("GR: ");
        for (int i = 0; i < greu; i++) System.out.print("#");
        System.out.println();

        System.out.print("NO: ");
        for (int i = 0; i < normal; i++) System.out.print("#");
        System.out.println();

        System.out.print("LL: ");
        for (int i = 0; i < lleu; i++) System.out.print("#");
        System.out.println();

        System.out.print("ML: ");
        for (int i = 0; i < moltLleu; i++) System.out.print("#");
        System.out.println();
        //MCD_
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int mcd=1;
         min = Math.min(num3, num4);

        for (int i = 1; i <= min; i++) {

            if (num3 % i == 0 && num4 % i == 0) {
                mcd = i;
            }
        }
        System.out.println(mcd);
        //piramide

         num3 = sc.nextInt();

        for (int i = 1; i <num3 ; i++) {
            for (int j = 1; j < num3 - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
