import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Ex3 {

    public static void main(String[] args) {



    Scanner sc =new Scanner(System.in);

        int pos=0;
        int neg=0;
        int sumpos=0;
        int sumneg=0;


    int ent[]=new int[10];

    System.out.println("Ingresa 10 numeros enteros");

    for (int i =0; i<ent.length; i++){

        System.out.println("Numero "+(i+1)+":");
        ent[i]=sc.nextInt();

        if (ent[i]>0){

            pos++;
            sumpos=sumpos+ent[i];
        }
        else {

            neg++;
            sumneg=sumneg+ent[i];
        }

    }

        System.out.println(Arrays.toString(ent));
        System.out.println(sumpos/pos);
        System.out.println(sumneg/neg);

    }



}

