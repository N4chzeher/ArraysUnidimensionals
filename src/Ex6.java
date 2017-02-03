import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Ex6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.printf("Ingresa 10 numeros enteros");
        System.out.println();

        int suma=0;

        int num[]=new int[10];

        for (int i=0;i<num.length;i++){
            System.out.println("Numero "+(i+1)+":");
            num[i]=sc.nextInt();

        }
        for (int i=0;i<num.length;i++){

            if (i%2!=0){

                suma=suma+num[i];

            }

        }

        System.out.println("Suma: "+suma);
        System.out.println("Mwdia: "+suma/5);



    }
}
