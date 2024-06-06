package model

public class produtosvendido{
    private Produto produto;
    private Int quantidade;
    private Double preço;
    private Double subtotal;
}
public Produto getprofProduto(){
    return produto;
}
public void setproduto(Produto produto){
    this.produto = produto;
}
public int getquantidade(){
    return quantidade;
}
public void setquantidade(Int quantidade){
    this.quantidade = quantidade;
}
public double getpreço(){
    return preço;
}
public void setquantidade(Double quantidade){
    this.quantidade = quantidade;
}
public Double getsubtotal(){
    return subtotal;
}
    public void setsubtotal(Double subtotal){
        this.subtotal = subtotal;
}
@Override
public String tostring(){
    return "produtos{" + 
            "quantidade='" + quantidade + '\'' +
            "preço='" + preço + '\'' +
            ",subtotal=" + subtotal +
            '}';