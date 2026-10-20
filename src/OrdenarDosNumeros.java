import java.util.Scanner;
// 19/10/2026; Seccion 4 Operadores
public class OrdenarDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        int primerNumero = sc.nextInt();

        System.out.print("Segundo numero: ");
        int segundoNumero = sc.nextInt();

        int numeroMayor = primerNumero > segundoNumero ? primerNumero : segundoNumero;
        int numeroMenor =  primerNumero < segundoNumero ? primerNumero : segundoNumero;
        System.out.println(numeroMayor + " " + numeroMenor);
    }
}
