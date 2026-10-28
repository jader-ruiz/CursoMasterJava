package poo;

public class EjemploAutomovilStaticRelacionObjetos {
    public static void main(String[] args) {
        Automovil.setColorPatente(Color.AZUL);

        Rueda[] ruedaBmw = new Rueda[5];
        for(int i = 0; i < ruedaBmw.length; i++){
            ruedaBmw[i] = new Rueda("Best", 18, 8.77);
        }
        Automovil bmw = new Automovil("BMW", "M4", Color.NEGRO, new Motor(), new Estanque(50), new Persona("Jader", "Ruiz"), ruedaBmw);
        Automovil toyota = new Automovil("TOYOTA", "HILUX", Color.GRIS, new Motor(), new Estanque(43), new Persona("Alfredo", "Ruiz"), null);
        Automovil mazda = new Automovil("MAZDA", "3", Color.ROJO, new Motor(), new Estanque(25), new Persona("Luis", "Ruiz"), null);
        Automovil nissan = new Automovil("NISSAN", "TOURISM", Color.BLANCO, new Motor(), new Estanque(77), new Persona("Elkin", "Suarez"), null);

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
