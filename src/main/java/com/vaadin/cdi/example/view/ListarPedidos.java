/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.cdi.example.view;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.example.ejb.PedidosFacade;
import com.vaadin.cdi.example.entities.Pedidos;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.event.LayoutEvents;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
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

@CDIView("Pedidos")
public class ListarPedidos extends MVerticalLayout implements View {
    
    @Inject
    PedidosFacade pf;
    
    @PostConstruct
    public void initComponent() {
        addComponents(
                new Header("Pedidos Pendientes")
        );
        
        List<Pedidos>findAll = pf.findPend();
        MTable<Pedidos> mTable = new MTable<Pedidos>(Pedidos.class);
        mTable.setBeans(findAll);
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
