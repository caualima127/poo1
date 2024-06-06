package model;

public class produto{
    private String nome;
    private Double preço;
}
public String getnome(){
    return nome;
}
public void setnome(String nome)[
    this.nome = nome;
]
private Double getpreço(){
    return preço;
}
private void setpreço(Double preço){
    this.preço = preço;
}
@Override
public String toString(){
    return "produto{" + 
            "nome='" + nome + '\'' +
            ", preço=" + preço +
            ',';
}