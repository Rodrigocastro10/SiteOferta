/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//classe que servirá para criar objetos do tipo pessoa
package budega;

/**
 *
 * @author Rodrigo
 */
public class Pessoa {
     String nome;
     String corCabelo;
     int idade;
     
     
     //metodo construtor
     public Pessoa(String novoNome, String novaCorCabelo, int novaIdade){
         this.nome = novoNome;
         this.corCabelo = novaCorCabelo;
         this.idade = novaIdade;
     }
     
     //método que faz o rodrigo upar de idade
     public void Aniversario(){
        this.idade = idade+1;
     }
}
