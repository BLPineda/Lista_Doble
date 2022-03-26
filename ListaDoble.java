/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Doble;

/**
 *
 * @author lenin
 */
public class ListaDoble {
    private NodoDoble inicio, fin;

    public ListaDoble() {
    this.fin = this.inicio = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void AgregarFinal(char elemento){
        if(!estaVacia()){
            this.fin = new NodoDoble(elemento, null, this.fin);
            this.fin.anterior.siguiente = this.fin;
        } else{
            this.inicio = this.fin=new NodoDoble(elemento);
        }
    }
    
    public void AgregarInicio(char elemento){
        if (!estaVacia()){
            this.inicio = new NodoDoble(elemento, this.inicio, null);
            this.inicio.siguiente.anterior = null;
        } else{
            this.inicio =this.fin = new NodoDoble(elemento);
        }
    }
    
    public void MostrarListaIncioFin(){
        if(!estaVacia()){
            String enlace="<=>";
            String datos = enlace;
            NodoDoble auxiliar = this.inicio;
            while(auxiliar!=null){
                datos = datos + "[" +auxiliar.dato + "]" + enlace;
                auxiliar = auxiliar.siguiente;
            }
            System.out.println("Inicio => fin");
            System.out.println(datos);
        }
    }
    
    public void MostarListaFinInicio(){
        if(!estaVacia()){
            String enlace="<=>";
            String datos = enlace;
              NodoDoble auxiliar = this.fin;
            while(auxiliar!=null){
                datos = datos + "[" +auxiliar.getDato() + "]" + enlace;
                auxiliar = auxiliar.anterior;
            }
            System.out.println("Fin => inicio");
            System.out.println(datos);
        }
    }
    
    public void Buscar(char elemento){
        NodoDoble actual = new NodoDoble(elemento);
        actual = inicio;
        while(actual !=null){
         if (actual.dato == elemento){
             System.out.println("El nodo está ingresado dentro de la lista");
        }
         actual = actual.siguiente;
        }
    }
    
    public char EliminarDelInicio(){
        char elemento=inicio.dato;
        
        if(estaVacia()){
            System.out.println("La lista está vacía");
        }else if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }
    
    public char ElminarDelFinal(){
        char elemento = fin.dato;
        
        if(estaVacia()){
            System.out.println("La lista está vacía");
        }else if(inicio==fin){
            inicio=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return elemento;
    }
}

