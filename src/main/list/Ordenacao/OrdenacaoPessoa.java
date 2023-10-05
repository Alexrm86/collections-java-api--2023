package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome,int idade, double alura){
        pessoaList.add(new Pessoa(nome,idade,alura));
    }
}
