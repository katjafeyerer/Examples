import java.util.Scanner;

public class TowerCalculator {
    public static void main(String[] args) {

        long number;
        long result;
        int multiplicator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Startzahl eingeben:");
        number= scanner.nextInt();
        result = number;

        for (multiplicator= 2; multiplicator<=15; multiplicator++) {
            number = result;
            result = number * multiplicator;
            System.out.println(number + "*" + multiplicator + "=" + result);
        }
        for (multiplicator=2; multiplicator<=15; multiplicator++) {
            number = result;
            result = number/multiplicator;
            System.out.println(number + "/" + multiplicator + "=" + result);
        }

    }
}
