package br.ucb.xml;


import br.ucb.service.Sessao;
import java.io.*;

public class ExportaXml {

    private String caminho;
    
    public static void exportar() {
        String nome = (Sessao.getInstance().getProjeto().getNomeProjeto() + ".xml");
        // arquivo a ser movido
        File arquivo = new File("./xml/"+nome);

        // diretorio de destino
        File dir = new File("/Users/guilherme/Desktop");

        // move o arquivo para o novo diretorio
        boolean ok = arquivo.renameTo(new File(dir, arquivo.getName()));
        if (ok) {
            System.out.println("Arquivo foi movido com sucesso");
        } else {
            System.out.println("Nao foi possivel mover o arquivo");
        }
    }
    
    public String getCaminho() {
        return caminho;
    }
    
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

}
