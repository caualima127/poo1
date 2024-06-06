package model;

public class produto{
    private String Nome;
    private Double Preço;
}
public String getNome(){
    return Nome;
}
public void setNome(String nome) {
    this.Nome = nome;
}
public Double getPreço(){
    return Preço
}
public void setPreço(Double Preço){
    this.Preço = Preço;
}
@Override
public String toString(){
    return "produto{" +
            "nome='" + Nome + '\'' +
            ", Preço=" + Preço + 
            '}';
}