package kata3;

/**
 * Clase EmpleadoPlanta que extiende de Empleado
 * Representa empleados de planta con sueldo fijo y beneficios
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonificacion;
    private int antiguedad;  // años de antigüedad
    
    /**
     * Constructor para EmpleadoPlanta
     * @param nombre El nombre del empleado
     * @param apellido El apellido del empleado
     * @param id El ID del empleado
     * @param sueldoBase El sueldo base mensual
     * @param bonificacion La bonificación adicional
     * @param antiguedad Los años de antigüedad
     */
    public EmpleadoPlanta(String nombre, String apellido, int id, double sueldoBase, 
                         double bonificacion, int antiguedad) {
        super(nombre, apellido, id);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.antiguedad = antiguedad;
    }
    
    /**
     * Implementación del cálculo de sueldo para empleado de planta
     * Sueldo = sueldo base + bonificación + (antigüedad * 1000)
     * @return El sueldo total calculado
     */
    @Override
    public double calcularSueldo() {
        double adicionalAntiguedad = antiguedad * 1000; // $1000 por año de antigüedad
        return sueldoBase + bonificacion + adicionalAntiguedad;
    }
    
    /**
     * Implementación del tipo de empleado
     * @return La descripción del tipo de empleado
     */
    @Override
    public String getTipoEmpleado() {
        return "Empleado de Planta";
    }
    
    /**
     * Sobrescritura del método mostrarInformacion para incluir detalles específicos
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sueldo base: $" + String.format("%.2f", sueldoBase));
        System.out.println("Bonificación: $" + String.format("%.2f", bonificacion));
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Adicional por antigüedad: $" + String.format("%.2f", antiguedad * 1000));
    }
    
    /**
     * Método específico para calcular el aguinaldo
     * @return El monto del aguinaldo (sueldo base / 12)
     */
    public double calcularAguinaldo() {
        return sueldoBase / 12;
    }
    
    /**
     * Método para verificar si tiene derecho a vacaciones extendidas
     * @return true si tiene más de 5 años de antigüedad
     */
    public boolean tieneVacacionesExtendidas() {
        return antiguedad > 5;
    }
    
    // Getters y setters
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double getBonificacion() {
        return bonificacion;
    }
    
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
    
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}