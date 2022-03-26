/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Doble;

/**
 *
 * @author lenin
 */
public class NodoDoble {
    public char dato;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(char elemento) {
        this.dato = elemento;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoDoble(char elemento, NodoDoble sig, NodoDoble ant) {
        this.dato = elemento;
        this.siguiente = sig;
        this.anterior = ant;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
    
}
