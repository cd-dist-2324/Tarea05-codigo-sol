public class LineaArticulo {

  private Integer id;

  private Integer cantidad;

  private Float precio;

    private Pedido pedido;
    private Articulo articulo;
    private CarritoCompra carrito;


    
    public Integer getId() {
      return id;
    }
    public void setId(Integer id) {
      this.id = id;
    }
    public Integer getCantidad() {
      return cantidad;
    }
    public void setCantidad(Integer cantidad) {
      this.cantidad = cantidad;
    }
    public Float getPrecio() {
      return precio;
    }
    public void setPrecio(Float precio) {
      this.precio = precio;
    }
    public Pedido getPedido() {
      return pedido;
    }
    public void setPedido(Pedido pedido) {
      this.pedido = pedido;
    }
    public Articulo getArticulo() {
      return articulo;
    }
    public void setArticulo(Articulo articulo) {
      this.articulo = articulo;
    }
    public CarritoCompra getCarrito() {
      return carrito;
    }
    public void setCarrito(CarritoCompra carrito) {
      this.carrito = carrito;
    }


    

}