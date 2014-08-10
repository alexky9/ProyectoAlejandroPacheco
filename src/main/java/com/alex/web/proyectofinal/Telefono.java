/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alex.web.proyectofinal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alexkyn
 */
@Entity
@Table(name = "Telefono")
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t")})
public class Telefono implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_telefonocli")
    private Integer idTelefonocli;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_tipotel")
    private Integer idTipotel;
    @Column(name = "Numero_telefono")
    private String numerotelefono;

    public Telefono() {
    }

    public Telefono(Integer idTelefonocli, Integer idCliente, Integer idTipotel, String numerotelefono) {
        this.idTelefonocli = idTelefonocli;
        this.idCliente = idCliente;
        this.idTipotel = idTipotel;
        this.numerotelefono = numerotelefono;
    }

    public Telefono(Integer idTelefonocli) {
        this.idTelefonocli = idTelefonocli;
    }

    public Integer getIdTelefonocli() {
        return idTelefonocli;
    }

    public void setIdTelefonocli(Integer idTelefonocli) {
        this.idTelefonocli = idTelefonocli;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdTipotel() {
        return idTipotel;
    }

    public void setIdTipotel(Integer idTipotel) {
        this.idTipotel = idTipotel;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelefonocli != null ? idTelefonocli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.idTelefonocli == null && other.idTelefonocli != null) || (this.idTelefonocli != null && !this.idTelefonocli.equals(other.idTelefonocli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Telefono[ idTelefonocli=" + idTelefonocli + " ]";
    }
    
}
