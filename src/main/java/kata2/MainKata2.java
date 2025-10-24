package kata2;

/**
 * Clase Main para demostrar la Kata 2: Figuras geométricas y métodos abstractos
 * Demuestra clases abstractas, métodos abstractos y polimorfismo
 */
public class MainKata2 {
    public static void main(String[] args) {
        System.out.println("=== KATA 2: FIGURAS GEOMÉTRICAS Y MÉTODOS ABSTRACTOS ===\n");
        
        // 1. Creación de instancias (no se puede instanciar Figura directamente)
        System.out.println("1. Creando figuras geométricas:");
        
        // Figura figura = new Figura("Test"); // ¡ERROR! No se puede instanciar clase abstracta
        
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        Rectangulo cuadrado = new Rectangulo(5.0, 5.0);
        
        System.out.println("- Círculo con radio 5.0");
        System.out.println("- Rectángulo de 4.0 x 6.0");
        System.out.println("- Cuadrado de 5.0 x 5.0\n");
        
        // 2. Demostración de métodos implementados
        System.out.println("2. Información individual de cada figura:");
        System.out.println();
        
        circulo.mostrarInfo();
        System.out.println("Diámetro: " + String.format("%.2f", circulo.calcularDiametro()));
        System.out.println();
        
        rectangulo.mostrarInfo();
        System.out.println("¿Es cuadrado? " + rectangulo.esCuadrado());
        System.out.println("Diagonal: " + String.format("%.2f", rectangulo.calcularDiagonal()));
        System.out.println();
        
        cuadrado.mostrarInfo();
        System.out.println("¿Es cuadrado? " + cuadrado.esCuadrado());
        System.out.println("Diagonal: " + String.format("%.2f", cuadrado.calcularDiagonal()));
        System.out.println();
        
        // 3. Array polimórfico de figuras
        System.out.println("3. Array polimórfico de figuras:");
        Figura[] figuras = {
            new Circulo(3.0),
            new Rectangulo(2.5, 4.0),
            new Circulo(7.5),
            new Rectangulo(3.0, 3.0),  // Cuadrado
            new Rectangulo(6.0, 2.0)
        };
        
        // 4. Cálculo usando polimorfismo
        System.out.println("\n4. Cálculos usando polimorfismo:");
        double areaTotal = 0;
        double perimetroTotal = 0;
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("\nFigura " + (i + 1) + ": " + figuras[i].getNombre());
            
            // Los métodos se ejecutan polimórficamente
            double area = figuras[i].calcularArea();
            double perimetro = figuras[i].calcularPerimetro();
            
            System.out.println("  Área: " + String.format("%.2f", area));
            System.out.println("  Perímetro: " + String.format("%.2f", perimetro));
            
            areaTotal += area;
            perimetroTotal += perimetro;
            
            // Uso de instanceof para acceso a métodos específicos
            if (figuras[i] instanceof Circulo) {
                Circulo c = (Circulo) figuras[i];
                System.out.println("  Radio: " + c.getRadio());
                System.out.println("  Diámetro: " + String.format("%.2f", c.calcularDiametro()));
            } else if (figuras[i] instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) figuras[i];
                System.out.println("  Dimensiones: " + r.getAncho() + " x " + r.getAlto());
                System.out.println("  ¿Es cuadrado? " + r.esCuadrado());
            }
        }
        
        // 5. Resumen de cálculos
        System.out.println("\n5. Resumen de cálculos:");
        System.out.println("Área total de todas las figuras: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro total de todas las figuras: " + String.format("%.2f", perimetroTotal));
        System.out.println("Cantidad total de figuras: " + figuras.length);
        
        // 6. Clasificación de figuras por tipo
        System.out.println("\n6. Clasificación por tipo:");
        int contadorCirculos = 0;
        int contadorRectangulos = 0;
        int contadorCuadrados = 0;
        
        for (Figura figura : figuras) {
            if (figura instanceof Circulo) {
                contadorCirculos++;
            } else if (figura instanceof Rectangulo) {
                Rectangulo rect = (Rectangulo) figura;
                if (rect.esCuadrado()) {
                    contadorCuadrados++;
                } else {
                    contadorRectangulos++;
                }
            }
        }
        
        System.out.println("Círculos: " + contadorCirculos);
        System.out.println("Rectángulos: " + contadorRectangulos);
        System.out.println("Cuadrados: " + contadorCuadrados);
        
        System.out.println("\n=== FIN KATA 2 ===");
    }
}