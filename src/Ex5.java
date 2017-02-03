import java.util.*;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Ex5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        List<Empleado> listadeempleados=new ArrayList<>();


        for (int i=0; i<19;i++){

            System.out.println("Die el nombre del empleado:");
            String nombre=sc.nextLine();
            System.out.println("Sueldo?");
            Double sueldo=sc.nextDouble();sc.nextLine();

            Empleado empleado=new Empleado(nombre,sueldo);

            listadeempleados.add(empleado);


        }




        System.out.println("Top empleados con mejor sueldo");
        System.out.println();

        listadeempleados.sort(Comparator.comparing(Empleado::getSueldo).reversed());
        System.out.println(listadeempleados.get(0));

        //   listadeempleados.stream().max(Comparator.comparing(Empleado::getSueldo)).ifPresent(
        //   empleado -> System.out.println(empleado)
        //   );











    }


}
