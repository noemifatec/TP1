/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author fatec-dsm2
 */
/*public class poo {
    public static void main(String[]args){
       Pessoa pessoa1= new Pessoa( "No", 60);
       
   //       Pessoa pessoa1= new Pessoa("noemi@email",60,"Rua 10"); 
          pessoa1.falar();
          System.out.println("Olá meu nome eh"+ pessoa1.getNome()+"e tenho" + pessoa1.getIdade());
    }
    
}*/

public class Pessoa {
private String nome;
private String email;
private int idade;

private Pessoa(Builder builder){
    this.nome=builder.nome;
    this.email=builder.email;
    this.idade=builder.idade;
    
}
''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
public Builder nome(String nome){
    this.nome=nome;
    return this;
    ''
public Builder email(String email){
    this.email=email;
    return email;
    
}
}
