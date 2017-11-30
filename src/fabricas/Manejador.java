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
public abstract class Manejador {

    protected Manejador siguiente;
    protected String solicitud;
    protected static FabricaAbstracta fabrica;

    public Manejador(String solicitud) {
        this.solicitud = solicitud;
    }

    public abstract void manejar();

    public static FabricaAbstracta devolver() {
        return fabrica;
    }
}
