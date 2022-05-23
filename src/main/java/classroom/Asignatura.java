package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    short codigoInterno;
    int codigoExterno;

    Asignatura() {
        this("Sin nombre",(short) 0,0);
    }

    Asignatura(short codigoInterno) {
        this("Sin nombre", codigoInterno, 0);
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", (short) 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, (short) 0, 0);
    }

    Asignatura(String nombre, short codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = (short) codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(short codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(short codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(short codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (short) codigoInterno;
    }

}
