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
    
    private static EntityManagerFactory emf;
    private static EntityManager entityManager;
    private static DataBase bd;

    private DataBase() {
        setEmf(Persistence.createEntityManagerFactory("TCC_UNIT"));
        setEntityManager(emf.createEntityManager());
    }

    public static DataBase getInstance() {
        if (bd == null) {
            bd = new DataBase();
        }
        return bd;
    }
    public static void killInstance() {
        bd = null;
    }

    public EntityManager getEntityManager() {
        if(entityManager != null)
        {
            if(!(entityManager).isOpen())
                entityManager = getEmf().createEntityManager();
        }
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

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        DataBase.emf = emf;
    }
}
