package kitap;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        double armutfiyat, elmafiyat, domatesfiyat, muzfiyat, patlicanfiyat;

        System.out.println("Armut kaç kilo");
        armutkg = girdi.nextDouble();
        armutfiyat=armut * armutkg;

        System.out.println("Elma kaç kilo");
        elmakg = girdi.nextDouble();
        elmafiyat = elma * elmakg;

        System.out.println("Domates kaç kilo");
        domateskg = girdi.nextDouble();
        domatesfiyat=domates*domateskg;

        System.out.println("muz kaç kilo");
        muzkg=girdi.nextDouble();
        muzfiyat=muz*muzkg;

        System.out.println("patlican kaç kilo");
        patlicankg=girdi.nextDouble();
        patlicanfiyat=patlican*patlicankg;

        double total = armutfiyat+elmafiyat+muzfiyat+domatesfiyat+patlicanfiyat;

        System.out.println("Toplam tutar : " + total);
    }
}
