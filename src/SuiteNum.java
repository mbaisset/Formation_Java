import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class SuiteNum {
    public static void main (String[] args) {
        double u = 1;
        double v = u;

        for (int i = 1; i < 11; ++i) {
            System.out.println("u" + i + " = " + u);
            v = v + u;
            System.out.println("v" + i + " = " + v);
            u = u / (i + 1);
        }
    }
}
