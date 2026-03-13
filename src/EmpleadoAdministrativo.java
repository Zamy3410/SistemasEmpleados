public class EmpleadoAdministrativo extends Empleado {

    private double bonificacion;

    public EmpleadoAdministrativo() {
    }

    public EmpleadoAdministrativo(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() +  "EmpleadoAdministrativo{" +
                "bonificacion=" + bonificacion +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Bonificacion " + bonificacion);
    }
}
