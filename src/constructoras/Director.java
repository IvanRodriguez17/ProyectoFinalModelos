/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoras;

/**
 *
 * @author ivanr
 */
public class Director {
    private Director(){
        
    }
    
    private static ConstructoraAbstracta constructora;
    
    public static ConstructoraAbstracta getSingletonInstance(String tipo) {
        if(constructora == null){
            constructora = new ConstructoraConcreta(tipo);
        }
        return constructora;
    }
}
