import java.util.Arrays;
import java.util.Scanner;

public class Sõnad {
    private String sõna;

    public Sõnad(String sõna) {
        this.sõna = sõna;
    }

    //sõna morsekeelseks sõnaks
    public void sõnaTeisendus(String lõikamine, String sidumine, int indeks1, int indeks2){
        String[] sõnaTähed = sõna.split(lõikamine);
        System.out.println(Arrays.toString(sõnaTähed));
        String sõnaTeisendus = "";
        Tähed tähed = new Tähed();

        for (String s : sõnaTähed) {
            for (int j = 0; j < tähed.getTähed().length; j++) {
                if (s.equals(tähed.getTähed()[j][indeks1])) {
                    sõnaTeisendus += tähed.getTähed()[j][indeks2] + sidumine;
                }
            }
        }
        System.out.println("Teisenda sõna: " + sõna);
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta vastus: ");
        String sisestus = input.nextLine();
        System.out.println("vastus:" + sisestus);

        if (sidumine.equals("/")) sõnaTeisendus = sõnaTeisendus.substring(0,sõnaTeisendus.length()-1); //kui seotakse "/" sellega, siis siin eemaltatakse viimane kaldkriips

        if(sisestus.equals(sõnaTeisendus)){
            System.out.println("Õige vastus!");
        }else{
            System.out.println("Vale vastus!");
        }
    }
}
