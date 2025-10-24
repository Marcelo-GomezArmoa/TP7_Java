package kata1;

/**
 * Clase Main para demostrar la Kata 1: Vehículos y herencia básica
 * Demuestra herencia, polimorfismo, upcasting y downcasting
 */
public class MainKata1 {
    public static void main(String[] args) {
        System.out.println("=== KATA 1: VEHÍCULOS Y HERENCIA BÁSICA ===\n");
        
        // 1. Creación de instancias
        System.out.println("1. Creando instancias:");
        Vehiculo vehiculo = new Vehiculo("Toyota", "Generico");
        Auto auto = new Auto("Honda", "Civic", 4);
        
        System.out.println("- Vehículo creado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("- Auto creado: " + auto.getMarca() + " " + auto.getModelo() + 
                          " con " + auto.getCantidadPuertas() + " puertas\n");
        
        // 2. Demostración de polimorfismo y sobrescritura
        System.out.println("2. Polimorfismo - método mostrarInfo():");
        System.out.println("Información del vehículo base:");
        vehiculo.mostrarInfo();
        
        System.out.println("\nInformación del auto (método sobrescrito):");
        auto.mostrarInfo();
        
        // 3. Upcasting - Auto tratado como Vehiculo
        System.out.println("\n3. Upcasting - Auto tratado como Vehículo:");
        Vehiculo vehiculoUpcasted = auto;  // Upcasting implícito
        vehiculoUpcasted.mostrarInfo();  // Llama al método sobrescrito de Auto
        
        // 4. Instanceof para verificar tipos
        System.out.println("\n4. Verificación de tipos con instanceof:");
        System.out.println("¿vehiculo es instancia de Vehiculo? " + (vehiculo instanceof Vehiculo));
        System.out.println("¿vehiculo es instancia de Auto? " + (vehiculo instanceof Auto));
        System.out.println("¿auto es instancia de Vehiculo? " + (auto instanceof Vehiculo));
        System.out.println("¿auto es instancia de Auto? " + (auto instanceof Auto));
        System.out.println("¿vehiculoUpcasted es instancia de Auto? " + (vehiculoUpcasted instanceof Auto));
        
        // 5. Downcasting seguro
        System.out.println("\n5. Downcasting seguro:");
        if (vehiculoUpcasted instanceof Auto) {
            Auto autoDowncasted = (Auto) vehiculoUpcasted;  // Downcasting explícito
            autoDowncasted.acelerar();  // Método específico de Auto
            System.out.println("Downcasting exitoso - acceso a método específico de Auto");
        }
        
        // 6. Ejemplo de array polimórfico
        System.out.println("\n6. Array polimórfico:");
        Vehiculo[] vehiculos = {
            new Vehiculo("Ford", "Generico"),
            new Auto("Chevrolet", "Cruze", 4),
            new Auto("Nissan", "Sentra", 4)
        };
        
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\nVehículo " + (i + 1) + ":");
            vehiculos[i].mostrarInfo();  // Polimorfismo en acción
            
            // Acceso a métodos específicos usando instanceof
            if (vehiculos[i] instanceof Auto) {
                Auto autoEnArray = (Auto) vehiculos[i];
                autoEnArray.acelerar();
            }
        }
        
        System.out.println("\n=== FIN KATA 1 ===");
    }
}