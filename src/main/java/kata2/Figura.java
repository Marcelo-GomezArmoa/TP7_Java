package kata2;

/**
 * Clase abstracta Figura para demostrar clases y métodos abstractos
 * No puede ser instanciada directamente
 */
public abstract class Figura {
    protected String nombre;  // Atributo protegido accesible por subclases
    
    /**
     * Constructor de la clase abstracta
     * @param nombre El nombre de la figura
     */
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * Cada figura calculará su área de manera específica
     * @return El área de la figura
     */
    public abstract double calcularArea();
    
    /**
     * Método concreto que puede ser usado por todas las subclases
     * @return El perímetro de la figura (implementación por defecto)
     */
    public abstract double calcularPerimetro();
    
    /**
     * Método concreto compartido por todas las figuras
     */
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
    
    /**
     * Método para obtener el nombre de la figura
     * @return El nombre de la figura
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método para establecer el nombre de la figura
     * @param nombre El nuevo nombre de la figura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}