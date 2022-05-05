package dahaOnceYazilanProje;


public class Depo {

    String kahvetercihi="";
    String sutTercihi="";
    String sekerTercihi="";
    String boyutTercihi="";
    int kacSeker=0;

    public Depo(String kahveTercihi, String sutTercihi, String sekerTercihi, String boyutTercihi, int kacSeker) {



        this.kahvetercihi=kahveTercihi;
       if(sutTercihi.equals("evet")){this.sutTercihi="sütlü";} else if(sutTercihi.equals("hayır")){this.sutTercihi="sütsüz";}
        if(sekerTercihi.equals("evet")){sekerTercihi=kacSeker+"şekerli";} else if(sekerTercihi.equals("hayir")){sekerTercihi="şekersiz";}
        if (boyutTercihi.equals("büyük")){this.boyutTercihi="Büyük boy";}
        if (boyutTercihi.equals("orta")){this.boyutTercihi="orta boy";}
        if (boyutTercihi.equals("küçük")){this.boyutTercihi="küçük boy";}

        System.out.println(this.boyutTercihi+" "+this.sutTercihi+" "+this.sekerTercihi+" "+this.kahvetercihi+" "+"hazır");



    }
}
