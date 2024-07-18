
package facturacion;

public class FACTURACION {

    public static void main(String[] args) {
        System.out.println("Inicio");
        try{
            Cliente c = new Cliente("juan","12345654447123","choloma" ,"12345456");
            Factura f = new Factura(123456,"",c);
            
            CategoriaProducto categoria = new CategoriaProducto("mueble",3);
            Producto p = new Producto("silla", 120.99,categoria,24);
            f.agregarProducto(p);
            f.agregarProducto(p);
            f.agregarProducto(p);
            f.verFactura();
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        
    }
    
}
