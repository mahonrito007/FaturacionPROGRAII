
package facturacion;
import java.util.ArrayList;
public class FACTURACION {
    public static double pagarFactura(Factura f){
        ArrayList<Producto> productos = f.getProductos();
        
        double suma=0;
//        System.out.printf("%-3s%-10s%-10s%-7s%n", "No","nombre","cantidad","precio");
        for (int i =0;i<productos.size();i++){
//            int pos = i+1;
//            String nombre = productos.get(i).getNombre();
//            int cantidad = productos.get(i).getCantidad();
//            double precio = productos.get(i).getPrecio();
//            
//            System.out.printf("%-3d%-13s%-7d%-5.2f",pos, nombre, cantidad, precio);
//            System.out.println("");
            suma+= productos.get(i).getPrecio();
        }
        System.out.println("TOTAL A PAGAR: "+ suma);
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.println("Inicio");
        try{
            Cliente c = new Cliente("juan","12345654447123","choloma" ,"12345456");
            Factura f = new Factura(123456,"21/07/2024",c);
            
            CategoriaProducto categoria = new CategoriaProducto("mueble",3);
            Producto p = new Producto("silla", 120.99,categoria,24);
            f.agregarProducto(p);
            categoria = new CategoriaProducto("mueble",3);
            p = new Producto("mesa", 720.99,categoria,20);
            f.agregarProducto(p);
            categoria = new CategoriaProducto("TECH",17);
            p = new Producto("PC GAMER", 1120.99,categoria,6);
            f.agregarProducto(p);
            f.verFactura();
            
            pagarFactura(f);
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        
    }
    
}
