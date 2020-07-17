package palabraReturn;

public class PalabraReturn {
    public static void main(String[] args) {
        int resultado = sumar(4,5);
        System.out.println("Resultado :" +resultado);
    }

    public static int sumar(int a,int b){
        return a + b;
    }
}
