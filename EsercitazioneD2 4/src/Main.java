import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero intero");
        int test = scan.nextInt();
        countdown(test);
        scan.close();
        }
    public static void countdown(int num) {
        System.out.println("Conto alla rovescia da " + num + " a 0");

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

}
