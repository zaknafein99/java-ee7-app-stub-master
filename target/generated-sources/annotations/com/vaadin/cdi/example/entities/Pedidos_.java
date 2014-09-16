package com.vaadin.cdi.example.entities;

import com.vaadin.cdi.example.entities.Articulos;
import com.vaadin.cdi.example.entities.Cliente;
import com.vaadin.cdi.example.entities.Direccion;
import com.vaadin.cdi.example.entities.Moviles;
import com.vaadin.cdi.example.entities.Telefono;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-15T21:53:13")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Articulos> idArticulo;
    public static volatile SingularAttribute<Pedidos, Moviles> movilasignado;
    public static volatile SingularAttribute<Pedidos, Direccion> direccion;
    public static volatile SingularAttribute<Pedidos, Date> fechaPedido;
    public static volatile SingularAttribute<Pedidos, Cliente> idcliente;
    public static volatile SingularAttribute<Pedidos, Integer> total;
    public static volatile SingularAttribute<Pedidos, Moviles> idMovil2;
    public static volatile SingularAttribute<Pedidos, String> observaciones;
    public static volatile SingularAttribute<Pedidos, Character> entregado;
    public static volatile SingularAttribute<Pedidos, Moviles> idMovil;
    public static volatile SingularAttribute<Pedidos, Integer> id;
    public static volatile SingularAttribute<Pedidos, Integer> cantidad;
    public static volatile SingularAttribute<Pedidos, Telefono> telefono;
    public static volatile SingularAttribute<Pedidos, Integer> flete;

}