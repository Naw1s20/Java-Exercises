package Git1;
import javax.swing.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalculadoraEdad {
    public static void main(String[] args) {
        String fechaNacimiento =
                JOptionPane.showInputDialog(
                        "Inserte su fecha de nacimiento con el siguiente formato: dd-MM-yyyy");


            //creamos el formato de la fecha que vamos a usar.
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        try {
            //creamos el objeto fecha que usaremos tanto el formato como el string para crear el date
            Date fecha = format.parse(fechaNacimiento);
            //creamos el string de la fecha con el formato que queremos
            String fechaFormateada = format.format(fecha);
            System.out.println("La fecha de nacimiento es: " + fechaFormateada);
            System.out.println("La fecha de nacimiento es: " + fecha);

            //creamos calendario con fecha actual
            Calendar calActual = Calendar.getInstance();

            // creamos un calendario con la fecha de nacimiento
            Calendar fechaNacCalendar = Calendar.getInstance();
            fechaNacCalendar.setTime(fecha);

            //calculamos la edad restando los años de las fechas de los calendarios.
            int edad = calActual.get(Calendar.YEAR) - fechaNacCalendar.get(Calendar.YEAR);


            if (calActual.get(Calendar.DAY_OF_YEAR)<fechaNacCalendar.get(Calendar.DAY_OF_YEAR)){
                edad--;
            }

            System.out.println("usted tiene "+edad+ " años");





        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
