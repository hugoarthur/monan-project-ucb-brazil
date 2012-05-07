/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.dao;

import br.ucb.beans.Celula;
import javax.persistence.EntityManager;


/**
 *
 * @author GUICUNHA
 */
public class CelulaDAO {


    public CelulaDAO(){
        
    }

    public static void insereCelula(Celula celula) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        em.persist(celula);
        em.getTransaction().commit();
        //em.close();
    }

    public static void excluiCelula(){
        
    }

    public static void alteraCelula(){
        
    }

    public static void buscaCelula(){
        
    }
}
