public class OwnMethodForInterestCalculation {
//Übungsblatt 1, Beispiel 4

    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;

        System.out.println(berechneZinsen(kontostand, zinsen));
        System.out.println(berechneZinsen(2333.33, 1.5));
        System.out.println(berechneZinsen(2323, 6.75));

    }
    private static double berechneZinsen(double kontostand, double zinsen) {
        return kontostand * zinsen / 100;
    }
}
