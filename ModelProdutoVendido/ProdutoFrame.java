package view;

import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import model.Aluno

public class ProdutoFrame extends JFrame{
private JTextField nomeTextField;
private JTextField PreçoTextField;
private JButton okButton;
private JButton cancelarButton;
private Controlador controlador;
private Produto produto;

public ProdutoFrame(){
    initComponents():
}

private void initComponents(){
    nomeTextField = new JTextField();
    PreçoTextField = new JTextField();
    okButton = new JButton();
    cancelarButton = new JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    okButton.setText("ok");
    okButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt){
            okButtonActionPerformed(evt);   
        }
    });

    cancelarButton.setText("cancelar");
    cancelarButton.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt){
            cancelarButtonActionPerformed(evt);
       }
    });
    }
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    private void carregarDados(){
    }
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt){
    }


}
































}