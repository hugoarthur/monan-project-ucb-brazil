/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hugo Arthur
 */
public class DataBase {

    private static EntityManager entityManager;
    private static DataBase bd;

    private DataBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TCCPU");
        setEntityManager(emf.createEntityManager());
    }

    public static DataBase getInstance() {
        if (bd == null) {
            bd = new DataBase();
        }
        return bd;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        DataBase.entityManager = entityManager;
    }

    public DataBase getBd() {
        return bd;
    }

    public void setBd(DataBase bd) {
        DataBase.bd = bd;
    }
}
