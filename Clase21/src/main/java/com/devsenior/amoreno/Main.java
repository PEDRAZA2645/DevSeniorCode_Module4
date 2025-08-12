package com.devsenior.amoreno;

import com.devsenior.amoreno.calculadora.Inventory;
import com.devsenior.amoreno.calculadora.Product;
import com.devsenior.amoreno.collections.Lists;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
       var inventory = new Inventory();
       inventory.addProduct(new Product("Arroz", 1, 5500d));
       inventory.addProduct(new Product("Café", 2, 8500.25d));
       inventory.addProduct(new Product("Frijol", 10, 10000d));
       inventory.addProduct(new Product("Arroz", 3, 5500d));
       var allProducts = inventory.getInventory();
        for (var vale : allProducts){
            System.out.println(vale);
        }

        try{
            var product = inventory.getProduct("Café");
            System.out.printf("%s \t%d \t$ %,.2f%n", product.getName(), product.getQuantity(), product.getPrice());
            product = inventory.getProduct("pasta");
            System.out.printf("%s \t%d \t$ %,.2f%n", product.getName(), product.getQuantity(), product.getPrice());
        } catch (NullPointerException e) {
            System.err.println("Error al consultar el producto: ");
        }

        var total = inventory.getTotalInventory();
        System.out.printf("El total del inventario es $ %,.2f %n", total);
    }
}
