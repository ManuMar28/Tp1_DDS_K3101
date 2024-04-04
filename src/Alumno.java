import java.util.ArrayList;

public class Alumno
{
    private int legajo;
    private String nombre;
    ArrayList<Materia> materiasAprobadas = new ArrayList<>();
    ArrayList<Materia> materiasQueQuiereCursar = new ArrayList<>();

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materiasAprobadas;
    }

    public ArrayList<Materia> getMateriasQueQuiereCursar() {
        return materiasQueQuiereCursar;
    }

    public void setMateriasQueQuiereCursar(ArrayList<Materia> materiasQueQuiereCursar) {
        this.materiasQueQuiereCursar = materiasQueQuiereCursar;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materiasAprobadas = materias;
    }
}
