package yeniProje;

import static yeniProje.Methods.miktar;
import static yeniProje.Methods.sonuc;

public class KahveMakinasi {
    static Kahve kahve2=new Kahve();

    public static void main(String[] args) throws InterruptedException {

     String cesit=  Methods.cesit(new Kahve());
     String sut= Methods.sut(new Kahve());
     String boyut= Methods.boyut(new Kahve());
     String seker= Methods.seker(new Kahve());



     if(Methods.flag){
         String miktar=sonuc;


         System.out.println(sut+" "+boyut+" "+miktar+" "+seker+" "+" "+cesit+" hazır.");
     }else {System.out.println(sut+" "+boyut+" "+seker+" "+" "+cesit+" hazır.");}





    }
}
