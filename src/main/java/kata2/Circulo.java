package kata2;

/**
 * Clase Circulo que extiende de Figura
 * Implementa los métodos abstractos de la clase padre
 */
public class Circulo extends Figura {
    private double radio;
    
    /**
     * Constructor del círculo
     * @param radio El radio del círculo
     */
    public Circulo(double radio) {
        super("Círculo");  // Llamada al constructor de la clase padre
        this.radio = radio;
    }
    
    /**
     * Implementación del método abstracto calcularArea()
     * Fórmula: π * r²
     * @return El área del círculo
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Implementación del método abstracto calcularPerimetro()
     * Fórmula: 2 * π * r
     * @return El perímetro del círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Sobrescritura del método mostrarInfo para incluir información específica
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Radio: " + radio);
        super.mostrarInfo();  // Llama al método de la clase padre
    }
    
    /**
     * Método específico del círculo
     * @return El diámetro del círculo
     */
    public double calcularDiametro() {
        return 2 * radio;
    }
    
    // Getter y setter
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
}