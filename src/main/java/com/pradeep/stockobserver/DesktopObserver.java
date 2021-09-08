/*
 * Observer for Desktop Client
 */
package com.pradeep.stockobserver;

/**
 *
 * @author 
 */
public class DesktopObserver extends Observer{
    public DesktopObserver(PriceModel priceModel){
        this.priceModel = priceModel;
        this.priceModel.register(this);
    }
    @Override
    public void update(){
        System.out.println("Desktop Client Observer price update: $" + priceModel.getPrice());
    }
    
}
