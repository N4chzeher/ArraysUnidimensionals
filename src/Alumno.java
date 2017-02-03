/**
 * Created by NACHZEHER on 29/01/2017.
 */
public class Alumno {

    private String nombre;
    private Double nota;


    public Alumno(String nombre,double nota){

        this.nombre=nombre;
        this.nota=nota;

    }

    public String getNombre() {
        return nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
