
package facturacion;

import java.util.ArrayList;


public class Factura {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
    Factura(int _numero, String _fecha, Cliente _cliente){
        this.numero = _numero;
        this.fecha = _fecha;
        this.cliente = _cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
}
