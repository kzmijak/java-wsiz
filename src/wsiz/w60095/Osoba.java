package wsiz.w60095;

import java.util.Date;
import java.util.List;

public class Osoba
{
    private Date dataUrodzenia;
    private List<Osoba> rodzina;
    private String pesel;
    private String imie;
    private String nazwisko;
    private String adresZameldowania;

    public Osoba(Date dataUrodzenia, List<Osoba> rodzina, String pesel, String imie, String nazwisko, String adresZameldowania) {
        this.dataUrodzenia = dataUrodzenia;
        this.rodzina = rodzina;
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adresZameldowania = adresZameldowania;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public List<Osoba> getRodzina() {
        return rodzina;
    }

    public void setRodzina(List<Osoba> rodzina) {
        this.rodzina = rodzina;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdresZameldowania() {
        return adresZameldowania;
    }

    public void setAdresZameldowania(String adresZameldowania) {
        this.adresZameldowania = adresZameldowania;
    }
}
