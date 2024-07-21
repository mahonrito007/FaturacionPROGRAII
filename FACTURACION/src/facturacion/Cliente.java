package facturacion;

public class Cliente {

    public String nombre;
    private String rtn;
    private String direccion;
    private String telefono;

    Cliente(String _nombre, String _rtn, String _direccion, String _telefono) throws Exception {
        if (_nombre.isEmpty()) {
            throw new Exception("nombre vacio");
        } else {
            this.nombre = _nombre;
        }

        if (_rtn.length() > 14) {
            throw new Exception("RTN invalido, tiene mas digitos de los esperados");
        } else if (_rtn.length() <= 13) {
            throw new Exception("RTN invalido, la longitud de la cadena no es la esperada");
        } else {
            this.rtn = _rtn;
        }

        this.direccion = _direccion;

        if (_telefono.length() <= 7 || _telefono.length() >= 12) {
            throw new Exception("Numero de telefono invalido");
        } else {
            this.telefono = _telefono;
        }
    }

    public void mostrarInfo() {
        System.out.println("====Cliente====");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("RTN: " + this.rtn);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);

    }
}
