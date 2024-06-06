package model;

public class Aluno{
    private Produto produto;
    private Int quantidade;
    private Double preço;
    private Double subtotal;
}
public Produto getproduto(){
    return produto;
}
public void setproduto(Produto produto){
    this.produto = produto;
}
public Int getquantidade(){
    return quantidade;
}
public void setquantidade(Int quantidade){
    this.quantidade = quantidade;
}
public Double getpreço(){
    return quantidade;
}
public void setpreço(Double preço){
    this.preço = preço;
}
public Double getsubtotal(){
    return subtotal;
}
public void setsubtotal(Double subtotal){
    this.subtotal = subtotal;
}
@Override
public String toString(){
    return "Aluno{" +
            "produto='" + produto + '\'' +
            "quantidade='" + quantidade + '\'' +
            "preço='" + preço + '\'' +
            ",subtotal=" + subtotal +
            '}';
}






















}