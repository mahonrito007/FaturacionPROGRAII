
package facturacion;

public class Producto {
    private String nombre;
    private Double precio;
    private CategoriaProducto categoria;
    private int cantidad;   
    
    Producto(String _nombre, Double _precio, CategoriaProducto _categoria,int _cantidad)throws Exception{
        if (_nombre.isEmpty()  & _nombre.isBlank()){
            throw new Exception("Error: Nombre Invalido");
        }
        this.nombre =  _nombre;
        if (_precio<0){
            throw new Exception("Error: Precio en denominaion negativa");
        }
        this.precio = _precio;
        try{
            this.categoria = _categoria;
        }catch (Exception e){
            throw new Exception(e);
        }
        if (_cantidad<=0){
            throw new Exception("Cantidad no puede ser negativa");
        }
        this.cantidad =  _cantidad;
    }
    
    public void mostrarInfo(){
        
        System.out.printf("Producto: %-15s%-7d%-7.2f", this.nombre, this.cantidad, this.precio);
        System.out.println("");
        categoria.mostrarInfo();
    }
    
    public double getPrecio(){
        return this.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }
}
