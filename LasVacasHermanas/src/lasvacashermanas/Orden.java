/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class Orden {
    private String ordenStr;
    private String producto;
    private int precio, cantidad, total;
     public Orden() {
      this.cantidad = 0;
      this.precio = 0;
      this.producto = "";
      this.ordenStr = "";
      this.total = 0;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the ordenStr
     */
    public String getOrdenStr() {
        return ordenStr;
    }
    public void HacerOrdenStr(){
        String x = this.producto+" / "+this.total+"₡ / "+this.cantidad+"\n";
        this.setOrdenStr(x);
    }
    /**
     * @param ordenStr the ordenStr to set
     */
    public void setOrdenStr(String ordenStr) {
        this.ordenStr = ordenStr;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
}
