/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise95;

/**
 *
 * @author julia
 */
public class Exercise95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Money a = new Money(3,00);
        Money b = new Money(3,00);
        
        a=a.minus(b);
        
        System.out.println(a);

    }

}
