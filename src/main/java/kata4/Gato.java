package kata4;

/**
 * Clase Gato que extiende de Animal
 * Demuestra sobrescritura de métodos con @Override
 */
public class Gato extends Animal {
    private String colorPelaje;
    private boolean esIndependiente;
    
    /**
     * Constructor de la clase Gato
     * @param nombre El nombre del gato
     * @param edad La edad del gato
     * @param colorPelaje El color del pelaje del gato
     * @param esIndependiente Si el gato es independiente o no
     */
    public Gato(String nombre, int edad, String colorPelaje, boolean esIndependiente) {
        super(nombre, "Felino", edad);
        this.colorPelaje = colorPelaje;
        this.esIndependiente = esIndependiente;
    }
    
    /**
     * Sobrescritura del método hacerSonido()
     * Los gatos maúllan
     * @return El sonido característico del gato
     */
    @Override
    public String hacerSonido() {
        return "¡Miau miau! 🐱";
    }
    
    /**
     * Sobrescritura del método describirAnimal()
     * Agrega información específica del gato
     */
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Color de pelaje: " + colorPelaje);
        System.out.println("Independiente: " + (esIndependiente ? "Sí" : "No"));
        if (esIndependiente) {
            System.out.println("¡Le gusta hacer las cosas a su manera! 😸");
        }
    }
    
    /**
     * Sobrescritura del método comer()
     * Los gatos tienen una forma específica de comer
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo pescado delicadamente... 🐱🐟");
    }
    
    /**
     * Sobrescritura del método dormir()
     * Los gatos duermen mucho y de forma característica
     */
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo acurrucado por " + 
                          (12 + (int)(Math.random() * 8)) + " horas... 😴🐱");
    }
    
    /**
     * Método específico de la clase Gato
     */
    public void ronronear() {
        System.out.println(nombre + " está ronroneando contento... purr purr 😻");
    }
    
    /**
     * Método específico para cazar
     */
    public void cazar() {
        if (esIndependiente) {
            System.out.println(nombre + " está cazando ratones sigilosamente... 🐭");
        } else {
            System.out.println(nombre + " prefiere que le den la comida servida.");
        }
    }
    
    /**
     * Método para trepar
     */
    public void trepar() {
        System.out.println(nombre + " está trepando con agilidad felina... 🌳");
    }
    
    /**
     * Método para demostrar afecto de forma felina
     */
    public void mostrarAfecto() {
        System.out.println(nombre + " se está frotando contra las piernas... 🐱💕");
        ronronear(); // Los gatos ronronean cuando muestran afecto
    }
    
    // Getters y setters específicos
    public String getColorPelaje() {
        return colorPelaje;
    }
    
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    public boolean isEsIndependiente() {
        return esIndependiente;
    }
    
    public void setEsIndependiente(boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }
}