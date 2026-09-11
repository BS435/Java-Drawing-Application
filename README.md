# Java Drawing Application

Aplicación de escritorio en Java (Swing) para dibujar en un lienzo, hecha con NetBeans.

## Funcionalidades

- Dibujo a mano alzada (lápiz)
- Figuras: rectángulo y óvalo
- Borrador
- Deshacer / rehacer

## Estructura del proyecto

```
Java Drawing Application/
├── src/
│   ├── Modelo/
│   │   ├── Dibujo.java     # Clase base abstracta de un elemento dibujado
│   │   ├── Figura.java     # Rectángulos y óvalos
│   │   ├── Trazo.java      # Trazos a mano alzada
│   │   └── Lienzo.java     # Lógica del canvas
│   ├── Vista/
│   │   ├── Inicio.java     # Ventana principal (GUI)
│   │   └── Main.java       # Punto de entrada
│   └── Imagenes/           # Iconos de la barra de herramientas
├── build.xml               # Script de build de Ant/NetBeans
└── manifest.mf
```

## Requisitos

- JDK 8 o superior
- NetBeans (recomendado) o Apache Ant

## Cómo ejecutar

### Con NetBeans
1. Abrir el proyecto (`Java Drawing Application/`) desde NetBeans.
2. Ejecutar (`Run Project`).

### Con Ant (línea de comandos)
```bash
cd "Java Drawing Application"
ant run
```

## Autor

BS435
