/*
 * 
 */
package br.ucb.gui;

import br.ucb.gui.ActionListeners.ConfiguraCampos;
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
    private ConfiguraCampos confCampos = new ConfiguraCampos();

    public JanelaTeste() {

        setaTable();

        JTableHeader header = tabela.getTableHeader();
        this.scrolCampo = new JScrollPane(tabela);

        panelBotao.add(botao, BorderLayout.EAST);
        panel.add(panelBotao, BorderLayout.NORTH);
        panel.add(scrolCampo);

        frame.add(panel);
        frame.setSize(700, 400);
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
        String[] colunas = new String[]{"Produção Científica", "Celulas", "Utilizada", "Não Utilizada", "Status"};

        dados = linhaTable();

        SimpleTableModel modelo = new SimpleTableModel(dados, colunas);
        this.tabela = new JTable(modelo);

    }

    private ArrayList linhaTable() {

        ArrayList dados = new ArrayList();
        dados = confCampos.linhaTable();
        
        return dados;

    }
}
