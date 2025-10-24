# Trabajo Práctico 7: Herencia y Polimorfismo en Java

## 📋 Descripción
Este proyecto implementa 4 katas educativas para demostrar los conceptos fundamentales de **Herencia** y **Polimorfismo** en Java, aplicados a la Programación Orientada a Objetos.

## 🎯 Objetivo General
Comprender y aplicar los conceptos de herencia y polimorfismo en la POO, reconociendo su importancia para la reutilización de código, la creación de jerarquías de clases y el diseño flexible de soluciones en Java.

## 📚 Conceptos Implementados

| Concepto | Descripción | Aplicación |
|----------|-------------|------------|
| **Herencia** | Uso de `extends` para crear jerarquías | Relación is-a entre clases |
| **Modificadores de acceso** | `private`, `protected`, `public` | Control de visibilidad |
| **Constructores y super** | `super(...)` para inicialización | Llamada al constructor padre |
| **Upcasting** | Generalización al tipo padre | Tratamiento polimórfico |
| **Downcasting** | Especialización segura | Acceso a métodos específicos |
| **Instanceof** | Verificación de tipos | Casting seguro |
| **Clases abstractas** | `abstract` para estructura base | Plantillas para subclases |
| **Métodos abstractos** | Comportamientos obligatorios | Implementación forzada |
| **Polimorfismo** | `@Override` y llamada dinámica | Flexibilidad en diseño |

## 🏗️ Estructura del Proyecto

```
TP7_Java/
├── src/main/java/
│   ├── Main.java                    # Menú principal interactivo
│   ├── kata1/                       # Vehículos y herencia básica
│   │   ├── Vehiculo.java           # Clase base
│   │   ├── Auto.java               # Herencia y sobrescritura
│   │   └── MainKata1.java          # Demostración
│   ├── kata2/                       # Figuras geométricas
│   │   ├── Figura.java             # Clase abstracta
│   │   ├── Circulo.java            # Implementación concreta
│   │   ├── Rectangulo.java         # Implementación concreta
│   │   └── MainKata2.java          # Demostración
│   ├── kata3/                       # Empleados y polimorfismo
│   │   ├── Empleado.java           # Clase abstracta
│   │   ├── EmpleadoPlanta.java     # Implementación específica
│   │   ├── EmpleadoTemporal.java   # Implementación específica
│   │   └── MainKata3.java          # Demostración
│   └── kata4/                       # Animales y comportamiento
│       ├── Animal.java             # Clase base
│       ├── Perro.java              # Sobrescritura de métodos
│       ├── Gato.java               # Sobrescritura de métodos
│       ├── Vaca.java               # Sobrescritura de métodos
│       └── MainKata4.java          # Demostración
├── src/test/java/                   # Pruebas unitarias (opcional)
├── pom.xml                          # Configuración Maven
└── README.md                        # Este archivo
```

## 🚀 Ejecución

### Requisitos
- **Java 17** o superior
- **Maven 3.6** o superior

### Compilar el proyecto
```bash
mvn clean compile
```

### Ejecutar el menú principal
```bash
mvn exec:java -Dexec.mainClass="Main"
```

### Ejecutar katas individuales
```bash
# Kata 1: Vehículos
mvn exec:java -Dexec.mainClass="kata1.MainKata1"

# Kata 2: Figuras geométricas
mvn exec:java -Dexec.mainClass="kata2.MainKata2"

# Kata 3: Empleados
mvn exec:java -Dexec.mainClass="kata3.MainKata3"

# Kata 4: Animales
mvn exec:java -Dexec.mainClass="kata4.MainKata4"
```

### Ejecutar pruebas
```bash
mvn test
```

## 📖 Descripción de las Katas

### 🚗 Kata 1: Vehículos y herencia básica
**Conceptos:** Herencia básica, constructores, polimorfismo, upcasting/downcasting

- **Vehiculo**: Clase base con atributos `marca` y `modelo`
- **Auto**: Subclase con `cantidadPuertas` adicional
- **Demostración**: Instanciación, polimorfismo, `instanceof`, arrays polimórficos

### 📐 Kata 2: Figuras geométricas y métodos abstractos
**Conceptos:** Clases abstractas, métodos abstractos, polimorfismo en arrays

- **Figura**: Clase abstracta con `calcularArea()` y `calcularPerimetro()`
- **Circulo**: Implementa cálculos para círculos (π × r²)
- **Rectangulo**: Implementa cálculos para rectángulos (base × altura)
- **Demostración**: Array polimórfico, cálculos automáticos, clasificación

### 👷 Kata 3: Empleados y polimorfismo
**Conceptos:** Polimorfismo en cálculos, `instanceof`, downcasting seguro

- **Empleado**: Clase abstracta con `calcularSueldo()`
- **EmpleadoPlanta**: Sueldo fijo + bonificación + antigüedad
- **EmpleadoTemporal**: Pago por horas + bonus por contrato largo
- **Demostración**: Lista polimórfica, clasificación, estadísticas

### 🐾 Kata 4: Animales y comportamiento sobrescrito
**Conceptos:** Sobrescritura con `@Override`, polimorfismo en métodos

- **Animal**: Clase base con `hacerSonido()` y `describirAnimal()`
- **Perro**: Ladra ("¡Guau guau!"), comportamientos caninos
- **Gato**: Maúlla ("¡Miau miau!"), comportamientos felinos  
- **Vaca**: Muge ("¡Muuu muuu!"), comportamientos bovinos
- **Demostración**: Concierto de sonidos, comportamientos específicos

## 🎮 Características del Menú Interactivo

El archivo `Main.java` proporciona:
- **Menú navegable** con opciones numeradas
- **Ejecución individual** de cada kata
- **Manejo de errores** robusto
- **Interfaz amigable** con emojis y formato claro
- **Salida controlada** del programa

## 🧪 Ejemplos de Salida

### Kata 1: Demostración de herencia
```
=== KATA 1: VEHÍCULOS Y HERENCIA BÁSICA ===

1. Creando instancias:
- Vehículo creado: Toyota Generico
- Auto creado: Honda Civic con 4 puertas

2. Polimorfismo - método mostrarInfo():
Información del vehículo base:
Vehículo: Toyota Generico

Información del auto (método sobrescrito):
Vehículo: Honda Civic
Cantidad de puertas: 4
Tipo: Automóvil
```

### Kata 4: Concierto polimórfico
```
🎵 ¡Bienvenidos al concierto de la granja! 🎵

1. Max (Canino, 3 años):
   ¡Guau guau! 🐕
2. Whiskers (Felino, 4 años):
   ¡Miau miau! 🐱
3. Bessie (Bovino, 6 años):
   ¡Muuu muuu! 🐄
```

## 🛠️ Desarrollo y Contribución

### Clonar el repositorio
```bash
git clone <url-del-repositorio>
cd TP7_Java
```

### Estructura de commits sugerida
```bash
git add .
git commit -m "feat: implementar Kata X - <descripción>"
git push origin main
```
