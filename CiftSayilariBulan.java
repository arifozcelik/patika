package kitap;

import java.util.Scanner;

public class CiftSayilariBulan {
    public static void main(String[] args) {
        int k;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayıyı giriniz..");
        k= girdi.nextInt();

        for (int i = 0; i<=k; i++) {
            if ( i % 2 == 0 ){
                System.out.print(" " + i);
            }
        }
    }
}
