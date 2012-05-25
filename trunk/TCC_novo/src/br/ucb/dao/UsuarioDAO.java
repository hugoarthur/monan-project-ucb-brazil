/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author GUICUNHA
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }

    public static void insereUsuario(Usuario usuario) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }
    public static List<Usuario> findAll(){
        
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT c FROM Usuario c");
        List<Usuario> lista = null;
        try{
            lista = (List<Usuario>) query.getResultList();
            return lista;
        }catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "vazio","Warning",JOptionPane.WARNING_MESSAGE);
        }
        return lista;
    }
    public static void excluiUsuario() {
    }

    public static void alteraUsuario() {
    }

    public static Usuario buscaUsuario(String login, String senha) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try {
            Usuario user = (Usuario) query.getSingleResult();
            return user;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado","Erro",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
