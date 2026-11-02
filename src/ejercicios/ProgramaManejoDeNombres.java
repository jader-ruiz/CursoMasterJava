import java.util.Scanner;
// 18/10/2026; Seccion 3: String
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese el nombre 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Ingrese el nombre 3: ");
        String nombre3 = sc.nextLine();

        char a = nombre1.charAt(1);
        String nombreUno = String.valueOf(Character.toUpperCase(a)).concat(".").concat(nombre1.substring(nombre1.length()-2));

        char b = nombre2.charAt(1);
        String nombreDos = String.valueOf(Character.toUpperCase(b)).concat(".").concat(nombre2.substring(nombre2.length()-2));

        char c = nombre3.charAt(1);
        String nombreTres = String.valueOf(Character.toUpperCase(c)).concat(".").concat(nombre3.substring(nombre3.length()-2));


        System.out.println(nombreUno.concat("_").concat(nombreDos).concat("_").concat(nombreTres));
    }
}