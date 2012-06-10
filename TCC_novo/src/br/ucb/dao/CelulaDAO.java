/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.dao;

import br.ucb.beans.Celula;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;


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
        em.close();
    }

    public static boolean excluiCelula(Celula celula) {
        boolean retorno = false;
        EntityManager em = DataBase.getInstance().getEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(em.getReference(Celula.class, celula.getIdCelula()));
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Célula deletado com sucesso!");
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return retorno;
    }

    public static void alteraCelula(){
        
    }

    public static List<Celula> findAll(){
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT c FROM Celula c");
        List<Celula> celulas = null;
        try {
            celulas = (List<Celula>) query.getResultList();
            return celulas;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "É preciso cadastrar célula","Warning",JOptionPane.WARNING_MESSAGE);
        }
        return celulas;
        
    }
}
