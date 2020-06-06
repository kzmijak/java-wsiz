package wsiz.w60095;

import java.util.Date;
import java.util.List;

public class Programista extends Pracownik{
    private String poziom;
    private List<String> technologie;
    private List<String> projekty;

    public Programista(Date dataUrodzenia, List<Osoba> rodzina, String pesel, String imie, String nazwisko, String adresZameldowania, String firma, double zarobki, String typUmowy, String stanowisko, Pracownik przelozony, Date umowaOd, Date umowaDo, String poziom, List<String> technologie, List<String> projekty) {
        super(dataUrodzenia, rodzina, pesel, imie, nazwisko, adresZameldowania, firma, zarobki, typUmowy, stanowisko, przelozony, umowaOd, umowaDo);
        this.poziom = poziom;
        this.technologie = technologie;
        this.projekty = projekty;
    }

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }

    public List<String> getTechnologie() {
        return technologie;
    }

    public void setTechnologie(List<String> technologie) {
        this.technologie = technologie;
    }

    public List<String> getProjekty() {
        return projekty;
    }

    public void setProjekty(List<String> projekty) {
        this.projekty = projekty;
    }
}
