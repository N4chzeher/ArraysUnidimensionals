import sun.security.util.Length;

import java.lang.reflect.Array;

/**
 * Created by NACHZEHER on 10/01/2017.
 */
public class Ex1 {

    public static void main(String[] args) {

        int cont=2;

        int pares[] = new int[20];

        for (int i=0; i< pares.length;i++){

            pares[i]=cont;
            cont +=2;
        }

        for (int i=0; i< pares.length;i++){

            System.out.println(pares[i]);
        }





    }

}
