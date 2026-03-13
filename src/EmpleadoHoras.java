public class EmpleadoHoras extends Empleado{

    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, int edad, double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, edad, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor hora: " + valorHora);
    }
}
