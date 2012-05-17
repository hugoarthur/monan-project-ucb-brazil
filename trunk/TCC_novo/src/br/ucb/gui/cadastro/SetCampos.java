/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.cadastro;

import br.ucb.beans.Celula;
import br.ucb.beans.Usuario;
import br.ucb.dao.CelulaDAO;
import br.ucb.dao.UsuarioDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Osmar jr
 */
public class SetCampos {

    public DefaultListModel listModel() {

        UsuarioDAO usuDAO = new UsuarioDAO();
        DefaultListModel listModel = new DefaultListModel();
        if (usuDAO.findAll() != null) {
            for (Usuario usuario : usuDAO.findAll()) {
                listModel.addElement(usuario.getNome());
            }
        } else {
            listModel.addElement("vazio");
        }
        return listModel;

    }

    public DefaultComboBoxModel comboModel() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        if (CelulaDAO.findAll() != null) {
            for (Celula celula : CelulaDAO.findAll()) {
                comboModel.addElement(celula.getTxt_celula());
            }
        } else {
            comboModel.addElement("vazio");
        }
        return comboModel;
    }
}
