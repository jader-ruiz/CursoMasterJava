import java.util.Scanner;
// 21/10/2026; Seccion 5 Flujo Control
public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas numeros para comprobar: ");
        int veces =  sc.nextInt();

        if (veces < 10){
            System.out.println("Minimo 10...");
            System.exit(0);
        }

        int menor = 0;
        int aux = 0;

        System.out.print("Numero 1: ");
        menor  = sc.nextInt();

        for (int i = 1; i < veces; i++) {
            System.out.print("Numero "+(i+1)+": ");
            aux = sc.nextInt();

            if (aux < menor) menor = aux;
        }

        System.out.println("menor = " + menor);
        if(menor < 10) System.out.println("El número menor es menor que 10!");
        else System.out.println("El numero menor es igual o mayor que 10!");

    }
}
