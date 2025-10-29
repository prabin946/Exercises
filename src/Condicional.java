import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Condicional {
    public static void condicional(String[] args){
        // Ejerciico 1
        Scanner sc = new Scanner(System.in);
        int age,result;
        String name;
        name = sc.nextLine();
        age = sc.nextInt();
        result =2025- age;
        if (result<18){
            System.out.println(name+"te "+result+ " anys i es menor d'edat.\n");
        }else if (result>=18){
            System.out.println("El"+name +"té"+ result+ "anys i és major d'edat.");
        }

        //Ejercicio 2
        int N,A,P,M;
        int NR,AR,PR,MR;
        N = sc.nextInt();
        A = sc.nextInt();
        P = sc.nextInt();
        M = sc.nextInt();
        NR = (N*A*P);
        AR = NR-M;
        if (N<=0 || A <=0 || P<=0 || M <=0 ){
            System.out.println("Error dades introduïdes no vàlides");
            return;
        }
        if (AR>0){

            System.out.println("A l'institut hi caben tots els alumnes, encara n'hi caben "+AR);
        }else if (AR<0){
            System.out.println("Calen "+ Math.abs(AR)+ " places per tots els alumnes que s'han matriculat\n");
        }

        //Ejerciico 3
        N = sc.nextInt();
        A = sc.nextInt();
        P = sc.nextInt();
        M = sc.nextInt();
        NR = N*A*P;
        AR = M-NR;

        PR = (N*A);


        if (AR>0){
            MR =(int) Math.ceil((double) AR/PR);
            System.out.println("Calen " + MR + " plantes per acollir tots els alumnes matriculats");

        } else if (AR<0) {
            AR= -AR;
            MR = AR/PR;
            System.out.println("A l'institut sobren " + MR + " plantes");

        }else {
            System.out.println("A l'institut hi caben exactament tots els alumnes");

        }
        // Ejercicio 4

        double gran;
        double first,second,third;

        first = sc.nextDouble();
        second = sc.nextDouble();
        third = sc.nextDouble();
        gran = first;
        if (second>second){
            gran = second;
        }else if (gran< third){
            gran = third;
        }
        // CheatSheet
        Math.max(first,Math.max(second,third));
        System.out.println("El número més gran és: " + gran);

        // Ejercicio 5

        char sign;
        first = sc.nextInt();
        third = sc.nextInt();
        sign = sc.next().charAt(0);
        switch (sign){
            case '+' -> System.out.println(first+third);
            case '-' -> System.out.println(first-third);
            case '*' -> System.out.println(first*third);
            case '/' -> System.out.println(first/third);
        }

        // Ejercicio 6
        ArrayList<String> Dias = new ArrayList<>();
        String [] dies = {"DILLUNS",
                "DIMARTS",
                "DIMECRES",
                "DIJOUS",
                "DIVENDRES",
                "DISSABTE",
                "DIUMENTGE"};
        Dias.addAll(Arrays.asList(dies));
        int week = sc.nextInt();
        if (week<=0){
            System.out.println("Dia no valid\n");
            return;
        }
        if (week >=1 && week <=7 ){
//            Dias dias= Dias.values()[week-1];

//            System.out.println("El dia és: " + dias);
        }

        //Ejercicio 7
        int preu_base = 440,alumne_nombrosa= 0,alumne_honor=preu_base-80,ufs=0,curs_sencer = 25*ufs,monoparental_especia =preu_base/2;
        double alumne_monoparental_especial=preu_base*0.20,alumne_major = preu_base*0.10,preu_final;
        boolean alumne_nombros = sc.nextBoolean();
        boolean honor = sc.next().toUpperCase().contains("true");
        boolean monoparental_normal = sc.next().toLowerCase().contains("true");;
        boolean monoparental_especial = sc.next().toUpperCase().contains("true");;
        int majorde27= sc.nextInt();
        int curs_sincer =sc.nextInt();;

        if (alumne_nombros) {
            preu_final = preu_base / 2.0;                    // família nombrosa
        } else if (honor) {
            preu_final = preu_base - 80;                     // matrícula d’honor
        } else if (monoparental_normal) {
            preu_final = preu_base / 2.0;                    // monoparental normal
        } else if (monoparental_especial) {
            preu_final = preu_base * 0.20;                   // monoparental especial
        } else if (majorde27 > 1) {                         // 1 si és cert
            preu_final = preu_base * 0.10;                   // major de 27 anys
        } else if (curs_sincer>0) {
            preu_final = curs_sencer;

        } else {
            preu_final = preu_base;                          // preu complet
        }
        System.out.println((int) preu_final);
        //Ejerciico 8
        double T_usual = 40.0;
        double T_jove = 80.0;
        double T_16 = 0.0;
        double Targeta_Rosa = 0.0;
        double T_casual = 11.35;
        double Bitllet_senzill = 2.40;

        int  viatges;
        String millor_tarifa = "";
        double recomanacio = 0.0;

        age = sc.nextInt();    // edat
        viatges = sc.nextInt(); // viatges mensuals

        if (age >= 4 && age <= 16) {
            millor_tarifa = "T-16";
            recomanacio = T_16;
        } else if (age > 60) {
            millor_tarifa = "Targeta Rosa";
            recomanacio = Targeta_Rosa;
        } else if (age < 25) {
            millor_tarifa = "T-jove";
            recomanacio = T_jove;
        } else if (viatges > 10) {
            millor_tarifa = "T-usual";
            recomanacio = T_usual;
        } else if (viatges > 1) {
            millor_tarifa = "T-casual";
            recomanacio = T_casual;
        } else {
            millor_tarifa = "Bitllet senzill";
            recomanacio = Bitllet_senzill;
        }

        System.out.println("La millor tarifa és: " + millor_tarifa);
        //Ejercicio 9
        String tipus = sc.next().toUpperCase();          // VIANANT | COTXE | TRANVIA
        String semafor_tranvia = sc.next().toUpperCase(); // STOP | GO
        String semafor_vianant = sc.next().toUpperCase(); // VERMELL | GROC | VERD
        String semafor_cotxe = sc.next().toUpperCase();   // VERMELL | GROC | VERD

        // Detectem si hi ha col·lisió
        int verds = 0;
        if (semafor_tranvia.equals("GO")) verds++;
        if (semafor_vianant.equals("VERD")) verds++;
        if (semafor_cotxe.equals("VERD")) verds++;

        if (verds >= 2) {
            System.out.println("POSSIBLE COLISIO");
        } else {
            boolean potPassar = false;

            switch (tipus) {
                case "TRANVIA" -> potPassar = semafor_tranvia.equals("GO");
                case "VIANANT" -> potPassar = semafor_vianant.equals("VERD");
                case "COTXE" -> potPassar = semafor_cotxe.equals("VERD");
            }

            if (potPassar) {
                System.out.println("ENDAVANT");
            } else {
                System.out.println("PARAR");
            }
        }

        //Ejercicio 10
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (year%400==0 || year%4==0 && year%100 !=0){
                    days=29;
                }else {
                    days = 28;
                }

                break;
            default:
                days = 0; // invalid month
                break;
        }
        System.out.println(days);
    }
}
