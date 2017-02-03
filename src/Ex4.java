import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int medidas;
        int personas;
        int mas = 0;
        int menos = 0;
        double suma = 0;



        System.out.println("Numero de personas a medir?");

        personas = sc.nextInt();
        medidas = personas;

        double alturas[] = new double[medidas];



        for (int i = 0; i < alturas.length; i++) {

            System.out.println("Altura " + (i + 1) + ":");
            alturas[i] = sc.nextDouble();
            suma = suma + alturas[i];

        }

        for (int i = 0; i < alturas.length; i++) {

            if (alturas[i]> suma/medidas){

                mas++;

                }
            else{
                menos++;
            }
        }

        System.out.println("Suma "+suma);
        System.out.println("Media "+suma/medidas);
        System.out.println("Mayores "+mas);
        System.out.println("Menores "+menos);



    }
}

