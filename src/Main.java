import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*Una empresa desea registrar la información de cada empleado
     para ello un empleado debe ingresar con su usuario y contraseña
     una vez ingresado el empleado debe registrar la siguiente información:
     1 - Nombre completdo
     2 - Documento de identidad
     3 - valor hora
     4 - Cantidad de horas
     5 - Seleccionar un día de descanso a la semana (L-V)
     El sistema le debe mostrar al empleado:
     Su salario Neto, Salario Bruto, Deducción por Pensión, Deducción por salud, auxilio de transporte (si aplica) y bonificación del 10%
     Si no supera 2 2 SMMLV (sin incluir auxilio de transporte)
     Toda la información del empleado se debe mostrar en un mensaje descriptivo
      */

        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario");
        usuarioEmpleado = sc.nextLine(); /*Next Line se utiliza solamente cuando voy a capturar un texto*/

        System.out.println("Ingrese su contraseña");
        contrasenaUsuario = sc.nextLine();

        if( usuarioEmpleado.equals("mefisto") && contrasenaUsuario.equals("mefisto")){
            System.out.println("Ha ingresado de forma correcta");

            System.out.println("Ingrese el nombre del empleado");
            nombreEmpleado = sc.nextLine();

            System.out.println("Ingrese el número de documento del empleado");
            documentoIdentidad = sc.nextLine();

            System.out.println("¿Cuál es su día de descanso (Lunes - Viernes)?");
            diaDescanso = sc.nextLine();

            System.out.print("¿Cuál es el valor de la hora");
            valorHora = sc.nextDouble();

            System.out.print("Ingrese la cantidad de horas");
            cantidadHoras = sc.nextDouble();

            System.out.println("Ingrese el valor del salario minimo para este año");
            valorSalarioMinimo = sc.nextDouble();



            salarioBruto = valorHora * cantidadHoras;

            if (salarioBruto > valorSalarioMinimo*2 ){
                bonificacionEmpleado = 0;
                auxilioTransporte = 0;
            } else {
                bonificacionEmpleado = salarioBruto *0.1;
                auxilioTransporte = 200000;
            }

            salarioNeto = salarioBruto + bonificacionEmpleado + auxilioTransporte;

            System.out.println("El salario neto es: " +salarioNeto);






        } else {
            System.out.println("Credenciales incorrectas");
        }


    }
}