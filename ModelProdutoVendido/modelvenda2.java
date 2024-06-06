package model;

public class venda{
    private Int id;
    private ProdutosVendidos produtosvendidos;
    private Double total;
    private Int pos;
}
public Int getid(){
    return id;
}
public void setid(Int id){
    this.id = id;
}
@Override
public String tostring(){
    return "Aluno{" + 
            "id='" + id + '\'' +
            "produtosvendido='" + produtosvendidos + '\'' +
            ",total=" + total +
            '}';
}