import java.time.LocalDateTime;
import java.util.Vector;

public class Pedido {

  private Integer numero;

  private LocalDateTime fecha;

  private Float total;

  private EstadosPedido estado;

  /**
   * 
   * @element-type LineaArticulo
   */
  private Vector<LineaArticulo> lineas;
  private Comprador comprador;
  private Direccion direccionEntrega;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public LocalDateTime getFecha() {
    return fecha;
  }

  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }

  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public EstadosPedido getEstado() {
    return estado;
  }

  public void setEstado(EstadosPedido estado) {
    this.estado = estado;
  }

  public Vector<LineaArticulo> getLineas() {
    return lineas;
  }

  public void setLineas(Vector<LineaArticulo> lineas) {
    this.lineas = lineas;
  }

  public Comprador getComprador() {
    return comprador;
  }

  public void setComprador(Comprador comprador) {
    this.comprador = comprador;
  }

  public Direccion getDireccionEntrega() {
    return direccionEntrega;
  }

  public void setDireccionEntrega(Direccion direccionEntrega) {
    this.direccionEntrega = direccionEntrega;
  }

  public Float calcularTotal() {
    float total = 0;
    for (LineaArticulo lineaArticulo : lineas) {
      total += lineaArticulo.getCantidad() * lineaArticulo.getPrecio();
    }
    return total;
  }

}