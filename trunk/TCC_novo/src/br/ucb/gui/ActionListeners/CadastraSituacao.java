/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.gui.ActionListeners;

import br.ucb.beans.Situacao;
import br.ucb.service.Sessao;
import br.ucb.dao.SituacaoDAO;
import java.util.List;

/**
 *
 * @author Daniele
 */
public class CadastraSituacao {
    
    public void isereSituacao(Situacao situacao){
        
        if(!verificaSituacao(situacao)){
            SituacaoDAO.insereSitucao(situacao);
        }else
            SituacaoDAO.alteraSituacao(situacao);
    }
    private boolean verificaSituacao(Situacao situacao){
        List<Situacao> listaSituacao = SituacaoDAO.findAll();
        if(listaSituacao != null){
            return true;
        }
        return false;
    }
}
