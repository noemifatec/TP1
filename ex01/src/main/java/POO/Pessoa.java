package POO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatec-dsm2
 */
/*public class Pessoa {
    //Atributos
    private String nome;
    int idade;
    private String email;
    String endereco;
    
    //Construtor
    public Pessoa(int idade){
        this.idade=idade;
    }
    
    //public Pessoa(String nome){
     //   this.nome=nome;
    //}
    
     public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        //this.endereco = endereco;
    }
     
     public String getNome(){
        return this.nome;
     }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
     public int getIdade(){
        return this.idade;
     }
    
    public void setIdade(int novoIdade){
        this.idade = novoIdade;
    }
    
    
    public void falar(){
        System.out.println("Ola, meu nome e "+this.nome +" e tenho"+this.idade );
        
    }
}*/

public class Pessoa {
private String nome;
private in idade;

public static class Builder {
    private String nome;
    private String email;
    private int idade;
    
    public Builder nome(String nome){
        this.nome = nome;
        return this;
        
    }
     public Builder email(String email){
        this.email = email;
        return this;
        
    }
     public Builder email(int idade){
        this.idade = idade;
        return this;
        
    }
    }
}



}