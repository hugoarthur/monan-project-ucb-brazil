/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Celula;
import br.ucb.beans.Projeto;
import br.ucb.beans.Usuario;
import br.ucb.dao.CelulaDAO;
import br.ucb.dao.UsuarioDAO;
import br.ucb.service.Sessao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Osmar jr
 */
public class ConfiguraCampos {

    public DefaultListModel listModel() {

        DefaultListModel listModel = new DefaultListModel();

        if (UsuarioDAO.findAll() != null) {

            for (Usuario usuario : UsuarioDAO.findAll()) {

                if (usuario.getTipoUsuario() == 1) {

                    List<Projeto> list = usuario.getProjetos();

                    for (Projeto proj : list) {

                        if (proj.getIdProjeto() == Sessao.getInstance().getProjeto().getIdProjeto()) {

                            listModel.addElement(usuario.getNome());

                        }
                    }

                }
            }
        } else {
            listModel.addElement("vazio");
        }

        return listModel;
    }

    public DefaultListModel listaUser() {

        DefaultListModel listModel = new DefaultListModel();

        if (UsuarioDAO.findAll() != null) {

            for (Usuario usuario : UsuarioDAO.findAll()) {
                listModel.addElement(usuario.getNome());
            }

        } else {
            listModel.addElement("Vazio");
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

    public DefaultListModel listModelCel() {

        DefaultListModel listModel = new DefaultListModel();

        if (CelulaDAO.findAll() != null) {
            for (Celula celula : CelulaDAO.findAll()) {
                listModel.addElement(celula.getTxt_celula());
            }
        } else {
            listModel.addElement("vazio");
        }

        return listModel;

    }

    public DefaultListModel listNomePdf() {
        DefaultListModel listModel = new DefaultListModel();
        return listModel;
    }
}
