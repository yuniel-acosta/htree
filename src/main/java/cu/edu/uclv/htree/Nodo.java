/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.uclv.htree;

/**
 *
 * @author anakarla
 */
public abstract class Nodo<E,V> {
    protected Nodo<E,V> padre;

    public Nodo(Nodo<E, V> padre) {
        this.padre = padre;
    }
    
    public Nodo<E,V> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<E,V> padre) {
        this.padre = padre;
    }
    
    
}