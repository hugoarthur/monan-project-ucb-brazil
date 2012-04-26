/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.TipoCelula;
import javax.persistence.EntityManager;

/**
 *
 * @author GUICUNHA
 */
public class TipoCelulaDAO {

    public TipoCelulaDAO() {
    }

    public static void insereTipoCelula(TipoCelula tipo_celula) {
        EntityManager em = DataBase.getInstance().getEntityManager();

        em.getTransaction().begin();
        em.persist(tipo_celula);
        em.getTransaction().commit();
        em.close();
    }
    public static void excluiTipoCelular() {
    }

    public static void alteraTipoCelula() {
    }

    public static void buscaTipoCelular() {
    }
}
