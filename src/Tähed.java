import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Tähed {
    private String[][] tähed = {{"A", "*-"}, {"B", "-***"}, {"C", "-*-*"}, {"D", "-**"}, {"E", "*"},
            {"F", "**-*"}, {"G", "--*"}, {"H", "****"}, {"I", "**"}, {"J", "*---"}, {"K", "-*-"}, {"L", "*-**"},
            {"M", "--"}, {"N", "-*"}, {"O", "---"}, {"P", "*--*"}, {"Q", "--*-"}, {"R", "*-*"}, {"S", "***"},
            {"Z", "--**"}, {"T", "-"}, {"U", "**-"}, {"V", "***-"}, {"W", "*--"}, {"Ä", "*-*-"}, {"Ö", "---*"}, {"Õ", "---*"},
            {"Ü", "**--"}, {"X", "-**-"}, {"Y", "-*--"}};

    // private String[][] tähed = {{"A", "*-"}, {"B", "-***"}, {"C", "-*-*"}, {"D", "-**"}}; katsetamiseks hea


    String[] suvaline() {
        int suvalineIndeks = (int) (random() * tähed.length);
        return tähed[suvalineIndeks];
    }

    @Override
    public String toString() {
        return "Tähestik: " + Arrays.deepToString(tähed);
        //natuke ilusamaks vaja teha
    }

    void teisendus(int i) {
        //vihjed ja tähtede eemaldamine
        int j = 0;
        if (i == 0) j = 1;
        ArrayList<String> õpitudTähed = new ArrayList<>();

        while (true) {
            String[] paar = suvaline();     //õigete vastuste korral tähed ei kordu
            if (õpitudTähed.contains(paar[0])) continue;
            System.out.println(paar[i]);

            while (true) {
                Scanner input = new Scanner(System.in);
                System.out.println("Sisesta vastus: ");
                String sisestus = input.nextLine();
                System.out.println("vastus:" + sisestus);

                if (sisestus.equals(paar[j])) {
                    System.out.println("Õige vastus");
                    õpitudTähed.add(paar[0]);
                    break;
                } else {
                    System.out.println("Proovi uuesti");
                    System.out.println(paar[i]);
                }
            }
            if (õpitudTähed.size() == tähed.length) {     //kui kõik tähed on korra õigesti kirjutatud, siis programm lõppeb ise
                System.out.println("Kõik on õpitud!");
                break;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Soovid jätkata? (jah/ei) ");
            String jätkamine = input.nextLine();
            System.out.println("vastus:" + jätkamine);

            if (jätkamine.equals("ei")) {
                System.out.println("Tagasi algusesse :)");
                break;
            }
        }
    }
}
