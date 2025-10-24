package kata1;

/**
 * Clase base Vehiculo para demostrar herencia básica
 * Demuestra el uso de modificadores de acceso y métodos base
 */
public class Vehiculo {
    protected String marca;    // protected permite acceso desde subclases
    protected String modelo;   // protected para permitir herencia
    
    /**
     * Constructor de la clase base
     * @param marca La marca del vehículo
     * @param modelo El modelo del vehículo
     */
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    /**
     * Método que muestra información básica del vehículo
     * Este método puede ser sobrescrito por las subclases
     */
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo);
    }
    
    // Getters y setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}