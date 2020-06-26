package E_Constructor;

public class Aritmetica {
    //atributos
    int a;
    int b;

    //contructor vacio
    public Aritmetica() {
    }

    Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    // este toma valores nuevos
    int sumar(int a,int b){
        return a+b;
    }
    //este metodo toma los atributos de la clase
    int sumar(){
        return a+b;
    }
}
