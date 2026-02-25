public class pedido{

    private int idPedido;
    private int idCliente;
    private String producto;
    private float precio;
    private int cantidad;
    private boolean activo;
    
    public void pedido(int idPedido, int idCliente, String producto, float precio, int cantidad, boolean activo){

        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.activo = activo;

    }

    @Override
    public String toString(){
        return(idPedido+","+ idCliente+","+ producto+","+ precio+","+ cantidad+","+activo);
    }
}