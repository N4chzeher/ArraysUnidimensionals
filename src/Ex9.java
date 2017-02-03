import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by NACHZEHER on 01/02/2017.
 */
public class Ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrece  10 numeros enteros");
        System.out.println("para terminar ingrese 0");

        int tendos = 0;

        int numeros[] = new int[10];


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("numero: ");
            numeros[i] = sc.nextInt();

        }


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 10 == 2) {
                tendos++;


            }

        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("Numeros terminados en 2: "+tendos);


    }


}



