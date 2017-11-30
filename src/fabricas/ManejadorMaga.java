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
public class ManejadorMaga extends Manejador{

   public ManejadorMaga(String solicitud) {
        super(solicitud);
    }

    @Override
    public void manejar() {
        if(solicitud == "maga"){
            fabrica = new FabricaMaga();
        }else{
            siguiente = new ManejadorCiborg(solicitud);
            siguiente.manejar(); 
        }
    }
    
}
