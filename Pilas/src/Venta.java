import java.util.Date;

public class Venta {
    private int numero_pedido;
    private Date fecha;
    private int codigo;
    private int cantidad;
    private double precio;

    public Venta(int numero_pedido, Date fecha, int codigo, int cantidad, double precio) {
        this.numero_pedido=numero_pedido;      
        this.fecha=fecha;
        this.codigo=codigo;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
      return "Articulo (numero de pedido "+getNumero_pedido()+", fecha: "+getFecha()+", codigo de producto: "+getCodigo()+", cantidad pedida: "+getCantidad()+", precio: $"+getPrecio()+")";  
    }

    

    
}
