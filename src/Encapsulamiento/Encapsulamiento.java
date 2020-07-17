package Encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        //creamos un objeto
        Persona p1 = new Persona("Joel","Leiva",false);
        //accedemos al atributo del nombre
        System.out.println("Nombre de p1"+p1.getNombre());

        //creamos un objeto
        Persona p2= new Persona("Edith","Leiva",false);
        //imprimimos el estado completo del objeto
        System.out.println("Estado objeto p2" +p2);

        //marcamos como eliminada a la persona
        p2.setBorrado(true);
        //imprimimos el estado completo del objeto
        System.out.println("Estado obejto p2"+p2);

        //creamos un tercerobjeto vacio
        Persona p3 =new Persona();
        System.out.println("Etsado obejto p3 "+p3);
    }
}
