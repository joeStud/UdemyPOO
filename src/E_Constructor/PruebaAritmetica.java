package E_Constructor;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos un objeto de la clase aritmetica con el contructor vacio
        Aritmetica obj1 = new Aritmetica();
        //llamamos al metodo
        int resultado = obj1.sumar(3,5);
        //
        System.out.println("Resultado suma directa obj1: "+resultado);

        System.out.println("Resultado suma atributos obj1: "+obj1.sumar());

        //creamos unobejto con el constructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(2,1);

        System.out.println("\nResultado suma atributos obj2: "+ obj2.sumar());

    }

}
