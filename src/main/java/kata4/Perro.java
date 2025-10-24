package kata4;

/**
 * Clase Perro que extiende de Animal
 * Demuestra sobrescritura de métodos con @Override
 */
public class Perro extends Animal {
    private String raza;
    private boolean esDomestico;
    
    /**
     * Constructor de la clase Perro
     * @param nombre El nombre del perro
     * @param edad La edad del perro
     * @param raza La raza del perro
     * @param esDomestico Si el perro es doméstico o no
     */
    public Perro(String nombre, int edad, String raza, boolean esDomestico) {
        super(nombre, "Canino", edad);  // Llama al constructor de la clase padre
        this.raza = raza;
        this.esDomestico = esDomestico;
    }
    
    /**
     * Sobrescritura del método hacerSonido()
     * Los perros ladran
     * @return El sonido característico del perro
     */
    @Override
    public String hacerSonido() {
        return "¡Guau guau! 🐕";
    }
    
    /**
     * Sobrescritura del método describirAnimal()
     * Agrega información específica del perro
     */
    @Override
    public void describirAnimal() {
        super.describirAnimal();  // Llama al método de la clase padre
        System.out.println("Raza: " + raza);
        System.out.println("Doméstico: " + (esDomestico ? "Sí" : "No"));
        if (esDomestico) {
            System.out.println("¡Es un buen amigo del hombre! 🦴");
        }
    }
    
    /**
     * Sobrescritura del método comer()
     * Los perros tienen una forma específica de comer
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo croquetas y moviendo la cola... 🐕🍖");
    }
    
    /**
     * Método específico de la clase Perro
     */
    public void jugar() {
        System.out.println(nombre + " está jugando a buscar la pelota... 🎾");
    }
    
    /**
     * Método específico para entrenar al perro
     */
    public void entrenar() {
        if (esDomestico) {
            System.out.println(nombre + " está aprendiendo comandos: ¡Siéntate! ¡Quieto!");
        } else {
            System.out.println(nombre + " es salvaje y no puede ser entrenado fácilmente.");
        }
    }
    
    /**
     * Método para simular que el perro protege
     */
    public void proteger() {
        System.out.println(nombre + " está protegiendo su territorio... 🛡️");
        System.out.println(hacerSonido()); // Ladra para alertar
    }
    
    // Getters y setters específicos
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public boolean isEsDomestico() {
        return esDomestico;
    }
    
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
}