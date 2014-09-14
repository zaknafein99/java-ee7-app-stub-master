package com.vaadin.cdi.example.entities;

import com.vaadin.cdi.example.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-13T19:54:03")
@StaticMetamodel(Moviles.class)
public class Moviles_ { 

    public static volatile SingularAttribute<Moviles, String> observaciones;
    public static volatile SingularAttribute<Moviles, Integer> nromovil;
    public static volatile CollectionAttribute<Moviles, Pedidos> pedidosCollection2;
    public static volatile CollectionAttribute<Moviles, Pedidos> pedidosCollection;
    public static volatile CollectionAttribute<Moviles, Pedidos> pedidosCollection1;

}