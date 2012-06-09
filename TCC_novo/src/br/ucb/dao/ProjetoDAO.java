/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.dao;

import br.ucb.beans.Projeto;
import br.ucb.service.Sessao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        logger.info("Cadastrando projeto: " + projeto.getNomeProjeto());
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

    public static void adicionaArquivoXML(String caminho) {
        try {
            File file = new File(caminho);
            FileReader fr = new FileReader(file);
            BufferedReader leitor = new BufferedReader(fr);
            String linha = null;
            while ((leitor.readLine()) != null) {
                System.out.println(leitor.readLine());
                //linha.append(leitor.readLine());
            }
            Sessao.getInstance().getProjeto().setArquivoXml(linha.toString());
            updateArquivoXml(Sessao.getInstance().getProjeto());
            leitor.close();
        } catch (IOException e) {
        }
    }

    public static void updateArquivoXml(Projeto projeto) {
        EntityManager em = DataBase.getInstance().getEntityManager();
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        em.merge(projeto);
        em.getTransaction().commit();
        em.close();
    }
}
