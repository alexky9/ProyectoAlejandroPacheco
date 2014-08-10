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
@Table(name = "Tipo_telefono")
@NamedQueries({
    @NamedQuery(name = "Tipotelefono.findAll", query = "SELECT t FROM Tipotelefono t")})
public class Tipotelefono implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoTel")
    private Integer idtipoTel;
    @Column(name = "nombre_tipo")
    private String nombreTipo;

    public Tipotelefono() {
    }

    public Tipotelefono(Integer idtipoTel, String nombreTipo) {
        this.idtipoTel = idtipoTel;
        this.nombreTipo = nombreTipo;
    }

    public Tipotelefono(Integer idtipoTel) {
        this.idtipoTel = idtipoTel;
    }

    public Integer getIdtipoTel() {
        return idtipoTel;
    }

    public void setIdtipoTel(Integer idtipoTel) {
        this.idtipoTel = idtipoTel;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoTel != null ? idtipoTel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotelefono)) {
            return false;
        }
        Tipotelefono other = (Tipotelefono) object;
        if ((this.idtipoTel == null && other.idtipoTel != null) || (this.idtipoTel != null && !this.idtipoTel.equals(other.idtipoTel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Tipotelefono[ idtipoTel=" + idtipoTel + " ]";
    }
    
}
