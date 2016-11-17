/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allan Avendaño
 */
public class Nodo<T> {
    
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo() {
        this.setDato(null);
        this.setSiguiente(null);
    }
    
    public Nodo(T dato) {
        this.setDato(dato);
        this.setSiguiente(null);
    }
    
    public Nodo(T dato, Nodo<T> siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public void imprimir() {
        System.out.println(this.getDato());
    }
}
