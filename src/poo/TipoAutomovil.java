package poo;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto diminuto", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 2),
    HATCHBACK("Hatchback", "Auto compacto", 4);



    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    @Override
    public String toString(){
        return nombre + ", " + descripcion + ", " + numeroPuerta;
    }

}
