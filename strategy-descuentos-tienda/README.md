# Strategy · Descuentos de una tienda en línea

Programación I · Patrones de comportamiento · Universidad Libre

## Código

El código del proyecto está en la carpeta `src`.

## Compilar y ejecutar

```
cd src
javac *.java
java Main
```

## Síntoma

- Cada promoción nueva obliga a modificar `Carrito`.
- `calcularTotal("BLACKFRIDAY")` (mal escrito) devuelve el precio completo sin ningún error.

## Reto

Agregue la promoción **Cumpleaños**: 15 % de descuento con un tope de $30.000.

1. No modifique `Carrito` ni las estrategias existentes.
2. Con el carrito de ejemplo ($249.000), el total debe ser **$219.000** (el 15 % serían $37.350, pero el tope es $30.000).
3. Pregunta: ¿cuántos archivos creó y cuántos modificó?
