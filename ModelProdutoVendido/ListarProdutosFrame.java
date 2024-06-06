package view;

import java.swing.*;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Controlador;

public class ListarProdutosFrame extends JFrame{
    private JMenuItem PreçoMenuItem;
    private JMenuItem NomeMenuItem;
    private JMenuItem EditarMenuItem;
    private JMenuItem NovoProdutoMenuItem;
    private JList<String> produtolist;
    private Controlador controlador;

    public ListarProdutosFrame(){
        initComponents();
    }
    private void initComponents(){
        PreçoMenuItem = new JMenuItem("Preço");
        PreçoMenuItem.addActionListener(this::PreçoMenuItem);

        NomeMenuItem = new JMenuItem("Menu");
        NomeMenuItem.addActionListener(this::NomeMenuItem);

        EditarMenuItem = new JMenuItem("EditarMenu");
        EditarMenuItem.addActionListener(this::EditarMenuItem);

        NovoProdutoMenuItem = new JMenuItem("NovoProduto");
        NovoProdutoMenuItem.addActionListener(this::NovoProdutoMenuItem);

        JMenuBar menu = new JMenu("Opçoes");
        menu.add(PreçoMenuItem);
        menu.add(NomeMenuItem);
        menu.add(EditarMenuItem);
        menu.add(NovoProdutoMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        setJMenuBar(menuBar);
    }
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    private void MontarJanela(){
    }
    private void EditarProdutosMenuItemActionPerfomed(){
    }
    public void refresh(){
    }
    

}