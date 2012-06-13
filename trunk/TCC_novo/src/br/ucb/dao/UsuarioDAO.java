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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author GUICUNHA
 */
public class UsuarioDAO {

    static Logger logger = LoggerFactory.getLogger(UsuarioDAO.class);

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
        logger.info("Inserindo usuário: " + "Nome: " + usuario.getNome() + "Login: " + usuario.getLogin());
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }

    public static List<Usuario> findAll() {

        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT c FROM Usuario c");
        List<Usuario> lista = null;
        try {
            lista = (List<Usuario>) query.getResultList();
            return lista;
        } catch (javax.persistence.NoResultException e) {
            JOptionPane.showMessageDialog(null, "Não há usuários cadastrados!", "Warning", JOptionPane.WARNING_MESSAGE);
            logger.error("Não há usuários cadastrados!");
        }
        return lista;
    }

    public static boolean excluiUsuario(Usuario usuario) {
        boolean retorno = false;
        EntityManager em = DataBase.getInstance().getEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(em.getReference(Usuario.class, usuario.getIdUsuario()));
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return retorno;
    }

    public static void alteraUsuario(Usuario usuario) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public static Usuario buscaUsuario(String login, String senha) {
        logger.info("Buscando por: " + login);
        EntityManager em = DataBase.getInstance().getEntityManager();
        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try {
            Usuario user = (Usuario) query.getSingleResult();
            logger.info("Usuário encontrado com login: " + login);
            return user;
        } catch (javax.persistence.NoResultException e) {
            logger.error("Usuário não encontrado!");
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
