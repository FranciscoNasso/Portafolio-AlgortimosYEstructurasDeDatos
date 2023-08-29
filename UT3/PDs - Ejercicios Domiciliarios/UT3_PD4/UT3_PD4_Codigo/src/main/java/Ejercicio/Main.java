/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio;

/**
 *
 * @author Nacho
 */
public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen("test", "123", "almacen1");
        System.out.println("Monto Incrementado: $" + altaProductos(almacen, "..\\UT3_PD4_Codigo\\src\\main\\java\\Txts\\altas.txt"));
        System.out.println("Monto Vendido: $" + ventaProducto(almacen, "..\\UT3_PD4_Codigo\\src\\main\\java\\Txts\\ventas.txt"));
        
    }
    
    public static int altaProductos(Almacen almacen, String ruta){
        String[] altas = ManejadorArchivosGenerico.leerArchivo(ruta);
        int montoTotal = 0;
        for(String alta : altas) {
            String[] datosProducto = alta.split(",");  
            
            String nombre = datosProducto[1];
            Comparable codigo = datosProducto[0];
            Integer precio = Integer.valueOf(datosProducto[2]);
            Integer cantidad = Integer.valueOf(datosProducto[3]);
            
            Producto producto = new Producto(nombre, codigo, precio, cantidad);
            almacen.insertarProducto(producto);
            
            montoTotal += precio * cantidad;
        }
        return montoTotal;
    }
    
    public static int ventaProducto(Almacen almacen, String ruta){
        String[] ventas = ManejadorArchivosGenerico.leerArchivo(ruta);
        int montoTotal = 0;
        for(String venta : ventas) {
           String[] datosVenta = venta.split(","); 
           int cantidad = Integer.parseInt(datosVenta[1]);
           almacen.restarStock(datosVenta[0], cantidad);
           
           montoTotal += almacen.buscarPorCodigo(datosVenta[0]).getPrecio() * cantidad;
        }
        return montoTotal;
    }
    
}
