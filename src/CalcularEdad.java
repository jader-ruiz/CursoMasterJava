import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// 23/10 Seccion 8 Clase Date y Calendar
public class CalcularEdad {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su fecha de nacimiento 'dd/MM/yyyy'");
        String nacimiento = sc.nextLine();
        try {
            Date fechaNacimiento = sdf.parse(nacimiento);
            Date fechaActual = new Date();

            Calendar calNacimiento = Calendar.getInstance();
            calNacimiento.setTime(fechaNacimiento);

            Calendar calActual = Calendar.getInstance();
            calActual.setTime(fechaActual);

            if(fechaNacimiento.before(fechaActual)){
                int edad = 0;
                if(fechaNacimiento.getMonth() > fechaActual.getMonth()){
                    edad = ((fechaActual.getYear() - fechaNacimiento.getYear())-1);
                }else if(fechaNacimiento.getMonth() == fechaActual.getMonth()){
                    if(calNacimiento.get(Calendar.DAY_OF_MONTH) > calActual.get(Calendar.DAY_OF_MONTH)){
                        edad = ((fechaActual.getYear() - fechaNacimiento.getYear())-1);
                    }else if(calNacimiento.get(Calendar.DAY_OF_MONTH) == calActual.get(Calendar.DAY_OF_MONTH) ||
                            calNacimiento.get(Calendar.DAY_OF_MONTH) < calActual.get(Calendar.DAY_OF_MONTH)){
                        edad = (fechaActual.getYear() - fechaNacimiento.getYear());
                    }
                }else if(fechaNacimiento.getMonth() < fechaActual.getMonth()){
                    edad = ((fechaActual.getYear() - fechaNacimiento.getYear()));
                }
                System.out.println(edad+" años");
            }else System.out.println("Fecha invalida!");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
