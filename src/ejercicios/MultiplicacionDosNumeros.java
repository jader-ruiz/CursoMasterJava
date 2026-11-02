import java.util.Scanner;
// 21/10/2026; Seccion 5 Flujo Control
public class MultiplicacionDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el primer numero: ");
        int numA = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numB = sc.nextInt();

        int posA = Math.abs(numA);
        int posB = Math.abs(numB);

        int total = 0;
        for(int i = 0; i < posB; i++ ) {
            total += posA;
        }

        if(numA < 0 && numB > 0 || numA > 0 && numB < 0) {
            total = -total;
        }

        System.out.println(total);

    }
}
