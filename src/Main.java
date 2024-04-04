import java.util.ArrayList;

import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) {
        //ALUMNO
        Alumno manuel = new Alumno();
        ArrayList<Materia> materiasQueQuiereCursar = new ArrayList<>();
        ArrayList<Materia> materiasQueTiene = new ArrayList<>();

        //MATERIAS
        Materia fisica = new Materia();
        Materia analisis = new Materia();
        Materia algoritmos = new Materia();
        Materia algebra = new Materia();
        ArrayList<Materia> correlativasFisica = new ArrayList<>();
        ArrayList<Materia> correlativasAnalisis = new ArrayList<>();

        //SETEO DE MATERIAS
        correlativasFisica.add(algoritmos);
        correlativasFisica.add(algebra);
        correlativasAnalisis.add(algebra);

        fisica.setNombre("fisica");
        analisis.setNombre("analisis");
        algoritmos.setNombre("algoritmos");
        algebra.setNombre("algebra");

        fisica.setCorrelativas(correlativasFisica); //Fisica tiene como correlativas a algoritmos y algebra
        analisis.setCorrelativas(correlativasAnalisis); //Analisis tiene como correlativa a algebra

        //SETEO DE ALUMNO Y SUS MATERIAS
        manuel.setLegajo(1234);
        materiasQueQuiereCursar.add(fisica);
        materiasQueQuiereCursar.add(analisis);
        materiasQueTiene.add(algoritmos); //Si borramos esta linea de codigo la cual agrega a algoritmos a las materias aprobadas del alumno, al runnear el programa rechazara la inscripcion
        materiasQueTiene.add(algebra);
        manuel.setMaterias(materiasQueTiene);
        manuel.setMateriasQueQuiereCursar(materiasQueQuiereCursar);

        //INSCRIPCION
        //System.out.println("ArrayList: " + correlativasAnalisis);
        Inscripcion.inscripcionDelAlumno(manuel);
    }
}