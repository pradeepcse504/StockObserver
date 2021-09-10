
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
public class WebClientObserver implements Observer, PrinterDisplay{
   private PriceModel priceModel;
   private float price;
   public WebClientObserver(PriceModel priceModel){
       this.priceModel = priceModel;
       this.priceModel.register(this);
   }
   
   public void update(float price){
       this.price = price;
       display();
   }
   public void display(){
       System.out.println("WebClientObserver price update: $" + priceModel.getPrice());
   }
}
