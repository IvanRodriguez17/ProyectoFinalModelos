/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

/**
 *
 * @author ivanr
 */
public class ControladorFabrica {
    
    private ControladorFabrica(){
        
    }
    
    private static FabricaAbstracta fabricaPersonaje;
    
    public static FabricaAbstracta getSingletonInstance(String tipo) {
        if(fabricaPersonaje == null){
            Manejador man = new ManejadorCiborg(tipo);
            man.manejar();
            fabricaPersonaje = Manejador.devolver();
        }
        return fabricaPersonaje;
    }
}

