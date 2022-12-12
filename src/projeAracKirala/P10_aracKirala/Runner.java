package projeAracKirala.P10_aracKirala;

import java.text.ParseException;

public class Runner {
    public static void main(String[] args) throws ParseException {
        // MusteriVeArabaBilgisiGirisi veriGirisi = new MusteriVeArabaBilgisiGirisi(); bad practice
        System.out.println("*******Ebikgabık Rent a Car************");
        System.out.println("*******Araçlarımız  Hizmetinizde************");
       // MusteriVeArabaBilgisiGirisi.araclist();
        MusteriVeArabaBilgisiGirisi.aracTalep();
        MusteriVeArabaBilgisiGirisi.arabalar();
        MusteriVeArabaBilgisiGirisi.musteriBilgisi();
        MusteriVeArabaBilgisiGirisi.odemeBilgileri();



    }
}