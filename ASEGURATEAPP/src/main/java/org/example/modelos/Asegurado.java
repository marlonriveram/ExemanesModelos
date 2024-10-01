package org.example.modelos;

import java.time.LocalDate;

public class Asegurado {
    private Long id;
    private  String nombreAsegurado;
    private  String apellidoAsegurado;
    private String genero;
    private Integer edad;
    private String Domicilio;
    private LocalDate fechaNacimiento;
    private String nombreSeguro;
    private  Integer costoSeguro;
    private Boolean hijos;
    private String nombreEmpresa;
    private Integer salario;
    private String nombreAseguradora;
    private LocalDate fechaPago;
    private String nombrePapa;

    public Asegurado() {
    }

    public Asegurado(Long id, String nombreAsegurado, String apellidoAsegurado, String genero, Integer edad, String domicilio, LocalDate fechaNacimiento, String nombreSeguro, Integer costoSeguro, Boolean hijos, String nombreEmpresa, Integer salario, String nombreAseguradora, LocalDate fechaPago, String nombrePapa) {
        this.id = id;
        this.nombreAsegurado = nombreAsegurado;
        this.apellidoAsegurado = apellidoAsegurado;
        this.genero = genero;
        this.edad = edad;
        Domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreSeguro = nombreSeguro;
        this.costoSeguro = costoSeguro;
        this.hijos = hijos;
        this.nombreEmpresa = nombreEmpresa;
        this.salario = salario;
        this.nombreAseguradora = nombreAseguradora;
        this.fechaPago = fechaPago;
        this.nombrePapa = nombrePapa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public String getApellidoAsegurado() {
        return apellidoAsegurado;
    }

    public void setApellidoAsegurado(String apellidoAsegurado) {
        this.apellidoAsegurado = apellidoAsegurado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public Integer getCostoSeguro() {
        return costoSeguro;
    }

    public void setCostoSeguro(Integer costoSeguro) {
        this.costoSeguro = costoSeguro;
    }

    public Boolean getHijos() {
        return hijos;
    }

    public void setHijos(Boolean hijos) {
        this.hijos = hijos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getNombreAseguradora() {
        return nombreAseguradora;
    }

    public void setNombreAseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNombrePapa() {
        return nombrePapa;
    }

    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombreAsegurado='" + nombreAsegurado + '\'' +
                ", apellidoAsegurado='" + apellidoAsegurado + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", Domicilio='" + Domicilio + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombreSeguro='" + nombreSeguro + '\'' +
                ", costoSeguro=" + costoSeguro +
                ", hijos=" + hijos +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", salario=" + salario +
                ", nombreAseguradora='" + nombreAseguradora + '\'' +
                ", fechaPago=" + fechaPago +
                ", nombrePapa='" + nombrePapa + '\'' +
                '}';
    }
}
