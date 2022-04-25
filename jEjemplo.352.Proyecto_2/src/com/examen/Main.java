package com.examen;

public class Main {

    public static void main(String[] args) {
        Fatura F = new Fatura();

        F.setNumero(1);
        F.setDescricao("Producto X");
        F.setQuantidade(10);
        F.setPreco(5.75);

        System.out.println("      :: Fatura");
        System.out.println("      :: Numero: \t\t" + F.getNumero());
        System.out.println("      :: Descricao: \t" + F.getDescricao());
        System.out.println("      :: Quantidade: \t" +  F.getQuantidade());
        System.out.printf("      :: Preco: \t\t%.1f\n", F.getPreco());
        System.out.printf("      :: Total: \t\t%.1f\n", F.getTotalFatura());

    }
}
