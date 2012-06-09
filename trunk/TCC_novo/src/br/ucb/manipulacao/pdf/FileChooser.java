package br.ucb.manipulacao.pdf;

import br.ucb.service.Sessao;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooser {

    public String caminho() {
        
        String caminhoArquivo = "";        
        JFileChooser arquivo = new JFileChooser();
        
        arquivo.setFileFilter(new ExtensionFileFilter("Arquivos PDF", "pdf"));
        
        int retorno = arquivo.showOpenDialog(null);
        
        if (retorno == JFileChooser.APPROVE_OPTION) {
            
            caminhoArquivo = arquivo.getSelectedFile().getAbsolutePath();
            Sessao.getInstance().setNomeArquivoAtual(arquivo.getSelectedFile().getName());
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum Arquivo PDF.");
            caminhoArquivo = "";
            
        }
        
        return caminhoArquivo;
        
    }
}
