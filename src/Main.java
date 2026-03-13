import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Empleado> lstEmpleados = new ArrayList<>();

        int op = -1;
        do {
            System.out.println("----- Sistema Registro Empleados-----");
            System.out.println("1. Crear Empleado administrativo");
            System.out.println("2. Crear Empleado de ventas");
            System.out.println("3. Crear Empleado por horas");
            System.out.println("4. mostrar todos los empleados");
            System.out.println("5. Calcular salario final del empleado");
            System.out.println("6. Aumentar salario del empleado");
            System.out.println("7. Mostrar empleados mayores de edad");
            System.out.println("8. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("cree al empleado administrativo");
                    System.out.println("1. nombre: ");
                    String nombreAdmin = sc.nextLine();

                    System.out.println("2. edad: ");
                    int edadAdmin = sc.nextInt();

                    System.out.println("3. Salario base: ");
                    double salarioBaseAdmin = sc.nextDouble();

                    System.out.println("4. Bonificacion: ");
                    double bonificacion = sc.nextDouble();

                    Empleado ea1 = new EmpleadoAdministrativo(nombreAdmin, edadAdmin, salarioBaseAdmin, bonificacion);
                    lstEmpleados.add(ea1);

                    break;

                case 2:
                    System.out.println("cree al empleado de ventas");
                    System.out.println("1. nombre: ");
                    String nombreVentas = sc.nextLine();

                    System.out.println("2. edad: ");
                    int edadVentas = sc.nextInt();

                    System.out.println("3. Salario base: ");
                    double salarioBaseVentas = sc.nextDouble();

                    System.out.println("4. Total ventas: ");
                    double totalVentas =  sc.nextDouble();

                    System.out.println("5. Comisión ");
                    double comision = sc.nextDouble();

                    Empleado ev1 = new EmpleadoVentas(nombreVentas, edadVentas, salarioBaseVentas, totalVentas, comision);
                    lstEmpleados.add(ev1);

                    break;

                case 3:
                    System.out.println("cree al empleado por horas");
                    System.out.println("1. nombre: ");
                    String nombreHora = sc.nextLine();

                    System.out.println("2. edad: ");
                    int edadHora = sc.nextInt();

                    System.out.println("3. Salario base: ");
                    double salarioBaseHora =  sc.nextDouble();

                    System.out.println("4. Total horas trabajadas: ");
                    int horasTrabajadas =  sc.nextInt();

                    System.out.println("5. Valor Horas: ");
                    double valorHora = sc.nextDouble();

                    Empleado eh1 = new EmpleadoHoras(nombreHora, edadHora, salarioBaseHora, horasTrabajadas, valorHora);
                    lstEmpleados.add(eh1);

                    break;

                case 4:
                    System.out.println("Mostrar todos los empleados");
                    if (lstEmpleados.isEmpty()){
                        System.out.println("Empleado Desconocido");
                    }
                    else {
                        for (Empleado e : lstEmpleados){
                            e.mostrarInfo();
                            System.out.println("=======Lista de Empleados========");
                        }

                    }



                    break;


            }
        }
        while (op != -1);


    }
}