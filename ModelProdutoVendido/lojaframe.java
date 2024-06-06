package view;

import java.swing;
import model aluno;

public class LojaFrame extends JFrame{

    private JButton FecharCaixaButton;
    private JButton ListarProdutosButton;
    private JButton NovoProdutoButton;
    private JButton NovaVendaButton;
    private Controlador Controlador;

    public JButton getFecharCaixaButton(){
        return FecharCaixaButton;
    }
    public void FecharCaixaButton(JButton FecharCaixaButton){
        this.FecharCaixaButton =FecharCaixaButton;
    }
    public JButton getListarAlunosButton(){
        return ListarProdutosButton;
    }
    public void setListarAlunosButton(JButton ListarProdutosButton){
        this.ListarProdutosButton =ListarProdutosButton;
    }
    public JButton getNovoProdutoButton(){
        return NovoProdutoButton;
    }
    public void setNovoProdutoButton(JButton NovoProdutoButton){
        this.NovoProdutoButton =NovoProdutoButton
    }
    public JButton getNovaVendaButton(){
        return NovaVendaButton;
    }
    public void setNovaVendaButton(JButton NovaVendaButton){
        this.NovaVendaButton =NovaVendaButton
    }
    public Controlador getControlador(){
        return controlador;
    }
    public void setControlador(Controlador contralador){
        this.controlador =controlador;
    }
    public static void main (Strings []args){

    }
    private void NovoProdutoActionPerfomed(java.awt.event.ActionEvent evt){

    }
    private void ListarProdutoActionperfomed(java.awt.event.ActionEvent evt){
        
    }


















}
