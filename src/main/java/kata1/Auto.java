package kata1;

/**
 * Clase Auto que extiende de Vehiculo
 * Demuestra herencia, uso de super() y sobrescritura de métodos
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;  // atributo específico de Auto
    
    /**
     * Constructor que utiliza super() para inicializar la clase padre
     * @param marca La marca del auto
     * @param modelo El modelo del auto
     * @param cantidadPuertas La cantidad de puertas del auto
     */
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);  // Llamada al constructor de la clase padre
        this.cantidadPuertas = cantidadPuertas;
    }
    
    /**
     * Sobrescritura del método mostrarInfo()
     * Demuestra polimorfismo y el uso de @Override
     */
    @Override
    public void mostrarInfo() {
        // Llamamos al método de la clase padre
        super.mostrarInfo();
        // Agregamos información específica del auto
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
        System.out.println("Tipo: Automóvil");
    }
    
    /**
     * Método específico de la clase Auto
     */
    public void acelerar() {
        System.out.println("El " + marca + " " + modelo + " está acelerando...");
    }
    
    // Getter y setter para cantidadPuertas
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}