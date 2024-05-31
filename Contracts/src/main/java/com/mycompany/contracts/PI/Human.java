
package com.mycompany.contracts.PI;


public class Human extends Being implements UI,Fly {
    private int height;
    private String name;
    //Vamos a colocar caracteristicas de ser vivo al humano como caminar

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    
    
    
    @Override
    public void walk(){
        System.out.println("Estyo caminando erguido");
    }
    
    @Override
    public void run(){
        System.out.println("Estoy corriendo como Naruto");
    }
    
    @Override
    public void fly(){
        System.out.println("Estoy volando!!");
       
    }
    @Override
    public void crawl(){
        System.out.println("Estoy gateando");
    
    }
}
