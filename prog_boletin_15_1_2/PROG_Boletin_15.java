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
public class PROG_Boletin_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto(2.5f, "P1");
        Producto[] ps ={p1,p1};
        Factura factura = new Factura(ps);
        factura.imprimirFactura();
        
        
    }
    
}
