package metotlar;

public class MetotPalindrom {

    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        int lastdigit;
        while (temp != 0){
            System.out.println("======================");

            System.out.println("Number == " + temp);

            lastdigit = temp % 10;
            System.out.println("Son Basamak = " + lastdigit);

            reverseNumber = (reverseNumber * 10) + lastdigit;
            System.out.println("Yeni Sayı == " + reverseNumber);
            
            temp /= 10;

        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrom(247);
    }
}
