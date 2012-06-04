package br.ucb.xml;

import java.io.*;

public class ExportaXml{
    public static void exportar(){
        // arquivo a ser movido
        File arquivo = new File("D:\\USERS\\guicunha\\Desktop\\work\\TCC_novo\\trunk\\TCC_novo\\xml\\arquivo1.xml");

        // diretorio de destino
        File dir = new File("D:\\USERS\\guicunha\\Desktop");

        // move o arquivo para o novo diretorio
        boolean ok = arquivo.renameTo(new File(dir, arquivo.getName()));
        if(ok){
            System.out.println("Arquivo foi movido com sucesso");
        }
        else{
            System.out.println("Nao foi possivel mover o arquivo");
        }
    }
}
