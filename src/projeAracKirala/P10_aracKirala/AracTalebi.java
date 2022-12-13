package projeAracKirala.P10_aracKirala;

public class AracTalebi {
    public AracTalebi(){

    }

    private String alinacakSehir;
    private String alinacakGun;
    private String alisSaati;
    private String teslimGunu;
    private String teslimSaati;

    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private long gunlukUcret;


    public AracTalebi(String alinacakSehir, String alinacakGun, String alisSaati, String teslimGunu, String teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }



    public AracTalebi(String marka,String model, String yakitTipi, String vites, long gunlukUcret) {
       this.marka=marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;

    }

    @Override
    public String toString() {
        return "[" +
                "Marka= " + marka +
                ", Model= " + model +
                ", YakitTipi= " + yakitTipi  +
                ", Vites= " + vites +
                ", Günlük Ücret= " + gunlukUcret +
                "]";
    }

    public String getMarka() {

        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {

        this.yakitTipi = yakitTipi;
    }

    public String getVites() {

        return vites;
    }


    public void setVites(String vites) {

        this.vites = vites;
    }

    public double getGunlukUcret() {

        return gunlukUcret;
    }

    public void setGunlukUcret(long gunlukUcret) {

        this.gunlukUcret = gunlukUcret;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public String getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(String alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }


}
