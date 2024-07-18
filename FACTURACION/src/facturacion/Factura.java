package facturacion;

import java.util.ArrayList;

public class Factura {

    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    Factura(int _numero, String _fecha, Cliente _cliente) throws Exception {
        if (_numero < 0) {
            throw new Exception("ID de valor negativo");
        } else {
            this.numero = _numero;
        }

        this.fecha = _fecha;
        try {
            this.cliente = _cliente;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public void verFactura() {
        System.out.println("FACTURA");
        System.out.println("NoFactura: " + this.numero);
        System.out.println("Fecha: " + this.fecha);
        this.cliente.mostrarInfo();
        System.out.println("===============");
        if (this.productos.size() == 0) {
            for (int i = 0; i < productos.size(); i++) {
                this.productos.get(i).mostrarInfo();
            }
        }

    }
}
