/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budega;

/**
 *
 * @author Rodrigo
 */
public class Budega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //cria um objeto rodrigo do tipo pessoa
        Pessoa rodrigo = new Pessoa("Rodrigo", "Branco", 27);
        Pessoa cloneRodrigo = new Pessoa(rodrigo.nome,rodrigo.corCabelo,rodrigo.idade);
        
        
        
        System.out.println("sua idade é de "+rodrigo.idade+" anos.");
        rodrigo.Aniversario();
        System.out.println("Agora a idade do rodrigo é "+rodrigo.idade);
        System.out.println ("A idade do clone é  "+cloneRodrigo.idade);
        System.out.println ("A idade do cl é  "+cloneRodrigo.idade);
        System.out.println ("Teucúúú");
        
    }

    
}
