/*
 * Abstract observer class
 */
package com.mycompany.stockobserver;

/**
 *
 * @author Pradeep
 */
public abstract class Observer {
    protected PriceModel priceModel;
    public abstract void update();
}
