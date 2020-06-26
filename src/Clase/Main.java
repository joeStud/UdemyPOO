package Clase;

public class Main {
    public static void main(String[] args) {
        //creacion de  un objeto
        Persona persona = new Persona();

        //llamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        persona.desplegarNombre();

        //modificar valores
        persona.nombre="Joel";
        persona.apellidoPaterno="Leiva";
        persona.apellidoMaterno="Collazos";

        //volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        persona.desplegarNombre();

        //creacion de unobejto
        Persona persona1= new Persona();

        System.out.println("Valores por default del obejto Persona");
        persona1.desplegarNombre();

        persona1.nombre="Arseño";
        persona1.apellidoPaterno="Caceres";
        persona1.apellidoMaterno="Sierra";

        persona1.desplegarNombre();



    }
}
