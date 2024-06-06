    package view;

import java.awt.Event;
import java.awt.TextField;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.aluno

public class vendaframe extends JFrame{
    private TexteField totaltextefield;
    private JButton okbutton;
    private JButton cancelarbButton;
    private JButton novoprodButton;
    private List itenliste;
    private Venda venda;
    private Controlador controlador;
    private Boolean novavenda;

    public vendaframe(){
        initComponents():
    }
    
    private void initComponents(){
        totaltextefield = new TextField();
        okbutton = new JButton();
        cancelarbButton = new JButton();
        novoprodButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        okbutton.setText("ok");
        okbutton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.Actionevent evt){
                okButtonActionPerformed(evt):
            }
        });
        
        cancelarbButton.setText("cancelar");
        cancelarbutton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                cancelarbButtonActionPerfomed(evt);
            }
        });
        }
        public void setControlador(controlador controlador){
            this.controlador = controlador;
        }
        private void okButtonActionPerformed(java.awt.event.ActionEvent evt){

        }
        private NovoProdutoActionPerfomed(java.awt.event.ActionEvent evt){

        }
        private void carregarDados(){
            
        }
    }







}