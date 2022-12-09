/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico_.pkg3;

/**
 *
 * @author Arturo
 */
public class Automovil {
    private String marca;
    private int modelo;
    private String tipoCombustible;
    private String tipoAutomovil;
    private int velocidadMaxima;
    private String color;
    private int velocidadActual;
    private int Placa;
    public Automovil(String a, int b, String c, String d, int e, String f, int g, int h) {
        this.marca = a;
        this.modelo = b;
        this.tipoAutomovil = d;
        this.tipoCombustible = c;
        this.velocidadActual = g;
        this.velocidadMaxima = e;
        this.color = f;
        this.Placa = h;
    }
    public Automovil() {
        this.marca = "";
        this.modelo = 0;
        this.tipoAutomovil = "";
        this.tipoCombustible = "";
        this.velocidadActual = 0;
        this.velocidadMaxima = 0;
        this.color = "";
        this.Placa = 0;
    }
    public void Acelerar(){
        if(this.velocidadActual>=this.velocidadMaxima){
            this.velocidadActual += 10;
        }else{
            System.out.println("NO SE PUEDE BAJAR MAS LA VELOCIDAD");
        }
    }
    public void Desacelerar(){
        if(this.velocidadActual>1){
            this.velocidadActual -= 10;
        }else{
            System.out.println("NO SE PUEDE BAJAR MAS LA VELOCIDAD");
        }
    }
    public void Frenar(){
        this.velocidadActual = 0;
    }
    
    
    
    
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipoCombustible
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * @param tipoCombustible the tipoCombustible to set
     */
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * @return the tipoAutomovil
     */
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    /**
     * @param tipoAutomovil the tipoAutomovil to set
     */
    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    /**
     * @return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the velocidadActual
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    /**
     * @return the Placa
     */
    public int getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(int Placa) {
        this.Placa = Placa;
    }
}
