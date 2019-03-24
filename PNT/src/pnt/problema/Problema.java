/*
    Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
    Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
    Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
    Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
    =============================
    Materia más caro: Frutillas
    Materia más barato: Coca-Cola

    La solución debe cumplir con los siguientes requisitos:

    Diseñar una solución orientada a objetos.
    La salida es por consola y exactamente como se requiere.
    Usar solamente las clases provistas por Java 8..
    Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
    El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
    Para mostrar el mayor / menor, utilizar la interfaz Comparable.
    Para imprimir por pantalla, sobrescribir el método toString()
 */

package pnt.problema;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author cs_jo
 */

public class Problema {

    public static void cargarProductos(List listaProductos) {

        listaProductos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        listaProductos.add(new Bebida("Coca-Cola", 1.5, 18));
        //listaProductos.add(new Verdura("Papa", 15, "kilo"));
        listaProductos.add(new Shampoo("Shampoo Sedal", 500, 19));
        listaProductos.add(new Verdura("Frutillas", 64, "kilo"));
        //listaProductos.add(new Bebida("Yogurt", 1, 85));
        //listaProductos.add(new Verdura("Bananas", 50, "kilo"));
    }

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        cargarProductos(listaProductos);

        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto.toString());
        }

        //Ordenada por precios de mayor a menor.
        Collections.sort(listaProductos);

        System.out.println("=============================");

        int tamanioListaProductos = listaProductos.size();
        int indiceUltimoListaProductos = tamanioListaProductos - 1;
        
        Producto productoMayorPrecio = listaProductos.get(0);
        Producto productoMenorPrecio = listaProductos.get(indiceUltimoListaProductos);

        System.out.println("Materia más caro: " + productoMayorPrecio.getMarca());        
        System.out.println("Materia más barato: " + productoMenorPrecio.getMarca());
        
    }
}