/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Acompanhamento;
import javax.persistence.Query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author uc07053438
 */
public class AcompanhamentoDAO {

    public AcompanhamentoDAO(){
        
    }
    
    public static void insereAcompanhamento(Acompanhamento acompanhamento) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.persist(acompanhamento);
        em.getTransaction().commit();
        em.close();
    }

    public static List<Acompanhamento> findAll() {
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT c FROM Acompanhamento c");
        List<Acompanhamento> celulas = null;
        try {
            celulas = (List<Acompanhamento>) query.getResultList();
            return celulas;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "É preciso cadastrar célula", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return celulas;

    }
}
