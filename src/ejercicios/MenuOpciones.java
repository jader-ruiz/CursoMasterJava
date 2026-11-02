import java.util.Scanner;
// 21/10/2026; Seccion 5 Flujo Control
public class MenuOpciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Ingrese la opcion que desea");
        do {
            System.out.println("1. Actualizar\n2. Eliminar\n3. Agregar\n4. Listar\n5. Salir");
            System.out.print("Cual: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nUsuario actualizado correctamente");
                    break;
                case 2:
                    System.out.println("\nUsuario eliminado correctamente");
                    break;
                case 3:
                    System.out.println("\nUsuario agregado correctamente");
                    break;
                case 4:
                    System.out.println("\nSe muestra la lista de usuarios");
                    break;
                case 5:
                    System.out.println("\nHaz salido con exito!");
                    System.exit(0);
                default:
                    System.out.println("\nNumero invalido...");
            }
        }while(opcion != 5);
    }
}
