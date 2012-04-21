/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author GUICUNHA
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }

    public static void insereUsuario(Usuario usuario) {
        EntityManager em = DataBase.getInstance().getEntityManager();

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public static void excluiUsuario() {
    }

    public static void alteraUsuario() {
    }

    public static Usuario buscaUsuario(String login, String senha) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        Usuario user = (Usuario) query.getSingleResult();
        em.close();
        return user;
    }
}
