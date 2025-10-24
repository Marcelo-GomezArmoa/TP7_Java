import kata1.MainKata1;
import kata2.MainKata2;
import kata3.MainKata3;
import kata4.MainKata4;

import java.util.Scanner;

/**
 * Clase Main principal para ejecutar todas las katas del TP7
 * Trabajo Práctico 7: Herencia y Polimorfismo en Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🎓 TRABAJO PRÁCTICO 7: HERENCIA Y POLIMORFISMO EN JAVA 🎓");
        System.out.println("=".repeat(65));
        System.out.println();
        
        mostrarMenu();
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("\n📝 Seleccione una opción (1-5): ");
            
            try {
                int opcion = scanner.nextInt();
                System.out.println();
                
                switch (opcion) {
                    case 1:
                        ejecutarKata1();
                        break;
                    case 2:
                        ejecutarKata2();
                        break;
                    case 3:
                        ejecutarKata3();
                        break;
                    case 4:
                        ejecutarKata4();
                        break;
                    case 5:
                        System.out.println("¡Gracias por usar el TP7! 👋");
                        continuar = false;
                        break;
                    default:
                        System.out.println("❌ Opción inválida. Por favor seleccione 1-5.");
                }
                
                if (continuar && opcion >= 1 && opcion <= 4) {
                    System.out.println("\n" + "=".repeat(65));
                    System.out.print("¿Desea ejecutar otra kata? (s/n): ");
                    scanner.nextLine(); // Consumir el salto de línea
                    String respuesta = scanner.nextLine().toLowerCase();
                    
                    if (!respuesta.equals("s") && !respuesta.equals("si") && !respuesta.equals("sí")) {
                        System.out.println("¡Gracias por usar el TP7! 👋");
                        continuar = false;
                    } else {
                        mostrarMenu();
                    }
                }
                
            } catch (Exception e) {
                System.out.println("❌ Error: Por favor ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        
        scanner.close();
    }
    
    /**
     * Muestra el menú principal de opciones
     */
    private static void mostrarMenu() {
        System.out.println("📚 MENÚ DE KATAS DISPONIBLES:");
        System.out.println();
        System.out.println("1️⃣  Kata 1: Vehículos y herencia básica");
        System.out.println("    - Herencia con extends");
        System.out.println("    - Constructores y super()");
        System.out.println("    - Upcasting y Downcasting");
        System.out.println("    - Instanceof");
        System.out.println();
        
        System.out.println("2️⃣  Kata 2: Figuras geométricas y métodos abstractos");
        System.out.println("    - Clases abstractas");
        System.out.println("    - Métodos abstractos");
        System.out.println("    - Polimorfismo en arrays");
        System.out.println();
        
        System.out.println("3️⃣  Kata 3: Empleados y polimorfismo");
        System.out.println("    - Polimorfismo en cálculos");
        System.out.println("    - Instanceof para clasificación");
        System.out.println("    - Downcasting seguro");
        System.out.println();
        
        System.out.println("4️⃣  Kata 4: Animales y comportamiento sobrescrito");
        System.out.println("    - Sobrescritura con @Override");
        System.out.println("    - Polimorfismo en métodos");
        System.out.println("    - Comportamientos específicos");
        System.out.println();
        
        System.out.println("5️⃣  Salir");
        System.out.println();
        System.out.println("=".repeat(65));
    }
    
    /**
     * Ejecuta la Kata 1 con manejo de errores
     */
    private static void ejecutarKata1() {
        try {
            System.out.println("🚀 Ejecutando Kata 1...\n");
            MainKata1.main(new String[0]);
        } catch (Exception e) {
            System.out.println("❌ Error ejecutando Kata 1: " + e.getMessage());
        }
    }
    
    /**
     * Ejecuta la Kata 2 con manejo de errores
     */
    private static void ejecutarKata2() {
        try {
            System.out.println("🚀 Ejecutando Kata 2...\n");
            MainKata2.main(new String[0]);
        } catch (Exception e) {
            System.out.println("❌ Error ejecutando Kata 2: " + e.getMessage());
        }
    }
    
    /**
     * Ejecuta la Kata 3 con manejo de errores
     */
    private static void ejecutarKata3() {
        try {
            System.out.println("🚀 Ejecutando Kata 3...\n");
            MainKata3.main(new String[0]);
        } catch (Exception e) {
            System.out.println("❌ Error ejecutando Kata 3: " + e.getMessage());
        }
    }
    
    /**
     * Ejecuta la Kata 4 con manejo de errores
     */
    private static void ejecutarKata4() {
        try {
            System.out.println("🚀 Ejecutando Kata 4...\n");
            MainKata4.main(new String[0]);
        } catch (Exception e) {
            System.out.println("❌ Error ejecutando Kata 4: " + e.getMessage());
        }
    }
}