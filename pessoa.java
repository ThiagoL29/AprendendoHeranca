package com.example.helloworld;

public class pessoa {

    protected int idade;
    protected String nome;
    protected char sexo;

    public pessoa(int i, String n, char s) {
        idade = i;
        nome = n;
        sexo = s;
    }
    
    public void mostrarPessoa() {

        System.out.print("Idade: " + idade + "\n" + "Nome: " +nome +"\n" + "Sexo: " + sexo +"\n\n\n");
    }
    
    public void fazerAniversario(){
        this.idade++;
    }

    public void mudancaDeNome(String n){
        this.nome = n;
    }

    public void novaIdade(int i){
        idade = i;
    }
    
    public void mudancaSexo(char s){
        sexo = s;
    }
}

