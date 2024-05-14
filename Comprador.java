import java.util.Vector;

public class Comprador {

  private String nombreCompleto;

  private String email;

  private Integer id;

    /**
   * 
   * @element-type Pedido
   */
  private Vector  pedidos;
    /**
   * 
   * @element-type Direccion
   */
  private Vector  direcciones;
    private CarritoCompra carrito;

  public Boolean realizarPago(Pedido pedido, IMedioPago medio) {
  return null;
  }

  public void visualizarPedidos() {
  }

  public void cancelarPedido(Pedido pedido) {
  }

  public Pedido comenzarPedido() {
  return null;
  }

  public void añadirProducto(Articulo articulo) {
  }

  public void eliminarProducto(Articulo articulo) {
  }

}