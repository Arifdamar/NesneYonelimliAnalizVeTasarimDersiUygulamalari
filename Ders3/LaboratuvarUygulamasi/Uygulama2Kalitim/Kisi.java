package ders1.uygulama2;

public class Kisi {


    private String isim;
    private int maas;
    private String bolum;


    public Kisi(String isim, int maas, String departman) {

        this.isim = isim;
        this.maas = maas;
        this.bolum = departman;
    }

    public void calis(){

        System.out.println("Çalışan Sınıfı Çalışıyor...");
    }

    public void BilgileriGoster(){

        System.out.println("İsim : " + isim);
        System.out.println("Maaş : " + maas);
        System.out.println("Departman : " + bolum);

    }


}


