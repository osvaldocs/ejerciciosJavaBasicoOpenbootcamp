package ejerciciosJavaBasico;

public class Ejercicio2 {

    public static void main(String[] args) {


        double resultado = getPriceIva(10.00);
        System.out.println(resultado);
    }

    public static double getPriceIva(double precio) {

        return precio + (precio * 0.21);

    }
}
//Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido