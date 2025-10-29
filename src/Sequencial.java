import java.util.Scanner;

public class Sequencial {
    public static void Seque(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio 1
        for (int i = 0; i < 5; i++) {

            if (i==2){
                System.out.print("H E L L O    P O B L E N O U !");
            }else {
                for (int j = 1; j <33 ; j++) {
                    System.out.print("-");

                }
            }

            System.out.println();
        }
        // Ejercicio 2
        String first = sc.nextLine();
        String second = sc.nextLine();
        String age = sc.nextLine();
        String Ciclo = sc.nextLine();
        sc.close();
        System.out.println("Hola em dic "+first+ " "+second+", tinc "+age+" anys i realitzo el cicle formatiu de "+ Ciclo);

        // Ejercicio 3
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();


        double ae = e / 100.0;
        double bf = f / 100.0;
        double cg = g / 100.0;
        double hh = h / 100.0;

        double resultA = a * ae;

        double resultB = b * bf;
        double resultC = c * cg;
        double resultD = d * hh;

        double result = (resultA + resultB + resultC + resultD);

        int result2 = (int) Math.round(result);

        System.out.println(result2);

        //Ejercicio 4

        int hores,minutos,segundos;
        int horesR,minutosR,segundosR,totalResukt;

        hores= sc.nextInt();
        minutos= sc.nextInt();
        segundos= sc.nextInt();
        totalResukt = (hores*3600) + (minutos*60) +segundos;
        System.out.println(totalResukt);
        totalResukt = (totalResukt/3600);
        int totalMinute = minutos%60;
        int totalSeconds = segundos%60;
        System.out.println("\nConverted back:");
        System.out.println("Hours = " + totalResukt);
        System.out.println("Minutes = " + totalMinute);
        System.out.println("Seconds = " + totalSeconds);

        //Ejercicio 5

        int divide=3600;
         segundos = sc.nextInt();
        horesR = segundos/divide;
        minutosR = segundos%divide;
        segundos = minutosR/60;
        System.out.println(horesR);
        System.out.println(minutosR);
        System.out.println(segundos);

        //Ejercicio 6

        int user = sc.nextInt();
        int classe = 5;
        int semmanas = 33;
         totalSeconds = user *classe*semmanas ;

        horesR = (totalSeconds/divide);
        int resto = totalSeconds%3600;
        minutosR = resto/60;
        user = resto%60;
        System.out.println(horesR);
        System.out.println(minutosR);
        System.out.println(user);

        //Ejercicio 7
        double process,r=Math.PI;
        double user1 = sc.nextDouble();
        process = Math.sqrt(user/r);
        result = Math.round(process);
        System.out.println((int) result);

        // Ejercicio 8
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double d1 = Math.sqrt(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2));
        double d2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d4 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        double d5 = Math.sqrt(Math.pow(x4 - 0, 2) + Math.pow(y4 - 0, 2));
        double total = d1 + d2 + d3 + d4 + d5;


        long totalRounded = Math.round(total);


        System.out.println(totalRounded);

        //Ejercicio 9
        int impresores = sc.nextInt();
        int ordinadors = sc.nextInt();
        int portatils = sc.nextInt();
        int discsDurs = sc.nextInt();
        int materialOficina = sc.nextInt();

        int impresora = 500;
        int ordinador = 400;
        int portatil = 700;
        int discduro= 50;
        int materia_complert= 300;
         total   = (impresores*impresora) + (ordinadors*ordinador) + (portatils*portatil) + ( discduro*discsDurs) + (materia_complert*materialOficina);
        System.out.println(total);
    }
}
