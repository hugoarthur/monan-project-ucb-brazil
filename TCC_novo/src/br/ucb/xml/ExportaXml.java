/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucb.xml;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author GUICUNHA
 */
public class ExportaXml {
   public static void exportar(){
          FileOutputStream saida;
          PrintStream fileSaida;
          try
          {
               saida = new FileOutputStream("xml/arquivo1.xml");
               fileSaida = new PrintStream(saida);
               fileSaida.print("testando um FileOutputStream");
          }
          catch (Exception e)
          {
               System.err.println(e);
          }
   }
}
