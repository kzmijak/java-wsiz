package wsiz.w60095;

import java.util.HashMap;

public class Firma {
    private HashMap<Integer, Pracownik> pracownicy;

    public Firma()
    {
        this.pracownicy = new HashMap<Integer, Pracownik>();
    }

    public Firma(HashMap<Integer, Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public HashMap<Integer, Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void DodajPracownika(Pracownik nowyPracownik)
    {

        if(!this.pracownicy.values().contains(nowyPracownik))
        {
            int pierwszeWolneId = 0;
            if(this.pracownicy.size() > 0) {
                pierwszeWolneId =
                        this.pracownicy
                                .keySet()
                                .stream()
                                .filter(id -> this.pracownicy.get(id + 1) == null)
                                .toArray(Integer[]::new)
                                [0];
                pierwszeWolneId += 1;
            }
            this.pracownicy.put(pierwszeWolneId, nowyPracownik);
        }
    }

    public void UsunPracownika(Pracownik pracownikDoUsuniecia)
    {
        if(this.pracownicy.values().contains(pracownikDoUsuniecia))
        {
            this.pracownicy.values().remove(pracownikDoUsuniecia);
        }
    }
}
