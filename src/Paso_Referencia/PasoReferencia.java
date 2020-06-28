package Paso_Referencia;



public class PasoReferencia {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p);
        modificarPerosna(p);
        imprimirNombre(p);
    }

    private static void modificarPerosna(Persona arg) {
        arg.cambiarNombre("Carlos");
    }

    private static void imprimirNombre(Persona p) {

        System.out.println("Valor recibido :"+p.obtenerNombre());
    }



}
