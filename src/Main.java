import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a5 = sc.nextInt();
        int a6 = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int sum = 1;
        for (int i = 1; i <=a6 ; i++) {

            sum*=a5;
        }
        System.out.println(sum);


    }
}
