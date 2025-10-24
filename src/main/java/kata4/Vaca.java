package kata4;

/**
 * Clase Vaca que extiende de Animal
 * Demuestra sobrescritura de métodos con @Override
 */
public class Vaca extends Animal {
    private double pesoKg;
    private boolean esLechera;
    
    /**
     * Constructor de la clase Vaca
     * @param nombre El nombre de la vaca
     * @param edad La edad de la vaca
     * @param pesoKg El peso de la vaca en kilogramos
     * @param esLechera Si la vaca es lechera o no
     */
    public Vaca(String nombre, int edad, double pesoKg, boolean esLechera) {
        super(nombre, "Bovino", edad);
        this.pesoKg = pesoKg;
        this.esLechera = esLechera;
    }
    
    /**
     * Sobrescritura del método hacerSonido()
     * Las vacas mugen
     * @return El sonido característico de la vaca
     */
    @Override
    public String hacerSonido() {
        return "¡Muuu muuu! 🐄";
    }
    
    /**
     * Sobrescritura del método describirAnimal()
     * Agrega información específica de la vaca
     */
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("Peso: " + pesoKg + " kg");
        System.out.println("Lechera: " + (esLechera ? "Sí" : "No"));
        if (esLechera) {
            System.out.println("¡Produce leche fresca todos los días! 🥛");
        }
    }
    
    /**
     * Sobrescritura del método comer()
     * Las vacas pastan
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está pastando hierba tranquilamente... 🐄🌱");
    }
    
    /**
     * Sobrescritura del método dormir()
     * Las vacas duermen de forma característica
     */
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo en el pasto bajo las estrellas... 🐄⭐");
    }
    
    /**
     * Método específico de la clase Vaca
     */
    public void darLeche() {
        if (esLechera) {
            double litrosLeche = (pesoKg / 50) + (Math.random() * 10); // Fórmula simple
            System.out.println(nombre + " ha producido " + 
                             String.format("%.1f", litrosLeche) + " litros de leche hoy. 🥛");
        } else {
            System.out.println(nombre + " no es una vaca lechera.");
        }
    }
    
    /**
     * Método para pastar
     */
    public void pastar() {
        System.out.println(nombre + " está pastando en el prado verde... 🌿");
        System.out.println("¡Qué rica está la hierba! " + hacerSonido());
    }
    
    /**
     * Método para caminar lentamente
     */
    public void caminarLentamente() {
        System.out.println(nombre + " camina lentamente por el campo... 🐄👣");
    }
    
    /**
     * Método para socializar con otras vacas
     */
    public void socializar() {
        System.out.println(nombre + " está socializando con otras vacas...");
        System.out.println("Conversación bovina: " + hacerSonido() + " " + hacerSonido());
    }
    
    /**
     * Método para calcular la producción estimada de leche por semana
     * @return Los litros estimados por semana
     */
    public double calcularProduccionSemanal() {
        if (esLechera) {
            return ((pesoKg / 50) + 5) * 7; // Estimación simple
        }
        return 0;
    }
    
    // Getters y setters específicos
    public double getPesoKg() {
        return pesoKg;
    }
    
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
    
    public boolean isEsLechera() {
        return esLechera;
    }
    
    public void setEsLechera(boolean esLechera) {
        this.esLechera = esLechera;
    }
}