# Game Movement Simulator

Este es un pequeño proyecto en Java que simula el movimiento de un objeto o personaje dentro de un entorno 2D mediante las teclas `W`, `A`, `S`, `D`. Cada tecla representa una dirección cardinal, y el programa imprime las coordenadas actualizadas conforme el objeto se mueve.

## 📦 Estructura del Proyecto

game/
├── src/
│ ├── App.java
│ └── movement/
│ └── Movements.java

## ▶️ Cómo Ejecutar

1. Asegúrate de tener instalado Java (JDK 8 o superior).
2. Compila el proyecto desde la raíz:

```bash
javac -d bin src/movement/Movements.java src/App.java

## 🎮 Controles

    W → Mover al norte

    S → Mover al sur

    A → Mover al oeste

    D → Mover al este

    Q → Salir del programa
