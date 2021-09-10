
package com.pradeep.stockobserver;
/**
 *
 * @author Pradeep
 */
public class StockObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //The PriceModel Object is the subject been observed for the change in price 
        //to notify all observers for the change and update the view accordingly
        PriceModel priceModel = new PriceModel();
        
        MobileObserver mobileObserver = new MobileObserver(priceModel);
        DesktopObserver desktopObserver = new DesktopObserver(priceModel);
        WebClientObserver webClientObserver = new WebClientObserver(priceModel);
        
        System.out.println("First Price change: 1222.34");
        priceModel.setPrice(1222.34f);
        System.out.println("\n");
        System.out.println("Second Price change: 1300.98");
        priceModel.setPrice(1300.98f);
        System.out.println("\n");
        
        priceModel.unregister(mobileObserver);
        System.out.println("Third Price change: 1300.98");
        priceModel.setPrice(1500.98f);
        
        
        
    }
}
