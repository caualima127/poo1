package model;

public class Produto{
    private String nome;
    private double preço;
    public Aluno(String nome, double preço){
        this.nome= nome;
        this.preço= preço;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreço(){
        return nota;
    }
    public void setPreço(double preço){
        this.preço = preço;
    }
    @Override
    public String toString(){
        return "Nome{" +       
                "Nome='" + nome + '\''+
                ",preço=" + preço +
                '}';
    
    
    }


}
