/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaadin.cdi.example.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ismael
 */
@Entity
@Table(name = "moviles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moviles.findAll", query = "SELECT m FROM Moviles m"),
    @NamedQuery(name = "Moviles.findByNromovil", query = "SELECT m FROM Moviles m WHERE m.nromovil = :nromovil"),
    @NamedQuery(name = "Moviles.findByObservaciones", query = "SELECT m FROM Moviles m WHERE m.observaciones = :observaciones")})
public class Moviles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nromovil")
    private Integer nromovil;
    @Size(max = 256)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "movilasignado")
    private Collection<Pedidos> pedidosCollection;
    @OneToMany(mappedBy = "idMovil")
    private Collection<Pedidos> pedidosCollection1;
    @OneToMany(mappedBy = "idMovil2")
    private Collection<Pedidos> pedidosCollection2;

    public Moviles() {
    }

    public Moviles(Integer nromovil) {
        this.nromovil = nromovil;
    }

    public Integer getNromovil() {
        return nromovil;
    }

    public void setNromovil(Integer nromovil) {
        this.nromovil = nromovil;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection1() {
        return pedidosCollection1;
    }

    public void setPedidosCollection1(Collection<Pedidos> pedidosCollection1) {
        this.pedidosCollection1 = pedidosCollection1;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection2() {
        return pedidosCollection2;
    }

    public void setPedidosCollection2(Collection<Pedidos> pedidosCollection2) {
        this.pedidosCollection2 = pedidosCollection2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nromovil != null ? nromovil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moviles)) {
            return false;
        }
        Moviles other = (Moviles) object;
        if ((this.nromovil == null && other.nromovil != null) || (this.nromovil != null && !this.nromovil.equals(other.nromovil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getNromovil().toString();
    }
    
}
