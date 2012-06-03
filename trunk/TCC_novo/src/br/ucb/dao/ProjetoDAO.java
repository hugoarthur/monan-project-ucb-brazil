/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Projeto;
import br.ucb.service.Sessao;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author GUICUNHA
 */
public class ProjetoDAO {
    
    static Logger logger = LoggerFactory.getLogger(ProjetoDAO.class);
    
    public ProjetoDAO() {
    }
    
    public static void insereProjeto(Projeto projeto) {
        logger.info("Cadastrando projeto: "+projeto.getNomeProjeto());
        EntityManager em = DataBase.getInstance().getEntityManager();
        
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.persist(projeto);
        em.getTransaction().commit();
        em.close();
    }
    
    public static void excluiProjeto() {
    }
    
    public static void alteraProjeto() {
    }
}
