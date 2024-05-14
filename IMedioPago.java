/*
 */
public interface IMedioPago {

  public Boolean validarPago(Float total, MedioPago medio);

  public Boolean realizarPago(Float total, IMedioPago medio);

}