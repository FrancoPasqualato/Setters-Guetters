/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.guetter.setters;

/**
 *
 * @author Franco
 */
public class TPGuetterSetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //○ Cree una instancia de Producto.
        Producto producto1 = new Producto("Teclados",100,10);
        
        // ○ Muestre los valores iniciales de los atributos utilizando los getters.
        System.out.println("-- Precio y Cantidad inicial --");
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Cantidad: " + producto1.getCantidad() + " unidades");
        
        // ○ Modifique los valores utilizando los setters y muestre los nuevos valores.
        System.out.println("-- Precio y Cantidad nueva --");
        producto1.setPrecio(90);
        producto1.setCantidad(9);
        System.out.println("Nuevo Precio: $" + producto1.getPrecio());
        System.out.println("Nueva Cantidad: " + producto1.getCantidad() + " unidades");
        
        // ○ Intente establecer un precio y una cantidad negativos y observe el resultado.
        System.out.println("-- Precio y Cantidad negativa --");
        producto1.setPrecio(-10);
        producto1.setCantidad(-10);
        System.out.println("Ultimo Precio: $" + producto1.getPrecio());
        System.out.println("Ultima Cantidad: " + producto1.getCantidad() + " unidades");
    }
    
}
