public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;

    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        TElementoAB unElemento = new TElementoAB(unProducto.getEtiqueta(), unProducto);
        productos.insertar(unElemento);
    }

    @Override
    public String imprimirProductos() {
        String resultado = "";
        String [] etiquetas = productos.inOrden().split(" ");
        for (String etiqueta : etiquetas){
            TElementoAB<Producto> producto = productos.buscar(Integer.valueOf(etiqueta));
            resultado += 
                    "Codigo: " + etiqueta + 
                    " - Stock: " + producto.getDatos().getStock() + 
                    "\n";
        }
        return resultado;
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Producto p = (Producto) productos.buscar(clave).getDatos();
        if (p != null){
            p.agergarStock(cantidad);
            return true;
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        TElementoAB<Producto> p = productos.buscar(clave);
        if (p != null){
            Producto prod = (Producto) p.getDatos();
            return prod.restarStock(cantidad);
        }
        return -1;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        TElementoAB<Producto> p = productos.buscar(clave);
        if (p != null){
            Producto prod = (Producto) p.getDatos();
            return prod;
        }
        return null;
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        productos.eliminar(clave);
        return productos.buscar(clave) == null;
    }


   
 
   


  

   

   

   

}
