
package facturacion;

public class Producto {
    private String nombre;
    private Double precio;
    private CategoriaProducto categoria;
    private int cantidad;   
    
    Producto(String _nombre, Double _precio, CategoriaProducto _categoria,int _cantidad){
        this.nombre =  _nombre;
        this.precio = _precio;
        this.categoria = _categoria;
        this.cantidad =  _cantidad;
    }
    
    public void mostrarInfo(){
        System.out.println("====Producto");
        System.out.println("Nombre: "+ this.nombre+"\nPrecio: "+this.precio +"\nCantidad: "+this.cantidad);
        categoria.mostrarInfo();
    }
}
