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
import br.ucb.xml.XmlReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.jdom2.Element;

/**
 *
 * @author Osmar jr
 */
public class ConfiguraCampos {

    // Lista de Usuário de Cadas Projeto
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

    //Lista de Todos os Usuários
    public DefaultListModel listaUser() {

        DefaultListModel listModel = new DefaultListModel();

        if (UsuarioDAO.findAll() != null) {

            for (Usuario usuario : UsuarioDAO.findAll()) {
                listModel.addElement(usuario);
            }

        } else {
            listModel.addElement("Vazio");
        }
        return listModel;
    }

    //Lista de Células da Combobox da TelaInicial
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

    //Lista de todas as Células
    public DefaultListModel listModelCel() {

        DefaultListModel listModel = new DefaultListModel();

        if (CelulaDAO.findAll() != null) {
            for (Celula celula : CelulaDAO.findAll()) {
                listModel.addElement(celula.getTxt_celula());
            }
        } else {
            listModel.addElement("Vazio");
        }

        return listModel;

    }

    //Lista dos Elementos do XML
    private List<Element> listaElemento() {

        XmlReader xmlR = new XmlReader();
        List<Element> listaElemento = new ArrayList<Element>();

        String caminhoArquivo = ("./xml/" + Sessao.getInstance().getProjeto().getNomeProjeto() + ".xml");

        if (verificaArqXML(caminhoArquivo)) {

            listaElemento = xmlR.ListXml(caminhoArquivo);

        } else {

            listaElemento = null;

        }


        return listaElemento;

    }

    //Seta as linhas da Tabela da TelaAcompanhamento
    public ArrayList linhaTable() {

        String status;
        String utilizada;
        String nUtilizada;
        String nomeDissertacao;
        String nomeCelula;

        ArrayList dados = new ArrayList();
        List<Element> listaElemento = new ArrayList<Element>();

        listaElemento = listaElemento();

        if (listaElemento != null) {

            for (Celula celula : CelulaDAO.findAll()) {

                status = "";
                utilizada = "";
                nUtilizada = "";
                nomeDissertacao = "";
                nomeCelula = "";

                for (Element e : listaElemento) {

                    if (celula.getTxt_celula().equals(e.getChildText("celula"))) {

                        nomeDissertacao = e.getChildText("dissertação");
                        nomeCelula = e.getChildText("celula");

                        status = "Andamento";
                        utilizada = "X";

                        dados.add(new String[]{nomeDissertacao, nomeCelula, utilizada, nUtilizada, status});

                    } else {

                        nomeCelula = celula.getTxt_celula();
                        nUtilizada = "X";
                        dados.add(new String[]{nomeDissertacao, nomeCelula, utilizada, nUtilizada, status});

                    }

                }

            }

        } else {

            dados = linhaTableDefault();

        }

        return dados;

    }

    //Linha Default da tabela da TelaAcompanhamento, quando os valores forem nulos
    private ArrayList linhaTableDefault() {

        ArrayList dados = new ArrayList();
        dados.add(new String[]{"", "", "", "", "", ""});
        return dados;
    }

    //Verifica se o arquivo xml existe.
    private boolean verificaArqXML(String caminho) {

        File arq = new File(caminho);
        if (arq.exists()) {
            return true;
        }
        return false;

    }
}
