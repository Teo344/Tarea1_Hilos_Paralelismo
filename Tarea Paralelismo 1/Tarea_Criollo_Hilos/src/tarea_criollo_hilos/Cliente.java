
package tarea_criollo_hilos;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Cliente {

	private String nombre;
	private int[] carroCompra;
        private int tiempoPago;
        private int metodoPago;
        private int tiempoFactura;

    public Cliente(String nombre, int[] carroCompra, int metodoPago) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
        this.metodoPago= metodoPago;
        this.tiempoPago=calculoTiempo();
        this.tiempoFactura=calculoFactura();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }

    public int getTiempoPago() {
        return tiempoPago;
    }

    public void setTiempoPago(int tiempoPago) {
        this.tiempoPago = tiempoPago;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getTiempoFactura() {
        return tiempoFactura;
    }

    public void setTiempoFactura(int tiempoFactura) {
        this.tiempoFactura = tiempoFactura;
    }
    
    
    
    private int calculoTiempo(){
        if (this.metodoPago==1){
            return 20;
        }
        return 15;
    }
    
    private int calculoFactura(){
        return carroCompra.length + 3;
    }
        
}
