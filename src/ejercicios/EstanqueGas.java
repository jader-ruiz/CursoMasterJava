import java.util.Scanner;
// 19/10/2026; Seccion 4 Operadores
public class EstanqueGas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double estanqueMax = 70;
        String resultado = "";

        System.out.print("Litros: ");
        double litros = sc.nextDouble();

        if(litros <= estanqueMax){
            resultado = litros == estanqueMax ? "Estanque lleno" : resultado;
            resultado = litros < estanqueMax && litros >= 60 ? "Estanque casi lleno" : resultado;
            resultado = litros < 60 && litros >= 40 ? "Estanque 3/4" : resultado;
            resultado = litros < 40 && litros >= 35 ? "Medio estanque" : resultado;
            resultado = litros < 35 && litros >= 20 ? "Suficiente" : resultado;
            resultado = litros < 20 && litros >= 1 ? "Insuficiente" : resultado;
        }else System.out.println("Numero invalido.");

        System.out.println(resultado);
    }
}
