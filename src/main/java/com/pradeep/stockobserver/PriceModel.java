
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
import java.util.ArrayList;
import java.util.List;

public class PriceModel implements Subject{
    private List<Observer> observers ;
    private float price;
    
    public PriceModel(){
        observers = new ArrayList<Observer>();
    }
    
    public void register(Observer observer){
        if(observer == null ) throw new NullPointerException("Null Observer");
        
        if(!observers.contains(observer)) 
            observers.add(observer);
    }
    public void unregister(Observer observer){
    	if(observers.contains(observer)) 
            observers.remove(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update(price);
        }
    }  
    public void priceChanged(){
        notifyAllObservers();
    }
    
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
        priceChanged();
    }

}
