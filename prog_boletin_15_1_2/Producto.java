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
public class Producto {
    private float precio;
    private String codigo;

    public Producto() {
    }

    public Producto(float precio, String codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", codigo=" + codigo + '}';
    }
    
}
