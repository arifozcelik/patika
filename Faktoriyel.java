package kitap;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int toplam = 1;

        System.out.println("Faktöriyeli istenen sayiyi giriniz: ");
        int n = girdi.nextInt();

        for (int i = 1; i <=n; i++) {
            toplam *= i;
        }
        System.out.println( toplam + " " + n +"'nin faktöriyelidir");
    }
}
