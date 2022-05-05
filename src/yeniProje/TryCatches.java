package yeniProje;

import java.util.InputMismatchException;

import static yeniProje.Methods.scan;

public class TryCatches {

    public static int tryCatchesInt() {
        int giris = 0;
        boolean flag1=false;

        do { flag1=false;

            try {flag1=false;


                giris = scan.nextInt();


                if (giris < 0) {
                    throw new IllegalArgumentException();
                }
                break;

            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir sayi giriniz");
            } catch (InputMismatchException e) {



                System.out.println("lütfen bir rakam giriniz");
                flag1=true;
                scan.nextLine();

            } catch (Exception e) {
                flag1=true;
                System.out.println("lütfen geçerli bir giriş yapınız");
            }


        } while (flag1);


        return giris;

    }
}
