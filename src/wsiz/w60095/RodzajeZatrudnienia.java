package wsiz.w60095;

public enum RodzajeZatrudnienia {
    UMOWAOPRACE(0.17, 0.09, 0.07),
    UMOWAOZLECENIE(0.2, 0.1, 0.05),
    UMOWAODZIELO(0.15,0.11, 0.1),
    B2B(0,0,0);

    private double podatekDochodowy;
    private double ubezpieczenieSpoleczne;
    private double ubezpieczenieZdrowotne;

    RodzajeZatrudnienia(double podatekDochodowy, double ubezpieczenieSpoleczne, double ubezpieczenieZdrowotne) {
        this.podatekDochodowy = podatekDochodowy;
        this.ubezpieczenieSpoleczne = ubezpieczenieSpoleczne;
        this.ubezpieczenieZdrowotne = ubezpieczenieZdrowotne;
    }

    public double getPodatekDochodowy() {
        return podatekDochodowy;
    }

    public double getUbezpieczenieSpoleczne() {
        return ubezpieczenieSpoleczne;
    }

    public double getUbezpieczenieZdrowotne() {
        return ubezpieczenieZdrowotne;
    }

    public double wyliczPlaceNetto(double placaBrutto)
    {
        return placaBrutto * this.podatekDochodowy * this.ubezpieczenieSpoleczne * this.getUbezpieczenieZdrowotne();
    }
}
