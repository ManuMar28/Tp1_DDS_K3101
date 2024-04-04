import static java.lang.System.exit;
import static java.sql.DriverManager.println;

public class Inscripcion{
    public static boolean correlativasAprobadas(Materia materia, Alumno alumno){
            return alumno.getMaterias().containsAll(materia.getCorrelativas());
    }

    public static void inscripcionDelAlumno(Alumno alumno){
        for (Materia materia : alumno.getMateriasQueQuiereCursar()){
            if(!correlativasAprobadas(materia, alumno)){
                System.out.println("La inscripcion fue rechazada");
                exit(0);
            }
        }
        System.out.println("La inscripcion fue aceptada");
    }



}
