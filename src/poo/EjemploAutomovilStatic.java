package poo;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setColorPatente(Color.AZUL);
        Automovil bmw = new Automovil("BMW", "M4", Color.NEGRO);
        Automovil toyota = new Automovil("TOYOTA", "HILUX", Color.GRIS);
        Automovil mazda = new Automovil("MAZDA", "3", Color.ROJO);
        Automovil nissan = new Automovil("NISSAN", "TOURISM", Color.BLANCO);
        Automovil.setCapacidadStatic(50);
        System.out.println(Automovil.calcularConsumoStatic(300,0.53f ));

        mazda.setTipo(TipoAutomovil.SEDAN);
        mazda.setMotor(new Motor());
        bmw.setTipo(TipoAutomovil.COUPE);
        bmw.setMotor(new Motor());
        toyota.setTipo(TipoAutomovil.STATION_WAGON);
        toyota.setMotor(new Motor());
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setMotor(new Motor());

        System.out.println(bmw.detalle());
        System.out.println(toyota.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("\nVel Max Carretera = " + Automovil.getVelocidadMaxCarretera() + "km/h");
        System.out.println("Vel Max Ciudad = " + Automovil.getVelocidadMaxCiudad() + "km/h");
    }
}
