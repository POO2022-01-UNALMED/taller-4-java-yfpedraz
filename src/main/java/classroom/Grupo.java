package classroom;

public class Grupo {

    Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    int codigo = 0;
    String horario;

    Grupo(int cantidadEstudianes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudianes], profesor, asignatura, codigo, horario);
    }


    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
