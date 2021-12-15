package com.example.helloworld;

public class funcionario extends pessoa {
    private int PIS;
    private int salario;

    public funcionario(int i, String n, char s, int p, int salario) {
        super(i, n, s);
        PIS = p;
        this.salario = salario;

    }

    public void mostrarFuncionario(){

        System.out.print("Idade: " + idade + "\n" + "Nome: " +nome +"\n" + "Sexo: " + sexo + "\n" + "PIS: " + PIS +"\n"+ "Salário: R$"+ salario +"\n\n\n");

    }

    @Override
    public void mostrarPessoa(){
        mostrarFuncionario();
    }
}
