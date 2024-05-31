
package com.mycompany.contracts;
import com.mycompany.contracts.PI.Human;
/**
 *
 * @author SCIS2-13
 */
public class Contracts {

    public static void main(String[] args) {
        Human humano = new Human((int) 1.65, "Pepe");
        
        humano.walk();
        humano.run();
        humano.fly();
        humano.crawl();
        
    }
}
