//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        System.out.println(stringEvenOdd("prova"));
        System.out.println(leapYear(2024));
        }

        public static boolean stringEvenOdd(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
        }

        public static boolean leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
        }
    }