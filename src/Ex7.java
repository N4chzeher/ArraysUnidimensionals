import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma=0;


        List<Alumno> listaalumno = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Alumno: ");
            String nombre = sc.nextLine();

            System.out.println("Nota final: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            Alumno alumno = new Alumno(nombre, nota);

            listaalumno.add(alumno);

            suma=suma+nota;
        }
        double media=suma/(double)5;

        for (Alumno alumno : listaalumno){

            if (alumno.getNota()> media){

                System.out.println(alumno);

            }
        }

    }


}

