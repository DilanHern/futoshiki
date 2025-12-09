# Futoshiki

Videojuego de escritorio basado en el rompecabezas japonés Futoshiki, desarrollado en Java con interfaz gráfica Swing.

## Descripción

Futoshiki es un juego de lógica de origen japonés similar al Sudoku. El objetivo es llenar una cuadrícula con números sin repetir ningún número en cada fila o columna, respetando las restricciones de desigualdad entre celdas adyacentes.

Este proyecto implementa una versión completa del juego con múltiples funcionalidades, incluyendo diferentes niveles de dificultad, sistema de guardado, temporizador, y un sistema de ranking de los mejores jugadores.

## Características

### Modos de Juego
- **Cuadrículas personalizables**: Tamaños desde 3x3 hasta 10x10
- **Tres niveles de dificultad**: Fácil, Normal y Difícil
- **Modo multinivel**: Juega varios niveles consecutivamente
- **Partidas guardadas**: Guarda y recupera tus partidas en progreso

### Funcionalidades
- **Sistema de tiempo**: 
  - Cronómetro para medir tu rendimiento
  - Temporizador configurable con límite de tiempo
  - Opción de jugar sin reloj
- **Sistema de deshacer/rehacer**: Revierte o recupera jugadas
- **Modo borrador**: Elimina números colocados previamente
- **Top 10**: Tabla de clasificación con los mejores tiempos por nivel y tamaño
- **Configuración personalizable**:
  - Posición del panel de dígitos (izquierda/derecha)
  - Registro de jugadores con PIN de seguridad
  - Persistencia de configuración entre sesiones

### Interfaz
- Diseño intuitivo con Swing
- Botones personalizados redondeados
- Visualización clara de restricciones de desigualdad
- Indicadores visuales para celdas constantes

## Requisitos

- **Java Development Kit (JDK)**: 8 o superior
- **NetBeans IDE**: 8 o superior (recomendado)
- **Sistema Operativo**: Windows, Linux o macOS

## Instalación

### Opción 1: Clonar el repositorio

```bash
git clone https://github.com/DilanHern/futoshiki.git
cd futoshiki/Futoshiki
```

### Opción 2: Compilación manual

```bash
cd Futoshiki
javac -d build/classes -sourcepath src src/futoshiki/Futoshiki.java
```

### Opción 3: Usando NetBeans

1. Abre NetBeans IDE
2. File → Open Project
3. Selecciona la carpeta `Futoshiki`
4. Click derecho en el proyecto → Build
5. Click derecho en el proyecto → Run

## Uso

### Ejecución

```bash
java -cp build/classes futoshiki.Futoshiki
```

O desde NetBeans: F6 (Run Project)

### Cómo jugar

1. **Iniciar partida**: Desde el menú principal, selecciona "Jugar"
2. **Configurar**: Ajusta el tamaño de cuadrícula, dificultad y otras opciones
3. **Colocar números**: 
   - Haz clic en una celda vacía
   - Selecciona un número del panel lateral
   - Respeta las restricciones de desigualdad (<, >)
4. **Validar**: El juego verifica automáticamente si la solución es correcta
5. **Guardar**: Usa el botón "Guardar" para conservar tu progreso

### Controles

- **Deshacer**: Revierte la última jugada
- **Rehacer**: Recupera una jugada deshecha
- **Borrador**: Activa el modo para eliminar números
- **Limpiar**: Borra todos los números ingresados (mantiene constantes)
- **Terminar**: Finaliza la partida actual

## Estructura del Proyecto

```
Futoshiki/
├── src/
│   ├── Componentes/          # Componentes UI personalizados
│   │   └── BotonRedondo.java
│   ├── Controlador/          # Lógica de control (MVC)
│   │   ├── ControladorJugar.java
│   │   ├── ControladorMenu.java
│   │   ├── ControladorConfiguracion.java
│   │   ├── ControladorTop10.java
│   │   └── ControladorAcercaDe.java
│   ├── Modelo/               # Modelos de datos (MVC)
│   │   ├── Juego.java
│   │   ├── Partida.java
│   │   ├── Configuracion.java
│   │   ├── Top10.java
│   │   ├── JugadorTop.java
│   │   └── JuegoGuardado.java
│   ├── Vista/                # Interfaces gráficas (MVC)
│   │   ├── MenuPrincipal.java
│   │   ├── Jugar.java
│   │   ├── MenuConfiguracion.java
│   │   ├── MenuTop10.java
│   │   └── AcercaDe.java
│   └── futoshiki/
│       └── Futoshiki.java    # Clase principal
├── build.xml                 # Script de construcción Ant
├── manifest.mf               # Manifiesto JAR
├── futoshiki2024configuracion.txt  # Archivo de configuración
├── futoshiki2024partidas.xml      # Partidas guardadas
└── futoshiki2024top10.txt         # Ranking de jugadores
```

## Arquitectura

El proyecto sigue el patrón **Modelo-Vista-Controlador (MVC)**:

- **Modelo**: Maneja la lógica del juego, partidas, configuración y persistencia de datos
- **Vista**: Interfaces gráficas creadas con Swing y NetBeans GUI Builder
- **Controlador**: Gestiona la interacción entre las vistas y el modelo

### Persistencia de Datos

- **Configuración**: Serialización binaria (`.txt`)
- **Partidas**: XML (`.xml`)
- **Top 10**: Formato de texto estructurado (`.txt`)

## Compilación y Distribución

### Crear JAR ejecutable

Usando Ant:
```bash
ant jar
```

El archivo JAR se generará en `dist/Futoshiki.jar`

### Ejecutar JAR

```bash
java -jar dist/Futoshiki.jar
```
