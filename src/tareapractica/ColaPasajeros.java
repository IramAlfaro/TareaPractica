/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica;

import java.util.Random;

/**
 *
 * @author irams
 */
public class ColaPasajeros {
    NodoPasajeros primero;
    NodoPasajeros ultimo;

    public ColaPasajeros() {
        primero = ultimo = null;
    }
    
    public void InsertarFinal(int maletas, int documentos, int numPasajero){
        NodoPasajeros nuevo = new NodoPasajeros(maletas, documentos,numPasajero);
        if(primero ==null){
            primero = nuevo;
            primero.siguiente= null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo=nuevo;
        }
    }
    public void Eliminar(){
        if(primero == ultimo){
            primero = ultimo = null;
        }else{
            primero = primero.siguiente;
        }
    }
    public void Recorer(){
        NodoPasajeros actual;
        for(actual = primero;actual != null; actual = actual.siguiente){
            
        }
    }
    public void IngresarPasajeros(int canPasajeros,int numPasajero){
        for(int i = 0; i < canPasajeros;i++){
            Random r= new Random();
            int maletas = r.nextInt(4)+1;
            int documentos = r.nextInt(10)+1;
            InsertarFinal(maletas, documentos,numPasajero);
        }
    }
    
    
}
