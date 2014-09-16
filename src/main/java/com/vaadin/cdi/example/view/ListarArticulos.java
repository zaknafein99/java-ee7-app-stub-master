/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaadin.cdi.example.view;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.example.ejb.ArticulosFacade;
import com.vaadin.cdi.example.entities.Articulos;
import com.vaadin.event.LayoutEvents;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.vaadin.maddon.fields.MTable;
import org.vaadin.maddon.label.Header;
import org.vaadin.maddon.layouts.MVerticalLayout;

/**
 *
 * @author Ismael
 */
@CDIView("Articulos")
public class ListarArticulos extends MVerticalLayout implements View{
    @Inject
    ArticulosFacade af;
    
    @PostConstruct
    public void initComponent() {
        addComponents(
                new Header("Articulos")
        );
        
        
        
        List<Articulos>findAll = af.findAll();
        MTable<Articulos> mTable = new MTable<Articulos>(Articulos.class);
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
