package org.example.modelos;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Locale;

public class Vehiculo {
    private  Long id;
    private String placa;
    private String modelo;
    private String marca;
    private String cilindraje;
    private String color;
    private Boolean tieneRinesDeLujo;
    private String tipoCojineria;
    private String tipoDeCombutible;
    private String tipoVehiculo;
    private String velocidadMaxima;
    private Boolean tieneFrenoDisco;
    private Boolean esQP;
    private LocalDate fehcaCompra;
    private String nombreDueño;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa, String modelo, String marca, String cilindraje, String color, Boolean tieneRinesDeLujo, String tipoCojineria, String tipoDeCombutible, String tipoVehiculo, String velocidadMaxima, Boolean tieneFrenoDisco, Boolean esQP, LocalDate fehcaCompra, String nombreDueño) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.tieneRinesDeLujo = tieneRinesDeLujo;
        this.tipoCojineria = tipoCojineria;
        this.tipoDeCombutible = tipoDeCombutible;
        this.tipoVehiculo = tipoVehiculo;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneFrenoDisco = tieneFrenoDisco;
        this.esQP = esQP;
        this.fehcaCompra = fehcaCompra;
        this.nombreDueño = nombreDueño;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getTieneRinesDeLujo() {
        return tieneRinesDeLujo;
    }

    public void setTieneRinesDeLujo(Boolean tieneRinesDeLujo) {
        this.tieneRinesDeLujo = tieneRinesDeLujo;
    }

    public String getTipoCojineria() {
        return tipoCojineria;
    }

    public void setTipoCojineria(String tipoCojineria) {
        this.tipoCojineria = tipoCojineria;
    }

    public String getTipoDeCombutible() {
        return tipoDeCombutible;
    }

    public void setTipoDeCombutible(String tipoDeCombutible) {
        this.tipoDeCombutible = tipoDeCombutible;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Boolean getTieneFrenoDisco() {
        return tieneFrenoDisco;
    }

    public void setTieneFrenoDisco(Boolean tieneFrenoDisco) {
        this.tieneFrenoDisco = tieneFrenoDisco;
    }

    public Boolean getEsQP() {
        return esQP;
    }

    public void setEsQP(Boolean esQP) {
        this.esQP = esQP;
    }

    public LocalDate getFehcaCompra() {
        return fehcaCompra;
    }

    public void setFehcaCompra(LocalDate fehcaCompra) {
        this.fehcaCompra = fehcaCompra;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", color='" + color + '\'' +
                ", tieneRinesDeLujo=" + tieneRinesDeLujo +
                ", tipoCojineria='" + tipoCojineria + '\'' +
                ", tipoDeCombutible='" + tipoDeCombutible + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", velocidadMaxima='" + velocidadMaxima + '\'' +
                ", tieneFrenoDisco=" + tieneFrenoDisco +
                ", esQP=" + esQP +
                ", fehcaCompra=" + fehcaCompra +
                ", nombreDueño='" + nombreDueño + '\'' +
                '}';
    }
}
