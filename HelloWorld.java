package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {

        var p = new pessoa(17, "Thiago", 'M');
        var p2 = new pessoa(17, "Mariana", 'F');
        var p3 = new pessoa(24, "Gabriela", 'F');
        pessoa f = new funcionario(19, "Joãozinho", 'M', 192183812, 2500);
        p.mostrarPessoa();
        p.fazerAniversario();
        p.mostrarPessoa();
        p2.mostrarPessoa();
        p3.mostrarPessoa();
        f.mostrarPessoa();
    }
}
