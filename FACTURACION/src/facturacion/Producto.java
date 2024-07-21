
package facturacion;

public class Producto {
    private String nombre;
    private Double precio;
    private final CategoriaProducto categoria;
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
    
    public void mostrarInfo(int pos){
        if (pos == 0){
            return;
        }
        
        
        System.out.println("-".repeat(50));
        System.out.printf("%-3d %-15s ", pos,this.nombre);
        categoria.mostrarInfo();
        System.out.printf("%-7d %8.2f", this.cantidad,this.precio);
        System.out.println("");

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
