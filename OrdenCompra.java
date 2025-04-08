import java.util.Date;

public class OrdenCompra {
    private static int ultimoId = 0;
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto = 0;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;

    }
    public OrdenCompra( String descripcion, Date fecha, Cliente cliente) {
        this(descripcion);
        this.fecha = fecha;
        this.cliente = cliente;

    }

    public void addProducto(Producto producto){
        if (indiceProducto < productos.length) {
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos");
        }
    }

    public int montoFinal(Producto[] productos){
        int total = 0;
        for (int i = 0; i < productos.length; i++){
            if (productos[i]!=null){
                total += productos[i].getPrecio();
            }
        }
        return total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }
}
