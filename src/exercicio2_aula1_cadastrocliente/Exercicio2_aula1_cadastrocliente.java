/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2_aula1_cadastrocliente;

import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
//import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)


/**
 *
 * @author matheus
 */
public class Exercicio2_aula1_cadastrocliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = in.nextLine();
        System.out.print("Digite a idade: ");
        int x = in.nextInt();
        in.nextLine();
        System.out.print("Digite o email: ");
        String email = in.nextLine();
        
        System.out.println("\n======= USUARIO CADASTRADO COM SUCESSO =======");
        System.out.println("");
        System.out.println("O nome do cliente e: " + nome);
        System.out.println("A idade e: " + x);
        System.out.println("O email do cliente e: " + email);
        System.out.println("================================================");
    }
    
}
