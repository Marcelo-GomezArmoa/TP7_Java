package kata4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Main para demostrar la Kata 4: Animales y comportamiento sobrescrito
 * Demuestra polimorfismo, sobrescritura de métodos y uso de @Override
 */
public class MainKata4 {
    public static void main(String[] args) {
        System.out.println("=== KATA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ===\n");
        
        // 1. Creación de diferentes tipos de animales
        System.out.println("1. Creando diversos animales:");
        
        Animal animalGenerico = new Animal("Rex", "Animal genérico", 5);
        Perro perro1 = new Perro("Max", 3, "Golden Retriever", true);
        Perro perro2 = new Perro("Luna", 2, "Pastor Alemán", true);
        Gato gato1 = new Gato("Whiskers", 4, "Gris", true);
        Gato gato2 = new Gato("Mimi", 1, "Naranja", false);
        Vaca vaca1 = new Vaca("Bessie", 6, 450.5, true);
        Vaca vaca2 = new Vaca("Toro", 8, 600.0, false);
        
        System.out.println("✓ Animales creados exitosamente\n");
        
        // 2. Lista polimórfica de animales
        System.out.println("2. Creando lista polimórfica de animales:");
        List<Animal> animales = new ArrayList<>();
        animales.add(animalGenerico);
        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(gato2);
        animales.add(vaca1);
        animales.add(vaca2);
        
        System.out.println("Lista creada con " + animales.size() + " animales\n");
        
        // 3. Demostración de polimorfismo con hacerSonido()
        System.out.println("3. Concierto de sonidos animales (polimorfismo):");
        System.out.println("🎵 ¡Bienvenidos al concierto de la granja! 🎵\n");
        
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            System.out.println((i + 1) + ". " + animal.toString() + ":");
            System.out.println("   " + animal.hacerSonido());  // Llamada polimórfica
        }
        
        System.out.println("\n🎵 ¡Fin del concierto! 🎵\n");
        
        // 4. Comportamientos comunes (dormir y comer) con polimorfismo
        System.out.println("4. Hora de dormir y comer (métodos sobrescritos):");
        
        System.out.println("--- Hora de dormir ---");
        for (Animal animal : animales) {
            animal.dormir();  // Llamada polimórfica
        }
        
        System.out.println("\n--- Hora de comer ---");
        for (Animal animal : animales) {
            animal.comer();  // Llamada polimórfica
        }
        
        System.out.println();
        
        // 5. Información detallada usando instanceof y downcasting
        System.out.println("5. Información detallada de cada animal:");
        
        for (Animal animal : animales) {
            System.out.println("\n" + "=".repeat(50));
            animal.describirAnimal();  // Llamada polimórfica
            
            // Acceso a métodos específicos usando instanceof
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;  // Downcasting
                perro.jugar();
                perro.entrenar();
                perro.proteger();
                
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;  // Downcasting
                gato.ronronear();
                gato.cazar();
                gato.mostrarAfecto();
                
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;  // Downcasting
                vaca.darLeche();
                vaca.pastar();
                vaca.socializar();
                if (vaca.isEsLechera()) {
                    System.out.println("Producción semanal estimada: " + 
                                     String.format("%.1f", vaca.calcularProduccionSemanal()) + " litros");
                }
            }
        }
        
        // 6. Clasificación y estadísticas por tipo
        System.out.println("\n6. Clasificación y estadísticas:");
        
        int contadorPerros = 0, contadorGatos = 0, contadorVacas = 0, contadorGenericos = 0;
        
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                contadorPerros++;
            } else if (animal instanceof Gato) {
                contadorGatos++;
            } else if (animal instanceof Vaca) {
                contadorVacas++;
            } else {
                contadorGenericos++;
            }
        }
        
        System.out.println("📊 Estadísticas de la granja:");
        System.out.println("🐕 Perros: " + contadorPerros);
        System.out.println("🐱 Gatos: " + contadorGatos);
        System.out.println("🐄 Vacas: " + contadorVacas);
        System.out.println("🐾 Animales genéricos: " + contadorGenericos);
        System.out.println("📈 Total: " + animales.size() + " animales");
        
        // 7. Simulación de actividades específicas
        System.out.println("\n7. Simulación de actividades específicas:");
        
        System.out.println("\n--- Entrenamiento de perros ---");
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;
                if (perro.isEsDomestico()) {
                    System.out.println("Entrenando a " + perro.getNombre() + ":");
                    perro.entrenar();
                }
            }
        }
        
        System.out.println("\n--- Producción de leche ---");
        double totalLeche = 0;
        for (Animal animal : animales) {
            if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                if (vaca.isEsLechera()) {
                    System.out.println("Ordeñando a " + vaca.getNombre() + ":");
                    vaca.darLeche();
                    totalLeche += vaca.calcularProduccionSemanal();
                }
            }
        }
        
        if (totalLeche > 0) {
            System.out.println("🥛 Producción total semanal estimada: " + 
                             String.format("%.1f", totalLeche) + " litros");
        }
        
        System.out.println("\n--- Hora de juegos felinos ---");
        for (Animal animal : animales) {
            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                System.out.println(gato.getNombre() + " está jugando:");
                gato.trepar();
                if (gato.isEsIndependiente()) {
                    gato.cazar();
                }
            }
        }
        
        // 8. Demostración final de polimorfismo
        System.out.println("\n8. Gran final: ¡Todos los animales se despiden!");
        System.out.println("🎭 Cada animal se despide a su manera:\n");
        
        for (Animal animal : animales) {
            System.out.print(animal.getNombre() + " dice adiós: ");
            System.out.println(animal.hacerSonido());  // Polimorfismo en acción
        }
        
        System.out.println("\n🌟 ¡Gracias por visitar nuestra granja polimórfica! 🌟");
        System.out.println("\n=== FIN KATA 4 ===");
    }
}