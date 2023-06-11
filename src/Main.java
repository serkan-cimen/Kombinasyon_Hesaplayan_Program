import java.util.Scanner;

public class Main {
    // Faktöriyel hesaplamak için yardımcı bir metot
    public static int faktoriyel (int number) {
        if (number <= 1)
            return 1;
        else
            return number * faktoriyel(number - 1);
    }

    // Kombinasyon hesaplama metodu
    public static int kombinasyon (int n, int r) {
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz : ");
        int n = input.nextInt();

        System.out.print("r sayısını giriniz : ");
        int r = input.nextInt();

        int conclusion = kombinasyon(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + conclusion);

        input.close();
    }
}