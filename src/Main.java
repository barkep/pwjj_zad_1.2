import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        BigInteger liczba = scanner.nextBigInteger();
        System.out.println(liczba + "! = " + silnia(liczba));
    }

    private static BigInteger silnia(BigInteger liczba) {
        if (liczba.equals(new BigInteger("0"))) {
            return new BigInteger("1");
        } else {
            return liczba.multiply(silnia(liczba.subtract(new BigInteger("1"))));
        }
    }
}

