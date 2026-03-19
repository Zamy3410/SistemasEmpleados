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
            System.out.println("6. Aumentar salario  base del empleado");
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
                    System.out.println("Digite que empleado desea mostrar");
                    System.out.println("1. todos los empleados");
                    System.out.println("2. mostrar los empleados administrativos");
                    System.out.println("3. mostrar los empleados de ventas");
                    System.out.println("4. mostrar los empleados por horas");

                    int opMostrar = sc.nextInt();
                    sc.nextLine();

                    if (lstEmpleados.isEmpty()) {
                        System.out.println("no hay empleados registrados");
                        break;
                    }

                    boolean hayEmpleados = false;
                    for (Empleado e : lstEmpleados){
                        switch (opMostrar){
                            case 1:
                                e.mostrarInfo();
                                System.out.println("----------------");
                                hayEmpleados = true;
                                break;
                            case 2:
                                if (e instanceof EmpleadoAdministrativo){
                                    e.mostrarInfo();
                                    System.out.println("----------------");
                                    hayEmpleados = true;
                                }
                                break;
                            case 3:
                                if (e instanceof EmpleadoVentas){
                                    e.mostrarInfo();
                                    System.out.println("----------------");
                                    hayEmpleados = true;
                                }
                                break;
                            case 4:
                                if (e instanceof EmpleadoHoras){
                                    e.mostrarInfo();
                                    System.out.println("----------------");
                                    hayEmpleados = true;
                                }
                                break;
                            default:
                                System.out.println("opción invalida");
                                break;

                        }
                    }

                    if (!hayEmpleados){
                        System.out.println("No hay empleados de este tipo uwu");
                    }

                    break;

                case 5:
                    System.out.println("Ingrese el nombre del empleado");
                    String nombreBuscar = sc.nextLine();

                    boolean encontrado = false;
                    for (Empleado e : lstEmpleados){
                        if (e.getNombre().equalsIgnoreCase(nombreBuscar)){
                            encontrado = true;
                            double salarioFinal = 0;

                            if (e instanceof EmpleadoAdministrativo ea) {
                                salarioFinal = ea.getSalarioBase() + ea.getBonificacion();
                            } else if (e instanceof EmpleadoVentas ev){
                                salarioFinal = ev.getSalarioBase() + (ev.getTotalVentas() * ev.getComision()/100);
                            } else if (e instanceof EmpleadoHoras eh){
                                salarioFinal = eh.getSalarioBase() + (eh.getHorasTrabajadas() * eh.getValorHora());
                            }

                            System.out.println("Salario final de " + e.getNombre() + ": " + salarioFinal);
                            break;

                        }
                    }
                    if (!encontrado){
                        System.out.println("empleado no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("A que empleado desea aumentarle el salario?");
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreAumento = sc.nextLine();

                    boolean encontradoAumento = false;
                    for (Empleado e : lstEmpleados){
                        if (e.getNombre().equalsIgnoreCase(nombreAumento)){
                            encontradoAumento = true;
                            System.out.println("Salario base actual: " + e.getSalarioBase());
                            System.out.println("Ingrese el monto a aumnetar: ");
                            double monto = sc.nextDouble();
                            sc.nextLine();

                            e.setSalarioBase(e.getSalarioBase() + monto);
                            System.out.println("Salario base actualizado: " + e.getSalarioBase());
                            break;
                        }
                    }
                    if (!encontradoAumento){
                        System.out.println("empleado no encontrado");
                    }
                    break;
                case 7:
                    System.out.println("Empleado mayores de edad:");
                    boolean hayMayores = false;

                    for (Empleado e : lstEmpleados){
                        if (e.getEdad() >= 18){
                            e.mostrarInfo();
                            System.out.println("---------------");
                            hayMayores = true;
                        }
                    }
                    if (!hayMayores){
                        System.out.println("No hay empleados mayores de edad");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del sistema uwu");
                    op = 8;
                    break;




            }
        }
        while (op != 8);


    }
}