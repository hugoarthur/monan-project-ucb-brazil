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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.jdom2.Element;

/**
 *
 * @author Osmar jr
 */
public class ConfiguraCampos {

    List<Usuario> usuarios = UsuarioDAO.findAll();
    List<Celula> celulas = CelulaDAO.findAll();

    // Lista de Usuário de Cadas Projeto
    public DefaultListModel listModel() {
        DefaultListModel listModel = new DefaultListModel();
        if (usuarios != null) {
            for (Usuario usuario : usuarios) {
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

    //Lista de Todos os Usuários do Projeto.
    public DefaultListModel listaUser() {
        DefaultListModel listModel = new DefaultListModel();
        if (usuarios != null) {
            for (Usuario usuario : usuarios) {
                listModel.addElement(usuario);
            }
        } else {
            listModel.addElement("Vazio");
        }
        return listModel;
    }

    //Lista as Células na Combobox da TelaInicial.
    public DefaultComboBoxModel comboModel() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        List<Celula> celulasCombo = CelulaDAO.findAll();
        if (celulasCombo != null) {
            for (Celula celula : celulasCombo) {
                comboModel.addElement(celula.getTxt_celula());
            }
        } else {
            comboModel.addElement("vazio");
        }
        return comboModel;
    }

    //Lista de todas as Células do projeto.
    public DefaultListModel listModelCel() {
        DefaultListModel listModel = new DefaultListModel();
        if (celulas != null) {
            for (Celula celula : celulas) {
                listModel.addElement(celula.getTxt_celula());
            }
        } else {
            listModel.addElement("Vazio");
        }
        return listModel;
    }

    //Lista dos Elementos do XML
    public List<Element> listaElemento() {
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

    //Adiciona as linhas na Tabela da TelaAcompanhamento
    public ArrayList linhaTable() {
        ArrayList dados = new ArrayList();
        int aux;
        if (listaElemento() != null) {
            if (celulas != null) {
                for (Celula celula : celulas) {
                    aux = 0;
                    for (Element e : listaElemento()) {
                        if (celula.getTxt_celula().equalsIgnoreCase(e.getChildText("celula"))) {
                            aux = 1;
                            dados.add(new String[]{e.getChildText("dissertacao"), celula.getTxt_celula(), "X", "", "Em Adamento"});
                        }
                    }
                    if (aux != 1) {
                        dados.add(new String[]{"", celula.getTxt_celula(), "", "X", ""});
                    }
                }
            } else {
                dados = linhaTableDefault();
            }
        } else {
            dados = linhaTableDefault();
        }
        return dados;

    }

    //Linha Default da tabela da TelaAcompanhamento.
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

    // Adiciona as Dissertaçoes Utilizadas na Jlist da TelaInicio.
    public DefaultListModel listaPdf() {
        DefaultListModel listModel = new DefaultListModel();
        List<String> lista = new ArrayList<String>();
        if (listaElemento() != null) {
            for (Element e : listaElemento()) {
                lista.add(e.getChildText("dissertacao"));
            }
            Set<String> temp = new HashSet<String>(lista);
            lista = new ArrayList<String>(temp);
            for (String str : lista) {
                listModel.addElement(str);
            }
        } else {
            listModel.addElement("");
        }
        return listModel;
    }
}
