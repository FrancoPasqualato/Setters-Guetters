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
public class Producto {
    
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio,int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
 
    //setters
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        } else {
            System.out.println("¡Error!\n El Precio no puede ser negativo");
        }
    }

    public void setCantidad(int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            System.out.println("¡Error! \n La cantidad no puede ser negativa.");
        } else {
            this.cantidad = nuevaCantidad;
        }
}
    /*
    public void setCantidad(int NuevaCantidad) {
        if (cantidad > 0){
            this.cantidad = NuevaCantidad;
        } else {
            System.out.println("¡Error!\n La Cantidad no puede ser negativa");
        }
    }*/

    //guetter
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }   
}