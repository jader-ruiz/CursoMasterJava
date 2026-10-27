package poo;

import java.util.Locale;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Automovil ferrari = new Automovil();

        System.out.println(auto.acelerarFrenar(7500));

        ferrari.setFabricante("Ferrari");
        ferrari.setModelo("F-129");
        ferrari.setColor(Color.ROJO);
        ferrari.setCilindrada(12000.63);

        System.out.println(ferrari.detalle());
        System.out.println(ferrari.acelerarFrenar(9500));
        System.out.println(ferrari.calcularConsumo(130, 0.5f));

        Automovil mazda = new Automovil("Mazda", "3",Color.NEGRO,3600.45, 23);
        Automovil mazdaR = new Automovil("Mazda", "3",Color.NEGRO,3600.45, 23);
        System.out.println(mazda.equals(mazdaR));
        System.out.println(mazda.equals(auto));
        System.out.println(mazda);



    }
}
