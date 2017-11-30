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
public class ManejadorGuerrero extends Manejador{

    public ManejadorGuerrero(String solicitud) {
        super(solicitud);
    }

    @Override
    public void manejar() {
        if(solicitud == "guerrero"){
            fabrica = new FabricaGuerrero();
        }else{
            siguiente = new ManejadorElfo(solicitud);
            siguiente.manejar();
        }
    }
    
}
