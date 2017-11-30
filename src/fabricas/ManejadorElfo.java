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
public class ManejadorElfo extends Manejador{

    public ManejadorElfo(String solicitud) {
        super(solicitud);
    }

    @Override
    public void manejar() {
        if(solicitud == "elfo"){
            fabrica = new FabricaElfo();
        }else{
            siguiente = new ManejadorMaga(solicitud);
            siguiente.manejar();
        }
    }
    
}
