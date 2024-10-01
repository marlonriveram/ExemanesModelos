package org.example.modelos;

import javax.swing.*;

public class Aseguradora {
    private Long id;
    private String nombre;
    private String direccion;
    private  String telefono;
    private String email;
    private String paginaWeb;
    private String numeroDePolizas;
    private Integer numeroClientes;
    private String sucursal;
    private  String clasificacion;

    public Aseguradora() {
    }

    public Aseguradora(Long id, String nombre, String direccion, String telefono, String email, String paginaWeb, String numeroDePolizas, Integer numeroClientes, String sucursal, String clasificacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.paginaWeb = paginaWeb;
        this.numeroDePolizas = numeroDePolizas;
        this.numeroClientes = numeroClientes;
        this.sucursal = sucursal;
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNumeroDePolizas() {
        return numeroDePolizas;
    }

    public void setNumeroDePolizas(String numeroDePolizas) {
        this.numeroDePolizas = numeroDePolizas;
    }

    public Integer getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(Integer numeroClientes) {
        this.numeroClientes = numeroClientes;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", numeroDePolizas='" + numeroDePolizas + '\'' +
                ", numeroClientes=" + numeroClientes +
                ", sucursal='" + sucursal + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                '}';
    }
}
