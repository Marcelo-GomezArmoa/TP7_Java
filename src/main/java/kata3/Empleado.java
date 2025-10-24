package kata3;

/**
 * Clase abstracta Empleado para demostrar polimorfismo en cálculos
 * Establece la estructura base para diferentes tipos de empleados
 */
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected int id;
    
    /**
     * Constructor de la clase abstracta Empleado
     * @param nombre El nombre del empleado
     * @param apellido El apellido del empleado
     * @param id El ID único del empleado
     */
    public Empleado(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    /**
     * Método abstracto para calcular el sueldo
     * Cada tipo de empleado tendrá su propia implementación
     * @return El sueldo calculado del empleado
     */
    public abstract double calcularSueldo();
    
    /**
     * Método abstracto para obtener el tipo de empleado
     * @return Una cadena que describe el tipo de empleado
     */
    public abstract String getTipoEmpleado();
    
    /**
     * Método concreto para mostrar información básica del empleado
     */
    public void mostrarInformacion() {
        System.out.println("=== Información del Empleado ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Tipo: " + getTipoEmpleado());
        System.out.println("Sueldo: $" + String.format("%.2f", calcularSueldo()));
    }
    
    /**
     * Método para obtener el nombre completo del empleado
     * @return El nombre completo del empleado
     */
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}