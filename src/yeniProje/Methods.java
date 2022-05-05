package yeniProje;

import java.util.Scanner;

public class Methods {

    static Scanner scan= new Scanner(System.in);
    static boolean flag=false;
    static int miktar1=0;
    static String sonuc="";


    public static void main(String[] args) {
        String cesit="";
        String sut="";
        String seker="";
        String boyut="";
        String miktar="";

        Kahve kahve=new Kahve(cesit,sut,seker,boyut,miktar);




    }



  public static String cesit(Kahve kahve) throws InterruptedException {




        System.out.println("Hangi çeşit kahve istersiniz?\n1.Turk Kahvesi \n2.Eksperesso\n3.Filtre Kahve");

        int cesitTercih=TryCatches.tryCatchesInt();

        switch (cesitTercih){

            case 1:kahve.setCesit("Turk Kahvesi");break;
            case 2:kahve.setCesit("Eksperesso");break;
            case 3:kahve.setCesit("Filtre Kahve");break;
            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");


                cesit(kahve);


        }   System.out.println(kahve.getCesit()+" hazırlanıyor.");

      return kahve.getCesit();

    }

    public static String sut(Kahve kahve) throws InterruptedException {




        System.out.println("Sut eklemek ister misiniz?\n1.Evet \n2.Hayır");

        int sutTercih=TryCatches.tryCatchesInt();

        switch (sutTercih){

            case 1:kahve.setSut("Sütlü");break;
            case 2:kahve.setSut("Sütsüz");break;
            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");
                sut(kahve);break;

        }   System.out.println(kahve.getSut()+" kahve hazırlanıyor.");


        return kahve.getSut();

    }

    public static String boyut(Kahve kahve) throws InterruptedException {




        System.out.println("Hangi boyutta kahve istersiniz?\n1.Büyük boy \n2.Orta boy\n3.Küçük boy");

        int boyutTercih=TryCatches.tryCatchesInt();

        switch (boyutTercih){

            case 1:kahve.setBoyut("buyuk boy");break;
            case 2:kahve.setBoyut("orta boy");break;
            case 3:kahve.setBoyut("kucuk boy");break;

            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");

                boyut(kahve); break;

        }  System.out.println("Boyut ayarlanıyor.");


        return kahve.getBoyut();

    }

    public static String seker(Kahve kahve) throws InterruptedException {




        System.out.println("Seker ister misiniz?\n1.Evet \n2.Hayır");

        int sekerTercih=TryCatches.tryCatchesInt();

        switch (sekerTercih){

            case 1:kahve.setSeker("Sekerli");flag=true;break;
            case 2:kahve.setSeker("Sekersiz");break;

            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");


                seker(kahve); break;

        }
        System.out.println(kahve.getSeker()+" kahve hazırlanıyor.");


        if(flag){miktar(kahve);}

        return kahve.getSeker();

    }

    public static void miktar(Kahve kahve){
        String miktar="";

        System.out.println("Kaç şeker istersiniz.");

         miktar1=TryCatches.tryCatchesInt();


         switch (miktar1){
             case 1:miktar="bir";break;
             case 2:miktar="iki";break;
             case 3:miktar="üç";break;
             case 4:miktar="dört";break;
             case 5:miktar="beş";break;
             case 6:miktar="altı";break;
             case 7:miktar="yedi";break;
             case 8:miktar="sekiz";break;
             case 9:miktar="dokuz";break;
             default:
                 System.out.println("Seker miktarını hatalı girdiniz");
         }
        kahve.setMiktar(miktar);


        sonuc= kahve.getMiktar();
    }



}
