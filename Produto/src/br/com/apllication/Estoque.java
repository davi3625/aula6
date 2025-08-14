package br.com.apllication;

import br.com.entities.Product;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println(" Entre com dados de um produto ");
        System.out.print(" Nome: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque");
        product.quantity = sc.nextLine();

        System.out.println("Informações do Produto  "  + product);

        System.out.println();
        System.out.println("entre com o numero de produto");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("estoque Atual" + product);












    }



















}
