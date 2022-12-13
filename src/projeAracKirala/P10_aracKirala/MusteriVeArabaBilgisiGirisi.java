package projeAracKirala.P10_aracKirala;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class MusteriVeArabaBilgisiGirisi extends AracTalebi {

    static List<AracTalebi> aracTalebiList = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);

    static long toplamGun;

    static long sehircrpn =0;//***

    static String sehir="";//***

    public static void aracTalep() throws ParseException {

        //  System.out.println("\n\n Devam için (d) ye Çıkış için (q)");
        // String devam= scan.nextLine();
        // if (devam.contains("q")){
        //      cikis();
        // }
        System.out.println("Alacağınız şehre göre extra teslimat ücreti talep etmekteyiz... ");
        System.out.println("Lutfen araci alacaginiz sehri giriniz:");
        sehir = scan.nextLine();
        if (sehir.equalsIgnoreCase("ankara")){
            sehircrpn=250;
        }
        if (sehir.equalsIgnoreCase("kayseri")){
            sehircrpn=450;
        }

        Date date1 = null;//*** Tam tarihi hesaplamak için Date data type ını kullandık.
        Scanner girdi = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Aracı Alacağınız Tarihi şu şekilde girin (gg/aa/yy):");
        String tAl = girdi.nextLine();
        if (null != tAl && tAl.trim().length() > 0) {
            date1 = format.parse(tAl);
        }

        Date date2 = null;
        Scanner girdi1 = new Scanner(System.in);

        System.out.print("Aracı Teslim Tarihi giriniz :  (gg/aa/yy):");
        String tVer = girdi1.nextLine();
        if (null != tAl && tVer.trim().length() > 0) {
            date2 = format.parse(tVer);
        }

        long toplamMlsn = date2.getTime() - date1.getTime();
        toplamGun = toplamMlsn / 86400000;
        System.out.println("Odenecek toplam gun ayisi: " + toplamGun);
        System.out.println("************************************");
    }

    public static void cikis() {
        System.exit(0);
    }

    public static void getAraba(String marka, String model, String yakitTipi, String vites, Integer gunlukUcret) {
        aracTalebiList.stream().
                filter(t -> t.getMarka().equalsIgnoreCase(marka) && t.getModel().equalsIgnoreCase(model) &&
                        t.getYakitTipi().equalsIgnoreCase(yakitTipi) && t.getVites().equalsIgnoreCase(vites)).
                forEach(System.out::println);
    }


    public static void islemeDevamDongusu() {
        System.out.println("Devam etmek istiyorsaniz 'e' ye, istemiyorsaniz 'h' ye basin");
        String devam = scan.next();
        if (devam.equalsIgnoreCase("e")) {
            musteriBilgisi();
        } else if (devam.equalsIgnoreCase("h")) {
            cikis();
        }
    }


    public static void arabalar() {

        AracTalebi opelDizelOtomatik = new AracTalebi("Opel", "Astra", "dizel", "otomatik", 150);
        AracTalebi opelDizelManuel = new AracTalebi("Opel", "Astra", "dizel", "manuel", 130);
        AracTalebi opelBenzinliOtomatik = new AracTalebi("Opel", "Vectra", "benzin", "otomatik", 150);
        AracTalebi opelBenzinliManuel = new AracTalebi("Opel", "Vectra", "benzin", "manuel", 130);
        AracTalebi toyotaDizelOtomatik = new AracTalebi("Toyota", "Corolla", "dizel", "otomatik", 180);
        AracTalebi toyotaDizelManuel = new AracTalebi("Toyota", "Corolla", "dizel", "manuel", 160);
        AracTalebi toyotaBenzinliOtomatik = new AracTalebi("Toyota", "Yaris", "benzin", "otomatik", 200);
        AracTalebi toyotaBenzinliManuel = new AracTalebi("Toyota", "Avensis", "benzin", "manuel", 190);
        AracTalebi vwDizelOtomatik = new AracTalebi("VW", "Golf", "dizel", "otomatik", 180);
        AracTalebi vwDizelManuel = new AracTalebi("VW", "Golf", "dizel", "manuel", 160);
        AracTalebi vwBenzinliOtomatik = new AracTalebi("VW", "Passat", "benzin", "otomatik", 200);
        AracTalebi vwBenzinliManuel = new AracTalebi("VW", "Passat", "benzin", "manuel", 190);
        AracTalebi fordFocusBenzManuel = new AracTalebi("ford", "focus", "benzin", "manuel", 175);// *** Örnek burada firma arka planda yeniraraç ekledi
        aracTalebiList.add(opelDizelOtomatik);
        aracTalebiList.add(opelDizelManuel);
        aracTalebiList.add(opelBenzinliOtomatik);
        aracTalebiList.add(opelBenzinliManuel);
        aracTalebiList.add(toyotaDizelOtomatik);
        aracTalebiList.add(toyotaDizelManuel);
        aracTalebiList.add(toyotaBenzinliOtomatik);
        aracTalebiList.add(toyotaBenzinliManuel);
        aracTalebiList.add(vwDizelOtomatik);
        aracTalebiList.add(vwDizelManuel);
        aracTalebiList.add(vwBenzinliOtomatik);
        aracTalebiList.add(vwBenzinliManuel);
        aracTalebiList.add(fordFocusBenzManuel);//***
    }//*** arabaları ayrı bir method yaptım
       /* System.out.println("\n Lutfen talep ettiginiz aracin numarasini giriniz : \n1 : Opel Dizel Otomatik " +
                "\n2 : Opel Dizel Manuel \n3 : Opel Benzinli Otomatik \n4 : Opel Benzinli Manuel" +
                "\n5 : Toyota Dizel Otomatik" + "\n6 : Toyota Dizel Manuel\n7 : Toyota Benzinli Otomatik" +
                "\n8 : Toyota Benzinli Manuel\n9 : vwDizelOtomatik\n10: vwDizelManuel\n11 : vwBenzinliOtomatik" +
                "\n12 : vwBenzinliManuel" + "\n13: Yeni arac talebi");*/
       public static void giris(){
        System.out.println("************************************");//*** bu method eklendi.
        for (int i = 0; i < aracTalebiList.size(); i++) {
            System.out.print("\n" + (i + 1) + "-)" + aracTalebiList.get(i));

        }
        System.out.println("\n*******************************************************************");
        System.out.println("\n Lütfen Araç seçiminizi yapınız :");
        int tercih = scan.nextInt();
        if (tercih<=aracTalebiList.size()) {//*** bu döngü eklenerek fazla code satırı içeren switch case den kurtulmuş olduk.
            for (int i = 0; i < aracTalebiList.size(); i++) {
                if (tercih == (i + 1)) {
                    System.out.println(aracTalebiList.get(i));
                    long odenecek_Ucret1 = (long) (toplamGun * (aracTalebiList.get(i).getGunlukUcret())+sehircrpn);
                    System.out.println("Alacağınız şehir "+ sehir+ " olduğundan "+sehircrpn+ " ₺ teslimat ücreti toplam ödeyeceğiniz tutara eklenmiştir.");
                    System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret1);
                    islemeDevamDongusu();
                }

            }
        }
        else System.out.println("Lütfen geçeerli araç giriniz....") ;giris();}
// arka planda firma araç ekleyebilir. bu nedenle yukarıda for loop yaparak hem clean code oldu hem de yeni araç girildiğinde listede o araç da gözükecek ve seçilecektir
        // böyle daha dinamik code oldu...
        /*switch (tercih) {
            case 1:
                System.out.println(aracTalebiList.get(0));
                //getAraba("Opel", "Astra", "dizel", "otomatik", 150);
                long odenecek_Ucret1 = (long) (toplamGun * (aracTalebiList.get(0).getGunlukUcret()));
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret1);
                islemeDevamDongusu();
                break;
            case 2:
                System.out.println(aracTalebiList.get(1));
                // getAraba("Opel", "Astra", "dizel", "manuel", 130);
                long odenecek_Ucret2 = toplamGun * 130;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret2);
                islemeDevamDongusu();
                break;
            case 3:
                System.out.println(aracTalebiList.get(2));
                //getAraba("Opel", "Astra", "benzin", "otomatik", 150);
                long odenecek_Ucret3 = toplamGun * 150;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret3);
                islemeDevamDongusu();
                break;
            case 4:
                System.out.println(aracTalebiList.get(3));
                //getAraba("Opel", "Astra", "benzin", "manuel", 130);
                long odenecek_Ucret4 = toplamGun * 130;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret4);
                islemeDevamDongusu();
                break;
            case 5:
                System.out.println(aracTalebiList.get(4));
                //getAraba("Toyota", "Astra", "dizel", "otomatik", 180);
                long odenecek_Ucret5 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret5);
                islemeDevamDongusu();
                break;
            case 6:
                System.out.println(aracTalebiList.get(5));
                //getAraba("Toyota", "Astra", "dizel", "manuel", 160);
                long odenecek_Ucret6 = toplamGun * 160;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret6);
                islemeDevamDongusu();
                break;
            case 7:
                System.out.println(aracTalebiList.get(6));
                //getAraba("Toyota", "Astra", "benzin", "otomatik", 200);
                long odenecek_Ucret7 = toplamGun * 200;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret7);
                islemeDevamDongusu();
                break;
            case 8:
                System.out.println(aracTalebiList.get(7));
                //getAraba("Toyota", "Astra", "benzin", "manuel", 190);
                long odenecek_Ucret8 = toplamGun * 190;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret8);
                islemeDevamDongusu();
                break;
            case 9:
                System.out.println(aracTalebiList.get(8));
                //getAraba("VW", "Astra", "dizel", "otomatik", 180);
                long odenecek_Ucret9 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret9);
                islemeDevamDongusu();
                break;
            case 10:
                System.out.println(aracTalebiList.get(9));
                //getAraba("VW", "Astra", "dizel", "manuel", 160);
                long odenecek_Ucret10 = toplamGun * 160;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret10);
                islemeDevamDongusu();
                break;
            case 11:
                System.out.println(aracTalebiList.get(10));
                //getAraba("VW", "Astra", "benzin", "otomatik", 200);
                long odenecek_Ucret11 = toplamGun * 200;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret11);
                islemeDevamDongusu();
                break;
            case 12:
                System.out.println(aracTalebiList.get(11));
                // getAraba("VW", "Astra", "benzin", "manuel", 190);
                long odenecek_Ucret12 = toplamGun * 190;
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret12);
                islemeDevamDongusu();
                break;
            case 13:
                // Burada talep edilen araç list e eklenmiyor.Burası olmamış ya hiç talep istenmeyecek
                // ya da burası handle edilip liste eklenir hale getirlecek. list e eklenirse yukarıdaki switch
                // case bozulacak...

              /*  System.out.println("Lutfen talep ettiginiz yeni arac markasini giriniz");
                String yeniMarka = scan.nextLine();
                scan.nextLine();
                System.out.println("Lutfen talep ettiginiz yeni model  giriniz");
                String yeniModel = scan.nextLine();
                System.out.println("Lutfen talep ettiginiz yakit tipi giriniz");
                String yeniYakitTipi = scan.nextLine();
                System.out.println("Lutfen talep ettiginiz  vites tipi giriniz");
                String yeniVitesTipi = scan.nextLine();


                getAraba(yeniMarka, " " + yeniModel, " " + yeniYakitTipi, " " + yeniVitesTipi, 250);
                long odenecek_Ucret13 = toplamGun * 250;
                System.out.println("************************************");
                System.out.println("Odeyeceginiz toplam ucret: " + odenecek_Ucret13);
                System.out.println("************************************");
                islemeDevamDongusu();
                break;*/
        /*    default:
                System.out.println("Lutfen gecerli bir arac talep numarasi giriniz");
        }

*/


    public static void musteriBilgisi() {
        System.out.println("************************************");
        System.out.println("Ödeme İçin Lütfen bilgilerinizi giriniz:");
        System.out.println("************************************");
        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        scan.nextLine();// ***bu dummy yi yukarıya alınca düzeldi.Yoksa atamaları yapmıyordu.
        String adSoyad = scan.nextLine();

        System.out.println("Lutfen id'nizi giriniz: ");
        String id = scan.nextLine();
        //scan.next();*** gereksiz dummy atılmış
        System.out.println("Lutfen telefon numaranizi giriniz: ");
        String tlf = scan.nextLine();
        //scan.next();*** gereksiz dummy atılmış
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        System.out.println("************************************");

        System.out.println("Ad Soyad: " + adSoyad + "\nid: " + id + "\n Telefon: " + tlf + "\nYas: " + yas);
        odemeBilgileri();

        System.out.println("************************************");
    }

    public static void odemeBilgileri() {
        System.out.println("************************************");
        scan.nextLine();//dummy
        System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz: ");
        String kKarti = scan.nextLine();
        int uzunluk = 16;//*** 12 yazıyordu

        if (uzunluk == kKarti.length()) {
            System.out.println("Gecerli kart numarasi");
        } else {
            System.out.println("Gecersiz kart numarasi..Tekrar dneyiniz");
            odemeBilgileri();
            scan.next();
        }
        System.out.println("Odemeniz Basari ile Gerceklesmistir. Iyi gunler dileriz...");
        cikis();

    }



}

