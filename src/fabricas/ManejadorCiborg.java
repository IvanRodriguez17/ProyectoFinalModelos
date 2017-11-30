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
public class ManejadorCiborg extends Manejador{

    public ManejadorCiborg(String solicitud) {
        super(solicitud);
    }

    @Override
    public void manejar() {
        if(solicitud == "ciborg"){
            fabrica = new FabricaCiborg();
        }else{
            siguiente = new ManejadorGuerrero(solicitud);
            siguiente.manejar();
        }
    }
    
}
