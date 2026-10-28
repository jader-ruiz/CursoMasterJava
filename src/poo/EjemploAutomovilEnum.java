package poo;


public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil mazda = new Automovil("Mazda", "3", Color.NEGRO);

        mazda.setTipo(TipoAutomovil.SEDAN);

        switch (mazda.getTipo()){
            case SEDAN -> System.out.println("Algo...");
            case COUPE -> System.out.println("Otro...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta: tipos){
            System.out.println(ta);
        }
    }
}
