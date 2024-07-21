package facturacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FACTURACION {

    public static double pagarFactura(Factura f) {
        ArrayList<Producto> productos = f.getProductos();

        double total = 0;
//        System.out.printf("%-3s%-10s%-10s%-7s%n", "No","nombre","cantidad","precio");

        for (int i = 0; i < productos.size(); i++) {
//            int pos = i+1;
//            String nombre = productos.get(i).getNombre();
            int cantidad = productos.get(i).getCantidad();
            double precio = productos.get(i).getPrecio();
//            
//            System.out.printf("%-3d%-13s%-7d%-5.2f",pos, nombre, cantidad, precio);
//            System.out.println("");
            double subtotal =  cantidad * precio;
            total += subtotal;
        }
        System.out.println("-".repeat(50));
        System.out.println(" ".repeat(28) + "TOTAL A PAGAR: " + total);
        return total;
    }

    public static void main(String[] args) {
        Factura nf;
        System.out.println("Inicio");
        String menuPrincipal = """
                          MENU
                          1. Crear nueva Factura
                          0. Salir
                          """;
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal, "0"));
            if (opcion == 0) {
                break;
            } else if (opcion == 1) {
                System.out.println("Creando una nueva factura");
                try {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                    String rtn = JOptionPane.showInputDialog("Ingrese el rtn del cliente(son 14 digitos): ");
                    String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente: ");
                    String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del cliente: ");

                    Cliente nc = new Cliente(nombre, rtn, direccion, telefono);

                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la factura: "));
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha: ");

                    nf = new Factura(numero, fecha, nc, null);
                    while (true) {
                        String menuProductos = """
                          MENU
                          1. Agregar un producto
                          2. ver productos
                          3. calcular total
                          0. Salir al Menu principal
                          """;
                        int opcionProducto = Integer.parseInt(JOptionPane.showInputDialog(menuProductos, "0"));
                        if (opcionProducto == 0) {
                            break;
                        } else if (opcionProducto == 1) {
//                            System.out.println("Agregando un producto");
                            //solicitando los datos del producto
                            String nombre_producto, categoria_producto;
                            int pasillo, cantidad;
                            double precio;

                            nombre_producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
                            categoria_producto = JOptionPane.showInputDialog("Ingrese el tipo de producto que se compra: ");
                            pasillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en que pasillo se esta pagando el producto: "));
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto que se compro: "));

                            try {
                                CategoriaProducto categoria = new CategoriaProducto(categoria_producto, pasillo);
                                Producto p = new Producto(nombre_producto, precio, categoria, cantidad);
                                nf.agregarProducto(p);
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                        } else if (opcionProducto == 2) {
//                            System.out.println("Mostrando los productos");
                            nf.verFactura();
                        } else if (opcionProducto == 3) {
//                            System.out.println("Calculando el total");
                            pagarFactura(nf);
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            } else {
                System.out.println("Opcion invalida");
            }
        }

    }

}
