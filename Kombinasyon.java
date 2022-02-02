package kitap;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n,r,k;
        int toplam1=1,toplam2=1, toplam3=1;

        System.out.print("1.sayiyi giriniz: ");
        n=girdi.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        r=girdi.nextInt();

        for (int i=1; i<=n;i++){
            toplam1=toplam1*i;
        }

        for (int i=1; i<=r;i++){
            toplam2=toplam2*i;
        }

        k=n-r;

        for (int i=1; i<=k;i++){
            toplam3=toplam3*i;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        int comb = toplam1 / (toplam2*toplam3);
        System.out.println("Kombinasyon Sonucu: " +comb );
    }
}
