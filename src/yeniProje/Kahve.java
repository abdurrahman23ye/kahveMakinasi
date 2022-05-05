package yeniProje;

public class Kahve {

    private String cesit="";
    private String sut="";
    private String seker="";
    private String boyut="";
    private String miktar="";




    public Kahve(String cesit, String sut, String seker, String boyut, String miktar) {
        this.cesit = cesit;
        this.sut = sut;
        this.seker = seker;
        this.boyut = boyut;
        this.miktar = miktar;
    }

    public Kahve(){}

    public  String getCesit() {
        return cesit;
    }

    public  void setCesit(String cesit) {
        this.cesit = cesit;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }
}
