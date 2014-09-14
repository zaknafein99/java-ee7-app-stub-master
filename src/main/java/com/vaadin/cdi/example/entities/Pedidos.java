/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaadin.cdi.example.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ismael
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findPend", query = "SELECT p FROM Pedidos p WHERE p.entregado = 'P'"),
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidos.findByFechaPedido", query = "SELECT p FROM Pedidos p WHERE p.fechaPedido = :fechaPedido"),
    @NamedQuery(name = "Pedidos.findByCantidad", query = "SELECT p FROM Pedidos p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedidos.findByFlete", query = "SELECT p FROM Pedidos p WHERE p.flete = :flete"),
    @NamedQuery(name = "Pedidos.findByTotal", query = "SELECT p FROM Pedidos p WHERE p.total = :total"),
    @NamedQuery(name = "Pedidos.findByEntregado", query = "SELECT p FROM Pedidos p WHERE p.entregado = :entregado")})
public class Pedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "flete")
    private Integer flete;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "total")
    private Integer total;
    @Column(name = "ENTREGADO")
    private Character entregado;
    @JoinColumn(name = "movilasignado", referencedColumnName = "nromovil")
    @ManyToOne
    private Moviles movilasignado;
    @JoinColumn(name = "id_articulo", referencedColumnName = "codigo")
    @ManyToOne
    private Articulos idArticulo;
    @JoinColumn(name = "idcliente", referencedColumnName = "ID")
    @ManyToOne
    private Cliente idcliente;
    @JoinColumn(name = "id_movil", referencedColumnName = "nromovil")
    @ManyToOne
    private Moviles idMovil;
    @JoinColumn(name = "id_movil2", referencedColumnName = "nromovil")
    @ManyToOne
    private Moviles idMovil2;
    @JoinColumn(name = "direccion", referencedColumnName = "direccion")
    @ManyToOne
    private Direccion direccion;
    @JoinColumn(name = "telefono", referencedColumnName = "telefono")
    @ManyToOne
    private Telefono telefono;

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono Telefono) {
        this.telefono = getIdcliente().getTelefono();
    }

    public Direccion getDireccion() {
        return idcliente.getDireccion();
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, Date fechaPedido) {
        this.id = id;
        this.fechaPedido = fechaPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getFlete() {
        return flete;
    }

    public void setFlete(Integer flete) {
        this.flete = flete;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Character getEntregado() {
        return entregado;
    }

    public void setEntregado(Character entregado) {
        this.entregado = entregado;
    }

    public Moviles getMovilasignado() {
        return movilasignado;
    }

    public void setMovilasignado(Moviles movilasignado) {
        this.movilasignado = movilasignado;
    }

    public Articulos getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Articulos idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Moviles getIdMovil() {
        return idMovil;
    }

    public void setIdMovil(Moviles idMovil) {
        this.idMovil = idMovil;
    }

    public Moviles getIdMovil2() {
        return idMovil2;
    }

    public void setIdMovil2(Moviles idMovil2) {
        this.idMovil2 = idMovil2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return null;
    }
    
}
