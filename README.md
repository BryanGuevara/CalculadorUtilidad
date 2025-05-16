# Calculador de Utilidad

## Descripción

**Calculador de Utilidad** es una aplicación de consola en Java que permite calcular la utilidad obtenida de la venta de un producto, tomando en cuenta el precio, el porcentaje de ganancia y un posible diezmo. Además, ofrece la opción de dividir la ganancia entre diferentes categorías, como "Caja", "Ahorro" y "Uso Personal", según los nombres que el usuario ingrese separados por comas.

## Características

- **Cálculo de Precio Real y Ganancia**: Calcula el precio real del producto y la ganancia obtenida a partir del precio final y porcentaje de ganancia.
- **Opcional Diezmo**: Permite descontar el diezmo (10% de la ganancia) si el usuario así lo desea.
- **División Personalizada de Ganancias**: Permite dividir la ganancia neta entre diferentes categorías definidas por el usuario.
- **Interfaz sencilla y clara**: Entrada y salida en consola con mensajes claros.

## Cómo Usar

1. Ejecuta el programa.
2. Ingresa el precio del producto cuando se te solicite.
3. Introduce el porcentaje de ganancia.
4. Indica si deseas incluir el diezmo (S/N).
5. Escribe los nombres de las divisiones para la ganancia, separados por comas (ejemplo: `Caja, Ahorro, Uso Personal`).
6. El programa calculará y mostrará el desglose de ganancias y las divisiones correspondientes.

## Ejemplo de Ejecución

```plaintext
______                          _____                                 
| ___ \                        |  __ \                                
| |_/ /_ __ _   _  __ _ _ __   | |  \/_   _  _____   ____ _ _ __ __ _ 
| ___ \ '__| | | |/ _` | '_ \  | | __| | | |/ _ \ \ / / _` | '__/ _` |
| |_/ / |  | |_| | (_| | | | | | |_\ \ |_| |  __/\ V / (_| | | | (_| |
\____/|_|   \__, |\__,_|_| |_|  \____/\__,_|\___| \_/ \__,_|_|  \__,_|
             __/ |                                                   
            |___/                                                    

=================================================== <[Entrada]> ==================================================
Ingrese el precio del producto: $150.00
Ingrese el porcentaje de Ganancias: %20
¿Incluir diezmo? (S/N): S
En cuales partes lo quiere dividir?
(Ingrese los nombres separados por comas): Caja, Ahorro, Uso Personal
=================================================== <[Datos]> ====================================================
Precio de producto: $125.00
Ganancia del producto: $25.00
Diezmo: $2.50
Caja: $7.50
Ahorro: $7.50
Uso Personal: $7.50
==================================================================================================================
```