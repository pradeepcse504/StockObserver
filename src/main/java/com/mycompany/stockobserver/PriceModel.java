
package com.mycompany.stockobserver;

/**
 *
 * @author Pradeep
 */
import java.util.ArrayList;
import java.util.List;

public class PriceModel {
    private List<Observer> observers = new ArrayList<Observer>();
    private float price;
    
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
        notifyAllObservers();
    }
    public void register(Observer observer){
        if(observer == null ) throw new NullPointerException("Null Observer");
        
        if(!observers.contains(observer)) observers.add(observer);
    }
    public void unregister(Observer observer){
    	if(observers.contains(observer)) observers.remove(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
