/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.cdi.example.view;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.example.ejb.ClienteFacade;
import com.vaadin.cdi.example.ejb.PedidosFacade;
import com.vaadin.cdi.example.entities.Cliente;
import com.vaadin.cdi.example.entities.Pedidos;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.event.LayoutEvents;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.vaadin.maddon.fields.MTable;
import org.vaadin.maddon.label.Header;
import org.vaadin.maddon.layouts.MVerticalLayout;

/**
 *
 * @author Matti Tahvonen <matti@vaadin.com>
 */

@CDIView("Clientes")
public class ListarClientes extends MVerticalLayout implements View {
    
    @Inject
    ClienteFacade cf;
    
    @PostConstruct
    public void initComponent() {
        addComponents(
                new Header("Clientes")
        );
        
        
        
        List<Cliente>findAll = cf.findAll();
        MTable<Cliente> mTable = new MTable<Cliente>(Cliente.class);
        mTable.setBeans(findAll);
        
        Label lblNombre = new Label();
        lblNombre.setImmediate(false);
        lblNombre.setWidth("-1px");
        lblNombre.setHeight("-1px");
        lblNombre.setValue("Nombre:");
        addComponent(lblNombre);
        addComponent(mTable);

        addLayoutClickListener(new LayoutEvents.LayoutClickListener() {

            @Override
            public void layoutClick(LayoutEvents.LayoutClickEvent event) {
                
            }
        });

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }

}
