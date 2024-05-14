import java.util.Vector;

public class Pedido {

  private Integer numero;

  private DateTime fecha;

  private Float total;

  private EstadosPedido estado;

    /**
   * 
   * @element-type LineaArticulo
   */
  private Vector  lineas;
    private Comprador comprador;
    private Direccion direccionEntrega;

  public Float calcularTotal() {
  return null;
  }

}