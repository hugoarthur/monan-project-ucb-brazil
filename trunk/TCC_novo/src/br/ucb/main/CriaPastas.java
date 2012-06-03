/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.main;

import java.io.File;

/**
 *
 * @author Osmar jr
 */
public class CriaPastas {

    private String caminho = "";

    public void verificaDir() {

        this.caminho = "./ArquivosPDF";
        if (!verificaDiretorio(this.caminho)) {
            criaDir(this.caminho);
        }

        this.caminho = "./ArquivosPDF/Universidade Católica de Brasília";
        if (!verificaDiretorio(this.caminho)) {
            criaDir(this.caminho);
        }

        this.caminho = "./ArquivosPDF/Universidade Federal de Santa Catarina";
        if (!verificaDiretorio(this.caminho)) {
            criaDir(this.caminho);
        }

        this.caminho = "./ArquivosPDF/Universidade Federal Fluminense";
        if (!verificaDiretorio(this.caminho)) {
            criaDir(this.caminho);
        }

    }

    private boolean verificaDiretorio(String caminho) {
        File arq = new File(caminho);
        if (arq.exists()) {
            return true;
        }
        return false;
    }

    private void criaDir(String caminho) {
        File dir = new File(caminho);
        if (dir.mkdirs()) {
            System.out.println("Arquivo criado com sucesso!!");
        } else {
            System.out.println("Erro ao criar arquivo");
        }
    }
}
