package kitap;

import java.util.Scanner;

public class IkininKuvvetleriniBulan {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n;
        System.out.print("Sınırı belirle:");
        n= girdi.nextInt();

        for (int i=1; i<=n; i *= 2){
            System.out.println(i);
        }
    }
}
