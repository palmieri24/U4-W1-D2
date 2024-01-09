import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "";

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Inserire una stringa");
            input = scanner.nextLine();
            String[] caratteri = input.split("");
            System.out.println(String.join(",", caratteri));

        } while (!input.equals(":q"));
        scanner.close();
        System.out.println("Exit");

    }
}