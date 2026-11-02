import javax.swing.*;
// 19/10/2026; Seccion 4 Operadores
public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el primer nombre").strip();
        String apellido1 =  JOptionPane.showInputDialog("Ingrese el primer apellido").strip();

        String nombre2 = JOptionPane.showInputDialog("Ingrese el segundo nombre").strip();
        String apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido").strip();

        String nombre3 = JOptionPane.showInputDialog("Ingrese el tercer nombre").strip();
        String apellido3 = JOptionPane.showInputDialog("Ingrese el tercer apellido").strip();

        String[] nombres = new String[3];
        String[] apellidos = new String[3];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        apellidos[0] = apellido1;
        apellidos[1] = apellido2;
        apellidos[2] = apellido3;

        String nombreUno = "";
        String nombreDos = "";
        String nombreTres = "";

        for(int i = 0; i < nombres.length; i++){
            String concat = nombres[i].concat(" ").concat(apellidos[i]);
            if(i == 0) nombreUno = concat;
            else if(i == 1) nombreDos = concat;
            else if(i == 2) nombreTres = concat;
        }

        String nombreMasLargo = nombreUno.length() > nombreDos.length() ? nombreUno : nombreDos;
        nombreMasLargo = nombreMasLargo.length() > nombreTres.length() ? nombreMasLargo : nombreTres;

        System.out.println(nombreMasLargo+"Tiene el nombre más largo.");
    }
}
