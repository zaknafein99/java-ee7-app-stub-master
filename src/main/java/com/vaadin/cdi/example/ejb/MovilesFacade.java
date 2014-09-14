/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaadin.cdi.example.ejb;

import com.vaadin.cdi.example.entities.Moviles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ismael
 */
@Stateless
public class MovilesFacade extends AbstractFacade<Moviles> {
    @PersistenceContext(unitName = "com.vaadin_vaadin-jee7-example_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovilesFacade() {
        super(Moviles.class);
    }
    
}