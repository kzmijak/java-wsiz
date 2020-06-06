package wsiz.w60095;

import java.util.Date;
import java.util.List;

public class Pracownik extends Osoba
{
    private String firma;
    private double zarobki;
    private String typUmowy;
    private String stanowisko;
    private Pracownik przelozony;
    private Date umowaOd;
    private Date umowaDo;

    public Pracownik(Date dataUrodzenia, List<Osoba> rodzina, String pesel, String imie, String nazwisko, String adresZameldowania, String firma, double zarobki, String typUmowy, String stanowisko, Pracownik przelozony, Date umowaOd, Date umowaDo) {
        super(dataUrodzenia, rodzina, pesel, imie, nazwisko, adresZameldowania);
        this.firma = firma;
        this.zarobki = zarobki;
        this.typUmowy = typUmowy;
        this.stanowisko = stanowisko;
        this.przelozony = przelozony;
        this.umowaOd = umowaOd;
        this.umowaDo = umowaDo;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public String getTypUmowy() {
        return typUmowy;
    }

    public void setTypUmowy(String typUmowy) {
        this.typUmowy = typUmowy;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }

    public void setPrzelozony(Pracownik przelozony) {
        this.przelozony = przelozony;
    }

    public Date getUmowaOd() {
        return umowaOd;
    }

    public void setUmowaOd(Date umowaOd) {
        this.umowaOd = umowaOd;
    }

    public Date getUmowaDo() {
        return umowaDo;
    }

    public void setUmowaDo(Date umowaDo) {
        this.umowaDo = umowaDo;
    }
}