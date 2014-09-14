package com.vaadin.cdi.example.entities;

import com.vaadin.cdi.example.entities.Direccion;
import com.vaadin.cdi.example.entities.Pedidos;
import com.vaadin.cdi.example.entities.Telefono;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-13T19:54:03")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Character> estado;
    public static volatile SingularAttribute<Cliente, Direccion> direccion;
    public static volatile SingularAttribute<Cliente, String> tipocliente;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, Telefono> telefono;
    public static volatile SingularAttribute<Cliente, String> apellidonombre;
    public static volatile CollectionAttribute<Cliente, Pedidos> pedidosCollection;

}