    package view;

import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ListarProdutos extends JFrame{
        private JTextField nomTextField;
        private JButton okbutton;
        private JButton cancelarButton;
        private JButton novoprodutobutton;
        private List intemlist;
        private Venda venda;
        private Controlador controlador;
        private Double novavenda;
    
        public ProdutoFrame(){
            initComponents():
        }
        
        private void initComponents(){
            nomTextField = new JTextField();
            okbutton = new JButton();
            cancelarButton = new JButton();
            novoprodutobutton = new JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            okbutton.setText("ok");
            okbutton.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.ActionEvent evt){
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
    private void NovoProdutoActionPerfomed(java.awt.event.ActionEvent evt){
    }
    private void carregarDados(){
    }
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt){
    }
}










































    }