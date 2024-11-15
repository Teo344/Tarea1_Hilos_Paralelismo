
package tarea_criollo_hilos;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Cajera {

    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        

	public void procesarCompra(Cliente cliente, long timeStamp) {

		System.out.println("La cajera " + this.nombre + 
				" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + 
				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");

		for (int i = 0; i < cliente.getCarroCompra().length; i++) { 
				this.esperarXsegundos(cliente.getCarroCompra()[i]); 
				System.out.println("Procesado el producto " + (i + 1) + " del "+ cliente.getNombre()+
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}
                this.esperarXsegundos(cliente.getTiempoPago());
                System.out.println("Metodo por el cual pagara el cliente: Metodo " + cliente.getMetodoPago() + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
                
                this.esperarXsegundos(cliente.getTiempoFactura());
                System.out.println("Tiempo de imprimir la factura -> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
