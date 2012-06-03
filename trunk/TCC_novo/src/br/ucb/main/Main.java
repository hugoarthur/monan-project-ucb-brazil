/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.main;

import br.ucb.gui.TelaLogin;
/**
 *
 * @author GUICUNHA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        CriaPastas criaPastas = new CriaPastas();
        criaPastas.verificaDir();
    }
}
