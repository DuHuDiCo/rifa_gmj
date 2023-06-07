
package com.gmjHogar.rifa_bakend.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Participante {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idParticipante;
    
    private String nombre;
    private String email;
    private String celular;
    private String celular2;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;
    

    public Participante() {
    }

    public Participante(String nombre, String email, String celular, String celular2, Date fecha_registro) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.celular2 = celular2;
        this.fecha_registro = fecha_registro;
    }

    public Long getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(Long idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    
    
    
    
    
}
