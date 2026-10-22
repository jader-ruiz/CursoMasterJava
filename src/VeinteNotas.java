import java.util.Scanner;
// 21/10/2026; Seccion 5 Flujo Control
public class VeinteNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double sumaTotal = 0;

        int masCinco = 0;
        int menosCuatro = 0;
        int unos = 0;
        double promedio = 0;

        System.out.println("Digite nota 1-7");
        for(int i = 0; i < 20; i++){
            System.out.print("Nota "+(i+1)+": ");
            nota = sc.nextDouble();

            if(nota < 1 || nota > 7){
                System.out.println("Nota invalida!");
                System.exit(0);
                break;
            }

            sumaTotal += nota;
            if(nota > 5) masCinco++;
            if(nota < 5) menosCuatro++;
            if(nota == 1) unos++;

        }

        promedio = sumaTotal/20;
        masCinco = (masCinco/20)*100;
        menosCuatro = (menosCuatro/20)*100;

        System.out.println("Promedio: "+promedio);
        System.out.println("Mas de 5: "+masCinco+"%");
        System.out.println("Menos de 5: "+menosCuatro+"%");
        System.out.println("Unos: "+unos);

    }
}
