/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allan Avendaño
 */
public interface Lista<T> {
    
    //Sólo Métodos que describen comportamientos
    //Mostrar lista
    void imprimirLista();
    
    //Lista vacia
    boolean listaVacia();
    
    //Insertar
    boolean insertarInicio(T dato);
    boolean insertarFin(T dato);
    boolean insertarPosicion(int posicion, T dato);
    
    //Eliminar
    Nodo<T> removerInicio();
    Nodo<T> removerFin();
    Nodo<T> removerNodo(T dato);
    
    //Obtener el anterior a un nodo
    Nodo<T> obtenerAnterior(T dato);
    
    //Buscar
    Nodo<T> buscar(T dato);
}
