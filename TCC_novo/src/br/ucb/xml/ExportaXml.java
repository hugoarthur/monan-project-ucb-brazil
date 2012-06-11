package br.ucb.xml;

import br.ucb.service.Sessao;
import java.io.*;
import java.nio.channels.FileChannel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ExportaXml {

    private String caminho;

    public static void exportar() throws FileNotFoundException, IOException {
        JFileChooser fc = new JFileChooser();

        // restringe a amostra apenas diretorios  
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File diretorio = fc.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Arquivo exporta com sucesso para pasta: " + diretorio.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Arquivo não exportado.");
        }
        String nome = (Sessao.getInstance().getProjeto().getNomeProjeto() + ".xml");
        File source = new File("./xml/" + nome);
        File destination = new File(fc.getSelectedFile() + "/" + nome);
        if (destination.exists()) {
            destination.delete();
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
