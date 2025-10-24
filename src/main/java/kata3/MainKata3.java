package kata3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Main para demostrar la Kata 3: Empleados y polimorfismo
 * Demuestra polimorfismo, instanceof y cálculos dinámicos
 */
public class MainKata3 {
    public static void main(String[] args) {
        System.out.println("=== KATA 3: EMPLEADOS Y POLIMORFISMO ===\n");
        
        // 1. Creación de empleados de diferentes tipos
        System.out.println("1. Creando empleados de diferentes tipos:");
        
        EmpleadoPlanta empleado1 = new EmpleadoPlanta("Juan", "Pérez", 1001, 50000, 5000, 3);
        EmpleadoPlanta empleado2 = new EmpleadoPlanta("María", "González", 1002, 60000, 8000, 7);
        EmpleadoTemporal empleado3 = new EmpleadoTemporal("Carlos", "López", 2001, 200, 160, 4);
        EmpleadoTemporal empleado4 = new EmpleadoTemporal("Ana", "Martínez", 2002, 250, 320, 8);
        EmpleadoTemporal empleado5 = new EmpleadoTemporal("Luis", "Rodríguez", 2003, 180, 80, 2);
        
        System.out.println("✓ Empleados creados exitosamente\n");
        
        // 2. Lista polimórfica de empleados
        System.out.println("2. Creando lista polimórfica de empleados:");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        
        System.out.println("Lista creada con " + empleados.size() + " empleados\n");
        
        // 3. Invocación polimórfica de calcularSueldo()
        System.out.println("3. Cálculo de sueldos usando polimorfismo:");
        double sueldoTotal = 0;
        
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            double sueldo = emp.calcularSueldo();  // Llamada polimórfica
            sueldoTotal += sueldo;
            
            System.out.println((i + 1) + ". " + emp.getNombreCompleto() + 
                             " (" + emp.getTipoEmpleado() + "): $" + 
                             String.format("%.2f", sueldo));
        }
        
        System.out.println("\nSueldo total de todos los empleados: $" + 
                          String.format("%.2f", sueldoTotal) + "\n");
        
        // 4. Uso de instanceof para clasificación
        System.out.println("4. Clasificación de empleados usando instanceof:");
        
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        double sueldoPlanta = 0;
        double sueldoTemporal = 0;
        
        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoPlanta) {
                contadorPlanta++;
                sueldoPlanta += emp.calcularSueldo();
                System.out.println("- " + emp.getNombreCompleto() + " es Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                contadorTemporal++;
                sueldoTemporal += emp.calcularSueldo();
                System.out.println("- " + emp.getNombreCompleto() + " es Empleado Temporal");
            }
        }
        
        System.out.println("\nResumen por tipo:");
        System.out.println("Empleados de Planta: " + contadorPlanta + 
                          " (Total sueldos: $" + String.format("%.2f", sueldoPlanta) + ")");
        System.out.println("Empleados Temporales: " + contadorTemporal + 
                          " (Total sueldos: $" + String.format("%.2f", sueldoTemporal) + ")\n");
        
        // 5. Acceso a métodos específicos usando downcasting
        System.out.println("5. Acceso a métodos específicos usando downcasting:");
        
        for (Empleado emp : empleados) {
            System.out.println("\n--- " + emp.getNombreCompleto() + " ---");
            
            if (emp instanceof EmpleadoPlanta) {
                EmpleadoPlanta empPlanta = (EmpleadoPlanta) emp;  // Downcasting
                System.out.println("Aguinaldo: $" + String.format("%.2f", empPlanta.calcularAguinaldo()));
                System.out.println("Vacaciones extendidas: " + 
                                 (empPlanta.tieneVacacionesExtendidas() ? "Sí" : "No"));
                System.out.println("Antigüedad: " + empPlanta.getAntiguedad() + " años");
                
            } else if (emp instanceof EmpleadoTemporal) {
                EmpleadoTemporal empTemporal = (EmpleadoTemporal) emp;  // Downcasting
                System.out.println("Promedio horas/mes: " + 
                                 String.format("%.1f", empTemporal.promedioHorasPorMes()));
                System.out.println("Tiempo completo: " + 
                                 (empTemporal.esTiempoCompleto() ? "Sí" : "No"));
                System.out.println("Derecho a renovación: " + 
                                 (empTemporal.tieneDerechoRenovacion() ? "Sí" : "No"));
            }
        }
        
        // 6. Información detallada de cada empleado
        System.out.println("\n6. Información detallada usando mostrarInformacion():");
        
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("\n=== EMPLEADO " + (i + 1) + " ===");
            empleados.get(i).mostrarInformacion();  // Llamada polimórfica
        }
        
        // 7. Estadísticas generales
        System.out.println("\n7. Estadísticas generales:");
        double promedioSueldo = sueldoTotal / empleados.size();
        
        System.out.println("Total empleados: " + empleados.size());
        System.out.println("Sueldo promedio: $" + String.format("%.2f", promedioSueldo));
        System.out.println("Sueldo más alto: $" + String.format("%.2f", encontrarSueldoMaximo(empleados)));
        System.out.println("Sueldo más bajo: $" + String.format("%.2f", encontrarSueldoMinimo(empleados)));
        
        // 8. Empleados con sueldo superior al promedio
        System.out.println("\n8. Empleados con sueldo superior al promedio:");
        for (Empleado emp : empleados) {
            if (emp.calcularSueldo() > promedioSueldo) {
                System.out.println("- " + emp.getNombreCompleto() + ": $" + 
                                 String.format("%.2f", emp.calcularSueldo()));
            }
        }
        
        System.out.println("\n=== FIN KATA 3 ===");
    }
    
    /**
     * Método auxiliar para encontrar el sueldo máximo
     * @param empleados Lista de empleados
     * @return El sueldo máximo
     */
    private static double encontrarSueldoMaximo(List<Empleado> empleados) {
        double max = 0;
        for (Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo();
            if (sueldo > max) {
                max = sueldo;
            }
        }
        return max;
    }
    
    /**
     * Método auxiliar para encontrar el sueldo mínimo
     * @param empleados Lista de empleados
     * @return El sueldo mínimo
     */
    private static double encontrarSueldoMinimo(List<Empleado> empleados) {
        double min = Double.MAX_VALUE;
        for (Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo();
            if (sueldo < min) {
                min = sueldo;
            }
        }
        return min;
    }
}