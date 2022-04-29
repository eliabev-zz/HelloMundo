import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class HelloMundo {
    public static void main(String[] args) {
        int[] arraial = new int[8];
        String[] letras = new String[15];
        arraial[1] = 75;
        String armazenar = "a1";
        for (int i = 0; i < letras.length; i++) {
            letras[i] = armazenar;
        }

        for (int j=0; j<arraial.length; j++) {
            System.out.println(arraial[j]);
        }

        for (int j=0; j<letras.length; j++) {
            System.out.println("Numero " + (j+1) + ": " + letras[j]);
        }
    }
}
