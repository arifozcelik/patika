package kitap;

import java.util.Scanner;

public class SifreDogrulama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String username,password;

        System.out.print("Kullanıcı adını giriniz:");
        username=girdi.nextLine();

        System.out.print("Sifrenizi giriniz:");
        password= girdi.nextLine();

        if (username.equals("asdffgjkas") && password.equals("sdfdf")){
            System.out.println("Devam edebilirsiniz");
        }else {
            System.out.println("Yanlış kullanıcı adı veya şifre...");
        }
    }
}
