/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Situacao;
import javax.persistence.Query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniele
 */
public class SituacaoDAO {

    public SituacaoDAO() {
    }

    public static void insereSitucao(Situacao situacao) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.persist(situacao);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Situacao> findAll(){
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT c FROM Situacao c");
        List<Situacao> situacao = null;
        try {
            situacao = (List<Situacao>) query.getResultList();
            return situacao;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "É preciso cadastrar situacao","Warning",JOptionPane.WARNING_MESSAGE);
        }
        return situacao;
        
    }
    public static void alteraSituacao(Situacao situacao) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.merge(situacao);
        em.getTransaction().commit();
        em.close();
    }
}
