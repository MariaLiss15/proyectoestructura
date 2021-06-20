/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author Jose Nelson
 */
public class Producto {

    private int id;
    private String nombre;
    private float precio;
    private int id_categoria_producto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getId_categoria_producto() {
        return id_categoria_producto;
    }

    public void setId_categoria_producto(int id_categoria_producto) {
        this.id_categoria_producto = id_categoria_producto;
    }
}
