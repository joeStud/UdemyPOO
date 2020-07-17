package Encapsulamiento;

public class Persona {
    //constructor vacio
    public Persona() {
    }

    //constructor con 3 argumentos
    public Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    //atributos privados
    private String nombre;
    private String apellido;
    private boolean borrado;

    //metodos publicos para acceder o modificar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    //metodo que imprime el estado del objeto

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", borrado=" + borrado +
                '}';
    }
}


