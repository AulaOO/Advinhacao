/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Scanner ler = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro");
        valor = ler.nextInt();
        jogo.jogar(valor);
    }
}
