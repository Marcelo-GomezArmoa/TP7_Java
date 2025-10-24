package kata4;

/**
 * Clase Animal para demostrar polimorfismo y sobrescritura de métodos
 * Clase base que define comportamientos comunes de los animales
 */
public class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;
    
    /**
     * Constructor de la clase Animal
     * @param nombre El nombre del animal
     * @param especie La especie del animal
     * @param edad La edad del animal en años
     */
    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    /**
     * Método que será sobrescrito por las subclases
     * Cada animal tiene su propio sonido característico
     * @return El sonido que hace el animal
     */
    public String hacerSonido() {
        return "El animal hace un sonido genérico";
    }
    
    /**
     * Método que describe al animal
     * Puede ser sobrescrito para agregar información específica
     */
    public void describirAnimal() {
        System.out.println("=== Descripción del Animal ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sonido: " + hacerSonido());  // Llamada polimórfica
    }
    
    /**
     * Método para simular que el animal duerme
     */
    public void dormir() {
        System.out.println(nombre + " está durmiendo... 😴");
    }
    
    /**
     * Método para simular que el animal come
     */
    public void comer() {
        System.out.println(nombre + " está comiendo... 🍽️");
    }
    
    /**
     * Método para mostrar la información básica en una línea
     * @return Una representación en cadena del animal
     */
    @Override
    public String toString() {
        return nombre + " (" + especie + ", " + edad + " años)";
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}