/*
 * 
 */
package br.ucb.gui;

import br.ucb.gui.ActionListeners.SimpleTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Osmar jr
 */
public class JanelaTeste {

    private JScrollPane scrolCampo;
    private JTable tabela;
    private JFrame frame = new JFrame();
    private JPanel panelBotao = new JPanel(new BorderLayout());
    private JPanel panel = new JPanel(new BorderLayout());
    private JButton botao = new JButton("Registrar Relatório de Acompanhamento");
    private BorderLayout layout = new BorderLayout();

    public JanelaTeste() {

        setaTable();

        JTableHeader header = tabela.getTableHeader();
        this.scrolCampo = new JScrollPane(tabela);

        panelBotao.add(botao, BorderLayout.EAST);
        panel.add(panelBotao, BorderLayout.NORTH);
        panel.add(scrolCampo);

        frame.add(panel);
        frame.setSize(700, 200);
        frame.setVisible(true);

        botao.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);

            }
        });

    }

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {
        TelaRelatorio telaR = new TelaRelatorio();
        telaR.setVisible(true);
        frame.dispose();
    }

    private void setaTable() {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"coluna1", "coluna2", "coluna3", "coluna4"};

        dados.add(new String[]{"linha 1-1", "linha 1-2", "linha 1-3", "linha 1-4"});
        dados.add(new String[]{"linha 2-1", "linha 2-2", "linha 2-3", "linha 2-4"});

        SimpleTableModel modelo = new SimpleTableModel(dados, colunas);
        this.tabela = new JTable(modelo);

    }
}
