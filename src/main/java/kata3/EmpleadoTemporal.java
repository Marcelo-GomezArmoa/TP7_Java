package kata3;

/**
 * Clase EmpleadoTemporal que extiende de Empleado
 * Representa empleados temporales con pago por horas trabajadas
 */
public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    private int mesesContrato;  // duración del contrato en meses
    
    /**
     * Constructor para EmpleadoTemporal
     * @param nombre El nombre del empleado
     * @param apellido El apellido del empleado
     * @param id El ID del empleado
     * @param tarifaPorHora La tarifa que cobra por hora
     * @param horasTrabajadas Las horas trabajadas en el período
     * @param mesesContrato La duración del contrato en meses
     */
    public EmpleadoTemporal(String nombre, String apellido, int id, double tarifaPorHora, 
                           int horasTrabajadas, int mesesContrato) {
        super(nombre, apellido, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.mesesContrato = mesesContrato;
    }
    
    /**
     * Implementación del cálculo de sueldo para empleado temporal
     * Sueldo = tarifa por hora * horas trabajadas + bonus por contrato largo
     * @return El sueldo total calculado
     */
    @Override
    public double calcularSueldo() {
        double sueldoBase = tarifaPorHora * horasTrabajadas;
        
        // Bonus por contrato largo (más de 6 meses)
        double bonusContrato = 0;
        if (mesesContrato > 6) {
            bonusContrato = sueldoBase * 0.1; // 10% de bonus
        }
        
        return sueldoBase + bonusContrato;
    }
    
    /**
     * Implementación del tipo de empleado
     * @return La descripción del tipo de empleado
     */
    @Override
    public String getTipoEmpleado() {
        return "Empleado Temporal";
    }
    
    /**
     * Sobrescritura del método mostrarInformacion para incluir detalles específicos
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tarifa por hora: $" + String.format("%.2f", tarifaPorHora));
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Duración contrato: " + mesesContrato + " meses");
        
        if (mesesContrato > 6) {
            double bonus = (tarifaPorHora * horasTrabajadas) * 0.1;
            System.out.println("Bonus por contrato largo: $" + String.format("%.2f", bonus));
        }
    }
    
    /**
     * Método específico para calcular el promedio de horas por mes
     * @return El promedio de horas trabajadas por mes
     */
    public double promedioHorasPorMes() {
        if (mesesContrato == 0) return 0;
        return (double) horasTrabajadas / mesesContrato;
    }
    
    /**
     * Método para verificar si es un contrato de tiempo completo
     * @return true si trabaja más de 160 horas por mes en promedio
     */
    public boolean esTiempoCompleto() {
        return promedioHorasPorMes() >= 160;
    }
    
    /**
     * Método para verificar si tiene derecho a renovación de contrato
     * @return true si ha trabajado más de 3 meses y es tiempo completo
     */
    public boolean tieneDerechoRenovacion() {
        return mesesContrato >= 3 && esTiempoCompleto();
    }
    
    // Getters y setters
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public int getMesesContrato() {
        return mesesContrato;
    }
    
    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}