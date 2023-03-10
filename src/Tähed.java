import java.util.Arrays;

import static java.lang.Math.random;

public class Tähed {
    private final String[][] tähed = {{"A", "*-"}, {"B", "-***"}, {"C", "-*-*"}, {"D", "-**"}, {"E", "*"},
            {"F", "**-*"}, {"G", "--*"}, {"H", "****"}, {"I", "**"}, {"J", "*---"}, {"K", "-*-"}, {"L", "*-**"},
            {"M", "--"}, {"N", "-*"}, {"O","---"},{"P","*--*"}, {"Q", "--*-"}, {"R","*-*"},{"S","***"},
            {"Z","--**"},{"T","-"},{"U","**-"},{"V","***-"},{"W","*--"},{"Ä","*-*-"},{"Ö","---*"},{"Õ","---*"},
            {"Ü","**--"},{"X","-**-"},{"Y","-*--"}};

    String[] suvaline(){
        int suvalineIndeks  = (int) (random() * tähed.length);
        return tähed[suvalineIndeks];
    }
}
