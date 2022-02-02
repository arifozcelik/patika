package kitap;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        double km = 0.1;
        Scanner girdi = new Scanner(System.in);
        System.out.println("arifucakbileti.com'a hoşgeldiniz..");
        System.out.println("----------------------------------");

        System.out.println("Mesafeyi giriniz:");
        int mesafe = girdi.nextInt();
        if (mesafe<=0){
            System.out.println("hatalı mesafe girdiniz.. tekrar deneyiniz");
            System.exit(0);
        }

        System.out.println("Yaşınızı giriniz:");
        int yas = girdi.nextInt();
        if (yas<=0){
            System.out.println("Hatalı yas girdiniz..tekrar deneyiniz");
            System.exit(0);
        }

        System.out.println("Tek yön ise 1, cift yön ise 2'yi seciniz");
        int secim=girdi.nextInt();
        if (!(secim>=1 && secim<=2)){
            System.out.println("Hatalı seçim yaptınız");
        }

        double tutar=mesafe*km;

        if(yas<12)
            tutar/=2;
        if(yas>=12 && yas <24)
            tutar-=tutar*0.1;
        if(yas>65)
            tutar-=tutar*0.3;

        if(secim==2) {
            tutar *= 2;
            tutar -= tutar * 0.2;
        }

        System.out.println("Toplam Tutar : "+tutar);
    }
}

