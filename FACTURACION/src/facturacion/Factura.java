
package facturacion;

import java.util.ArrayList;


public class Factura {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
    Factura(int _numero, String _fecha, Cliente _cliente) throws Exception{
        if (_numero<0){
            throw new Exception("ID de valor negativo");
        }
        else{
            this.numero = _numero;
        }
        
        this.fecha = _fecha;
        try{
            this.cliente = _cliente;
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
}
