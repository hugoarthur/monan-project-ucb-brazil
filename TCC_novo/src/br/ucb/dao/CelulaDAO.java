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

        em.getTransaction().begin();
        em.persist(celula);
        em.getTransaction().commit();
        em.close();
    }

    public static void excluiCategoria(){
        
    }

    public static void alteraCategoria(){
        
    }

    public static void consultaCategoria(){
        
    }
}
