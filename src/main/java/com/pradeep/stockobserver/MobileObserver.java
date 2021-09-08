/*
 * Mobile Observer Class
 */
package com.pradeep.stockobserver;

/**
 *
 * @author 
 */
public class MobileObserver extends Observer {
    public MobileObserver(PriceModel priceModel){
        this.priceModel = priceModel;
        this.priceModel.register(this);
    }
    @Override
    public void update(){
        System.out.println("Mobile Observer price update: $" + priceModel.getPrice());
    }
}
