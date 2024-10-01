package org.example.modelos;

public class Beneficiario {
    private Long id;
    private String nombreBeneficario;
    private String apellidoBeneficiaro;
    private String telefono;
    private String email;
    private  String estadoCivil;
    private String nacionalidad;
    private String estrato;
    private String ocupacion;
    private String ingresoAnual;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombreBeneficario, String apellidoBeneficiaro, String telefono, String email, String estadoCivil, String nacionalidad, String estrato, String ocupacion, String ingresoAnual) {
        this.id = id;
        this.nombreBeneficario = nombreBeneficario;
        this.apellidoBeneficiaro = apellidoBeneficiaro;
        this.telefono = telefono;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
        this.estrato = estrato;
        this.ocupacion = ocupacion;
        this.ingresoAnual = ingresoAnual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreBeneficario() {
        return nombreBeneficario;
    }

    public void setNombreBeneficario(String nombreBeneficario) {
        this.nombreBeneficario = nombreBeneficario;
    }

    public String getApellidoBeneficiaro() {
        return apellidoBeneficiaro;
    }

    public void setApellidoBeneficiaro(String apellidoBeneficiaro) {
        this.apellidoBeneficiaro = apellidoBeneficiaro;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getIngresoAnual() {
        return ingresoAnual;
    }

    public void setIngresoAnual(String ingresoAnual) {
        this.ingresoAnual = ingresoAnual;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombreBeneficario='" + nombreBeneficario + '\'' +
                ", apellidoBeneficiaro='" + apellidoBeneficiaro + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", estrato='" + estrato + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", ingresoAnual='" + ingresoAnual + '\'' +
                '}';
    }
}
