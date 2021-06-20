/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import CapaLogica.Cargo;
import TListas.TLista;
import TListas.TListaDin;

/**
 *
 * @author Jose Nelson
 */
public class ListaDin_Cargos {

    private static TLista objetos = new TListaDin();

    public static void adicionar(Object C) {
        objetos.Adicionar(C);
    }

    public static Object obtener(int pos) {
        return objetos.Obtener(pos);
    }

    public static void eliminar(int pos) {
        objetos.Eliminar(pos);
    }

    public static TLista consultar() {
        return objetos;
    }

    
}
