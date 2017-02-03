import java.util.Scanner;

/**
 * Created by NACHZEHER on 17/01/2017.
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int cer = 0;

        int tabla[]=new int [10];

        System.out.println("Ingresa 10 numeros");

        for (int i=0; i< tabla.length;i++){

            System.out.println("Numero"+(i+1)+":");
            tabla[i]=sc.nextInt();
        }

        for (int i=0; i< tabla.length;i++){

            if (tabla[i]>0){

                pos++;
            }

            else if (tabla[i]<0){

                neg++;
            }
            else if (tabla[i]==0){

                cer++;
            }

        }

        System.out.println("Positivos: "+pos);
        System.out.println("Negativos: "+neg);
        System.out.println("Ceros: "+cer);





    }

}
