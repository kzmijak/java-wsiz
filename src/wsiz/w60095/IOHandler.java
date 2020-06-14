package wsiz.w60095;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IOHandler {

    private static FileWriter fileWriter;
    private static Scanner scanner;

    public static void ZapiszPracownikowDoPliku(HashMap<Integer,Pracownik> pracownicy, String adresPliku)
    {

        try {
            fileWriter = new FileWriter(adresPliku, false);

            String trescPliku = "";
            for (Map.Entry<Integer,Pracownik> entry: pracownicy.entrySet())
            {
                trescPliku += (entry.getKey() + ": " + entry.getValue().toString() + '\n');
            }
            fileWriter.write(trescPliku);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void DodajPracownikowDoPliku(HashMap<Integer,Pracownik> pracownicy, String adresPliku) throws Exception {
        try {
            fileWriter = new FileWriter(adresPliku, true);
            scanner = new Scanner(new File(adresPliku));

            ArrayList<Integer> zajeteId = new ArrayList<Integer>();
            while(scanner.hasNextLine())
            {
                String odczyt = scanner.nextLine();
                zajeteId.add(Character.getNumericValue(odczyt.toCharArray()[0]));
            }
            scanner.close();

            String trescPliku = "";
            for (Map.Entry<Integer,Pracownik> entry: pracownicy.entrySet())
            {
                if(zajeteId.contains(entry.getKey()))
                    throw new Exception();

                trescPliku += (entry.getKey() + ": " + entry.getValue().toString() + '\n');
            }
            fileWriter.write(trescPliku);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
