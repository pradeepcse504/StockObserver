/*
 * Observer for Desktop Client
 */
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
public class DesktopObserver implements Observer, PrinterDisplay{
    private PriceModel priceModel;
    private float price;
    
    public DesktopObserver(PriceModel priceModel){
        this.priceModel = priceModel;
        this.priceModel.register(this);
    }

    public void update(float price){
        this.price = price;
        display();
    }
    
    public void display(){
        System.out.println("Desktop Client Observer price update: $" + priceModel.getPrice());
    }
    
}
