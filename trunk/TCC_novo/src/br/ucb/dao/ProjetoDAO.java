/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Projeto;
import javax.persistence.EntityManager;

/**
 *
 * @author GUICUNHA
 */
public class ProjetoDAO {

    public ProjetoDAO() {
    }

    private static void insereProjeto(Projeto projeto) {
        EntityManager em = DataBase.getInstance().getEntityManager();

        if(!em.getTransaction().isActive())
            em.getTransaction().begin();
        em.persist(projeto);
        em.getTransaction().commit();
        //em.close();
    }

    private static void excluiProjeto() {
    }

    private static void alteraProjeto() {
    }

    private static void consultaProjeto() {
    }
}