/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Luis Guilherme
 */
public class Jogador {
    String nome;
    int idade;
    int palpite;
    
    void darpalpite(){
        palpite = (int)(Math.random()*10);
    }
}