package com.vaadin.cdi.example.entities;

import com.vaadin.cdi.example.entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-09-13T19:54:03")
@StaticMetamodel(Articulos.class)
public class Articulos_ { 

    public static volatile SingularAttribute<Articulos, Integer> codigo;
    public static volatile SingularAttribute<Articulos, Integer> precio;
    public static volatile SingularAttribute<Articulos, Integer> kgs;
    public static volatile SingularAttribute<Articulos, String> nombre;
    public static volatile CollectionAttribute<Articulos, Pedidos> pedidosCollection;

}