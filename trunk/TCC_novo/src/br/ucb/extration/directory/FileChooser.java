package br.ucb.extration.directory;


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooser {
        public String caminho (){
            
            String caminhoArquivo = "";
            JFileChooser arquivo = new JFileChooser();
            int retorno = arquivo.showOpenDialog(null);
            if(retorno == JFileChooser.APPROVE_OPTION){
                caminhoArquivo = arquivo.getSelectedFile().getAbsolutePath();
            }else{
                JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum diretorio."); 
            }
                return caminhoArquivo;     
        }
}