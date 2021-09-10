/*
 * Mobile Observer Class
 */
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
public class MobileObserver implements Observer, PrinterDisplay {
    private float price;
    private PriceModel priceModel;
    
    public MobileObserver(PriceModel priceModel){
        this.priceModel = priceModel;
        this.priceModel.register(this);
    }
    
    public void update(float price){
        this.price = price;
        display();
    }
    
    public void display(){
        System.out.println("Mobile Observer price update: $" + priceModel.getPrice());
    }
}
