
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
public class WebClientObserver extends Observer{
   public WebClientObserver(PriceModel priceModel){
       this.priceModel = priceModel;
       this.priceModel.register(this);
   }
   @Override
   public void update(){
       System.out.println("WebClientObserver price update: $" + priceModel.getPrice());
   }
}
