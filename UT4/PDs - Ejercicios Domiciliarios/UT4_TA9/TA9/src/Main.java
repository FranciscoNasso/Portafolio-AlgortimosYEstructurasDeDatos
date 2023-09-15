
import java.util.Arrays;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // cargar los productos desde el archivo "altasprueba.txt"
        Almacen almacen = new Almacen("maxikiosco");
        System.out.println("Valor del aumento del Stock: " + altaProductos(almacen, "..\\TA9\\src\\altasPrueba.txt") + "\n");

        // agregar stock a un producto existente
        almacen.agregarStock(1000073, 3);

        // venta de un producto desde archivo
        System.out.println("Valor de la venta del Stock: " + ventaProducto(almacen, "..\\TA9\\src\\ventasPrueba.txt") + "\n");

        // eliminar producto desde archivo "elimPrueba.txt"
        //System.out.println("Valor de la venta del Stock: " + eliminarProducto(almacen, "..\\TA9\\src\\ventasPrueba.txt") + "\n");
        System.out.println("Valor de la eliminacion de Stock: " + eliminarProducto(almacen, "..\\TA9\\src\\elimPrueba.txt") + "\n");

        // buscar existencias de producto por codigo
        System.out.println("Stock del producto 1000097: " + almacen.buscarPorCodigo(1000097).getStock() + "\n");

        // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println(almacen.imprimirProductos());

    }
    

    public static int altaProductos(Almacen almacen, String ruta) {
        String[] altas = ManejadorArchivosGenerico.leerArchivo(ruta);
        int montoTotal = 0;
        for (String alta : altas) {
            String[] datosProducto = alta.split(",");

            String nombre = datosProducto[1];
            Comparable codigo = Integer.valueOf(datosProducto[0]);
            Integer precio = Integer.valueOf(datosProducto[2]);
            Integer cantidad = Integer.valueOf(datosProducto[3]);

            Producto producto = new Producto(codigo, nombre);
            producto.setPrecio(precio);
            producto.setStock(cantidad);
            almacen.insertarProducto(producto);

            montoTotal += precio * cantidad;
        }
        return montoTotal;
    }

    public static int ventaProducto(Almacen almacen, String ruta) {
        String[] ventas = ManejadorArchivosGenerico.leerArchivo(ruta);
        int montoTotal = 0;
        for (String venta : ventas) {
            String[] datosVenta = venta.split(",");
            int codigoProducto = Integer.parseInt(datosVenta[0]);
            int cantidadVender = Integer.parseInt(datosVenta[1]);

            if (almacen.restarStock(codigoProducto, cantidadVender) != -1) {
                montoTotal += almacen.buscarPorCodigo(codigoProducto).getPrecio() * cantidadVender;
            }
        }
        return montoTotal;
    }

    public static int eliminarProducto(Almacen almacen, String ruta) {
        String[] bajas = ManejadorArchivosGenerico.leerArchivo(ruta);
        int montoTotal = 0;
        for (String baja : bajas) {
            if (almacen.buscarPorCodigo(Integer.valueOf(baja)) != null) {
                montoTotal += almacen.buscarPorCodigo(Integer.valueOf(baja)).getPrecio() * almacen.buscarPorCodigo(Integer.valueOf(baja)).getStock();
            }
            almacen.eliminarProducto(Integer.valueOf(baja));
        }
        return montoTotal;
    }
}
