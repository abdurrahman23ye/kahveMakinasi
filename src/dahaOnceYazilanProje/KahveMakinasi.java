package dahaOnceYazilanProje;

import java.util.Scanner;

public class KahveMakinasi {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        int kacSeker=0;

        System.out.println("Lütfen kahve tercihinizi yazı ile belirtiniz. Seçenekleriniz: Turk Kahvesi,Filtre kahve ve Ekspresso");
        String kahveTercihi= scan.nextLine().toLowerCase();

        /* while(kahveTercihi.equals("turk kahvesi") || kahveTercihi.equals("filtre kahve") || kahveTercihi.equals("ekspresso")){
            System.out.println("hatalı giriş yaptınız. tekrar deneyiniz."); kahveTercihi=scan.nextLine().toLowerCase();}
        System.out.println(kahveTercihi+" "+"hazırlanıyor.");

         */ //şuradaki hatadan bir türlü çıkamadığım ve zamanımı da bayağı harcadığım için uzun ve basit yolu seçtim.

        int sayac=0;

        while(sayac<1){

        if(kahveTercihi.equals("turk kahvesi")){ System.out.println(kahveTercihi+" "+"hazırlanıyor.");sayac++;}
        else if(kahveTercihi.equals("filtre kahve")){ System.out.println(kahveTercihi+" "+"hazırlanıyor.");sayac++;}
        else if(kahveTercihi.equals("ekspresso")){ System.out.println(kahveTercihi+" "+"hazırlanıyor.");sayac++;}
        else{System.out.println("hatalı giriş yaptınız. tekrar deneyiniz."); kahveTercihi=scan.nextLine().toLowerCase();}}






        System.out.println("Süt ister misiniz?(Evet ya da hayır)");


        String sutTercihi= scan.next().toLowerCase().toLowerCase();
        if(sutTercihi.equals("evet")){System.out.println("kahvenize süt eklendi");} else if(sutTercihi.equals("hayır")){
            System.out.println("Kahvenize süt eklenmeyecek");} //İsteklerde yer almadığı için hatalı cevaplar üzerinde çalışılmadı.

        System.out.println("Kahvenize şeker eklenmesini ister misiniz?(Lütfen evet ya da hayır cevabı veriniz.)");
        String sekerTercihi=scan.next().toLowerCase(); //İsteklerde yer almadığı için hatalı cevaplar üzerinde çalışılmadı.

        if(sutTercihi.equals("evet")){
            System.out.println("kaç şeker istersiniz?");kacSeker= scan.nextInt();
            System.out.println("Kahvenize"+kacSeker+"eklendi");} else  if(sutTercihi.equals("hayır")){
            System.out.println("Kahvenize şeker eklenmedi.");}

        System.out.println("Kahvenizin boyutu ne olsun?(Büyük,orta,küçük)");


        String boyutTercihi=scan.next().toLowerCase();

        if (boyutTercihi.equals("büyük")){System.out.println("Büyük boy kahveniz hazırlanıyor");}
        if (boyutTercihi.equals("orta")){System.out.println("Orta boy kahveniz hazırlanıyor");}
        if (boyutTercihi.equals("küçük")){System.out.println("Küçük boy kahveniz hazırlanıyor");}

        Depo kahveMakinasi=new Depo(kahveTercihi,sutTercihi,sekerTercihi,boyutTercihi,kacSeker);
    }
}
