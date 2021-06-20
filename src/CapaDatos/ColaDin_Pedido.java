/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import TColas.TCola;
import TColas.TColaDin;

/**
 *
 * @author Jose Nelson
 */
public class ColaDin_Pedido {
    private static TCola objetos = new TColaDin();
    
    public static void Adicionar(Object c){
        objetos.Insertar(c);
    }
    public static void Eliminar(){
        objetos.Eliminar();
    }
    public static Object Obtener(int pos){
        return objetos.Obtener(pos);
    }
    
    public static TCola consultar(){
        return objetos;
    }
    
    public static Object Primero(){
        return objetos.Primero();
    }
}
