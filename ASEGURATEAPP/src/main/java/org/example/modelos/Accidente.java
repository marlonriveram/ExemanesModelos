package org.example.modelos;

import java.time.LocalDate;

public class Accidente {
    private Integer id;
    private String tipoAccidente;
    private LocalDate fechaAccidente;
    private String Ubicacion;
    private Integer numeroHeridos;
    private Integer numeroFallecidos;
    private  String estadoVital;
    private Boolean hayTestigos;
    private String descripcion;
    private String reportadoPor;

    public Accidente() {
    }

    public Accidente(Integer id, String tipoAccidente, LocalDate fechaAccidente, String ubicacion, Integer numeroHeridos, Integer numeroFallecidos, String estadoVital, Boolean hayTestigos, String descripcion, String reportadoPor) {
        this.id = id;
        this.tipoAccidente = tipoAccidente;
        this.fechaAccidente = fechaAccidente;
        Ubicacion = ubicacion;
        this.numeroHeridos = numeroHeridos;
        this.numeroFallecidos = numeroFallecidos;
        this.estadoVital = estadoVital;
        this.hayTestigos = hayTestigos;
        this.descripcion = descripcion;
        this.reportadoPor = reportadoPor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public LocalDate getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(LocalDate fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public Integer getNumeroHeridos() {
        return numeroHeridos;
    }

    public void setNumeroHeridos(Integer numeroHeridos) {
        this.numeroHeridos = numeroHeridos;
    }

    public Integer getNumeroFallecidos() {
        return numeroFallecidos;
    }

    public void setNumeroFallecidos(Integer numeroFallecidos) {
        this.numeroFallecidos = numeroFallecidos;
    }

    public String getEstadoVital() {
        return estadoVital;
    }

    public void setEstadoVital(String estadoVital) {
        this.estadoVital = estadoVital;
    }

    public Boolean getHayTestigos() {
        return hayTestigos;
    }

    public void setHayTestigos(Boolean hayTestigos) {
        this.hayTestigos = hayTestigos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReportadoPor() {
        return reportadoPor;
    }

    public void setReportadoPor(String reportadoPor) {
        this.reportadoPor = reportadoPor;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", fechaAccidente=" + fechaAccidente +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", numeroHeridos=" + numeroHeridos +
                ", numeroFallecidos=" + numeroFallecidos +
                ", estadoVital='" + estadoVital + '\'' +
                ", hayTestigos=" + hayTestigos +
                ", descripcion='" + descripcion + '\'' +
                ", reportadoPor='" + reportadoPor + '\'' +
                '}';
    }
}

