package kitap;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int mat,fizik,kimya,tarih,beden;

        System.out.print("Mat notu:");
        mat=girdi.nextInt();

        System.out.print("fizik notu:");
        fizik=girdi.nextInt();

        System.out.print("kimya notu:");
        kimya=girdi.nextInt();

        System.out.print("tarih notu:");
        tarih=girdi.nextInt();

        System.out.print("beden notu:");
        beden=girdi.nextInt();

        double notOrt = (mat+fizik+kimya+tarih+beden) / 5;

        System.out.println("Ortalaman : " +notOrt);
        if (notOrt >= 70){
            System.out.println("Sınıfı geçtin");
        }else {
            System.out.println("Sınıf tekrarı...");
        }
    }
}
