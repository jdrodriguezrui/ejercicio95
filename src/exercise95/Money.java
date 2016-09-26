/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise95;


public class Money {
    private final int euros;
    private final int cents;
    
    public Money(int euros, int cents)
    {
        if(cents>99)
        {
            euros += cents/100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }
    
    public int euros()
    {
        return euros;
    }
    public int cents()
    {
        return cents;
    }
    
    public String toString()
    {
        String zero = "";
        if(cents<10)
        {
            zero = "0";
        }
        return euros + "."+zero+cents+" euros";
    }

    public Money plus(Money added)
    {
        return new Money(this.euros + added.euros(),this.cents + added.cents());
    }
            
    public boolean less(Money compared)
    {
        if(this.euros==compared.euros())
        {
           return this.cents<compared.cents(); 
        }
        else
        {
            return this.euros<compared.euros();
        }
    }
    
    public Money minus(Money decremented)
    {        
        if(this.less(decremented))
        {
            return new Money(0,0);
        }
        
        if(this.cents < decremented.cents())
        {
            return new Money(this.euros - decremented.euros()-1,100+(this.cents-decremented.cents()));
        }
        else
        {
            return new Money(this.euros - decremented.euros(),this.cents - decremented.cents());
        }
    }
}
