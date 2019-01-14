/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_15_1_2;


/**
 *
 * @author fsancheztemprano
 */
public class Factura {
    private Producto[] productos;

    public Factura() {
    }

    public Factura(Producto[] productos) {
        this.productos = productos;
    }

   
    public void imprimirFactura(){
        for (int i = 0;i<productos.length;i++){
            System.out.println(productos[i].toString());            
        }
    }
    
    
}
