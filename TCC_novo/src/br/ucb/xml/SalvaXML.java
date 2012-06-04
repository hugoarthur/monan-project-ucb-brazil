/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.xml;

import br.ucb.service.Sessao;
import javax.swing.JOptionPane;

/**
 *
 * @author Osmar jr
 */
public class SalvaXML {

    public void CriaXML(String nomeCelula, String texto) {

        ImplementaXml xml = new ImplementaXml();
        String usuario = Sessao.getInstance().getUsuario().getIdUsuario().toString();
        String projeto = Sessao.getInstance().getProjeto().getIdProjeto().toString();
        
        if (!"".equals(texto)) {
            xml.escreverXML(usuario, projeto, nomeCelula, texto);
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum texto foi selecionado");
        }
    }
}
