package kata2;

/**
 * Clase Rectangulo que extiende de Figura
 * Implementa los métodos abstractos de la clase padre
 */
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    /**
     * Constructor del rectángulo
     * @param ancho El ancho del rectángulo
     * @param alto El alto del rectángulo
     */
    public Rectangulo(double ancho, double alto) {
        super("Rectángulo");  // Llamada al constructor de la clase padre
        this.ancho = ancho;
        this.alto = alto;
    }
    
    /**
     * Implementación del método abstracto calcularArea()
     * Fórmula: ancho * alto
     * @return El área del rectángulo
     */
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
    
    /**
     * Implementación del método abstracto calcularPerimetro()
     * Fórmula: 2 * (ancho + alto)
     * @return El perímetro del rectángulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
    
    /**
     * Sobrescritura del método mostrarInfo para incluir información específica
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        super.mostrarInfo();  // Llama al método de la clase padre
    }
    
    /**
     * Método específico del rectángulo para verificar si es cuadrado
     * @return true si es cuadrado, false en caso contrario
     */
    public boolean esCuadrado() {
        return ancho == alto;
    }
    
    /**
     * Método específico para calcular la diagonal
     * @return La diagonal del rectángulo
     */
    public double calcularDiagonal() {
        return Math.sqrt(ancho * ancho + alto * alto);
    }
    
    // Getters y setters
    public double getAncho() {
        return ancho;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    public void setAlto(double alto) {
        this.alto = alto;
    }
}