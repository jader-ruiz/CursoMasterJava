import java.util.Scanner;
// 18/10/2026; Section 2 Variables
public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el nombre de la factura: ");
        String nombreFactura = sc.nextLine();

        System.out.print("Ingrese el valor del producto 1: ");
        double producto1 = sc.nextDouble();
        System.out.print("Ingrese el valor del producto 2: ");
        double producto2 = sc.nextDouble();

        double totalBruto =  (producto1 + producto2);
        double totalImpuesto =  totalBruto * 0.19;
        double total = totalImpuesto + totalBruto;

        String mensaje = nombreFactura+" tiene un total bruto de: "+totalBruto+", con un impuesto de "+totalImpuesto+" y el monto despues de impuesto es de: "+total;
        System.out.println(mensaje);

    }
}