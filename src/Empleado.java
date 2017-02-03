import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Empleado {

    private String nombre;
    private Double sueldo;


    public Empleado (String nombre, double sueldo){


        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
