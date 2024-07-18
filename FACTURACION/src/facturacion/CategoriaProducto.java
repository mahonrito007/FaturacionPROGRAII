package facturacion;

public class CategoriaProducto {

    private String nombre;
    private int pasillo;

    CategoriaProducto(String _nombre, int _pasillo) throws Exception {
        if (_nombre.isEmpty()) {
            throw new Exception("Nombre vacio");
        } else {
            this.nombre = _nombre;
        }

        if (_pasillo < 0) {
            throw new Exception("pasillo con valor negativo");
        } else {
            this.pasillo = _pasillo;
        }

    }
    
    public void mostrarInfo(){
        System.out.println("====CATEGORIA de PRODUCTO=====");
        System.out.println("Nombre: "+ this.nombre + "\n"
                + "Pasillo: "+ this.pasillo);
    }
}
