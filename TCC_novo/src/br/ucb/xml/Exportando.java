/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.xml;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author GUICUNHA
 */
public class Exportando
{
   public static void exportado ()
   {
      File dir = new File("D:\\USERS\\guicunha\\Desktop\\work\\TCC_novo\\trunk\\TCC_novo\\xml");
      File fl = new File(dir,"arquivo1.xml");

      try
      {
         if(!fl.exists())
         {

            System.out.println(" ");
            System.out.println("Confirma a criacao do diretorio ?");
                  System.out.println("pressione ENTER");
                  System.in.read(new byte[50]);
                  fl.mkdirs();
                  System.out.println("Diretorio Criado em "+fl.getPath());
             }

             fl.renameTo(new File("C:\\Exercicio_Java\\MeuArquivo"));//aki vc renomiea para outro diretorio
             fl.delete();
             fl = new File("C:\\Exercicio_Java\\MeuArquivo\\CarrosArray.txt");
             fl.createNewFile();
             System.out.println(" ");
             System.out.println("\nNovo Nome :\t"+"  "+fl.getPath());
             System.out.println("Nome do arquivo :"+fl.getName());
             System.out.println("Propriedades de :\t"+fl.getPath());
             System.out.println("Leitura permitida :\t"+fl.canRead());
             System.out.println("Escrita permitida :\t"+fl.canWrite());
             System.out.println("Diretorio ? :\t\t"+fl.isDirectory());
             System.out.println("Arquivo ? :\t\t"+fl.isFile());
          }
      catch(IOException ioex)
      {
      System.out.println("Erro ocorrido !");
      }
   }
}
