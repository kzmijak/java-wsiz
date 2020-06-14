package wsiz.w60095;

public class Main {

    public static void main(String[] args) {

        Firma testowa = new Firma();

        Pracownik p1 = new Pracownik(1);
        Pracownik p2 = new Pracownik(2);
        Pracownik p3 = new Pracownik(3);

        testowa.DodajPracownika(p1);
        testowa.DodajPracownika(p2);

	    IOHandler.ZapiszPracownikowDoPliku(testowa.getPracownicy(), "test.txt");

	    testowa.DodajPracownika(p3);

        try {
            IOHandler.DodajPracownikowDoPliku(testowa.getPracownicy(), "test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
