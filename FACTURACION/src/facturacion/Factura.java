package facturacion;

import java.util.ArrayList;

public class Factura {

    private final int numero;
    private String fecha;
    private Cliente cliente;
    private final ArrayList<Producto> productos;

    @SuppressWarnings("unchecked")
    Factura(int _numero, String _fecha, Cliente _cliente, facturacion.Cliente cliente) throws Exception {
        if (_numero < 0) {
            throw new Exception("ID de valor negativo");
        } else {
            this.numero = _numero;
        }
        if (_fecha.length() == 10) {
            this.fecha = _fecha;
        } else {
            throw new Exception("Error: La feha es invalida");
        }

        try {
            this.cliente = _cliente;
        } catch (Exception e) {
            System.out.println(e);
        }

        this.productos = new ArrayList<>();
//        this.cliente = _cliente;

    }

    public void agregarProducto(Producto p) {
        try {
            this.productos.add(p);
        } catch (Exception e) {
            System.out.println("No se pudo Agregar el Producto");
        }
    }

    public void verFactura() {
        System.out.println("FACTURA");
        System.out.println("NoFactura: " + this.numero);
        System.out.println("Fecha: " + this.fecha);
        this.cliente.mostrarInfo();
        System.out.println("===============");
        if (!this.productos.isEmpty()) {
            System.out.printf("%-3s %-13s %s %-7s %s %7s", "No", "Producto", "Cantidad", "tipo", "Pasillo", "precio");
            System.out.println("");
            for (int i = 0; i < productos.size(); i++) {
                this.productos.get(i).mostrarInfo(i + 1);
            }
        }

    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
}
