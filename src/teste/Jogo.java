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
public class Jogo {
    Jogador jogue1;
    Jogador jogue2;
    Jogador jogue3;
    Jogador vencedor;
    
    void inicializar(){
        jogue1 = new Jogador();
        jogue1.nome = "Pedro";
        jogue1.idade = 12;
        jogue1.darpalpite();
        jogue2 = new Jogador();
        jogue2.nome = "Ana";
        jogue2.idade = 24;
        jogue2.darpalpite();
        jogue3 = new Jogador();
        jogue3.nome = "Flavio";
        jogue3.idade = 33;
        jogue3.darpalpite();
    }
    
    void imprimeEstado(){
        System.out.println("\nInformações do jogador 1:");
        System.out.println("Nome: " + jogue1.nome + "\nIdade: " + jogue1.idade + "\nPalpite: " + jogue1.palpite);
        System.out.println("\nInformações do jogador 2:");
        System.out.println("Nome: " + jogue2.nome + "\nIdade: " + jogue2.idade + "\nPalpite: " + jogue2.palpite);
        System.out.println("\nInformações do jogador 3:");
        System.out.println("Nome: " + jogue3.nome + "\nIdade: " + jogue3.idade + "\nPalpite: " + jogue3.palpite);
    }
    
    void quemGanhou(int valor){
        vencedor = new Jogador();
        if(jogue1.palpite == valor){
            vencedor = jogue1;
        }
        else if(jogue2.palpite == valor){
            vencedor = jogue2;
        }
        else if(jogue3.palpite == valor){
            vencedor = jogue3;
        }
        else{
            vencedor = null;
        }
    }
    
    void imprimiGanhador(){
        if(vencedor != null){
            System.out.println("\nO ganhador é: " + vencedor.nome);
        }
        else{
            System.out.println("\nNão houve ganhador");
        }
    }
    
    void jogar(int valor){
        inicializar();
        imprimeEstado();
        quemGanhou(valor);
        imprimiGanhador();        
    }
}
