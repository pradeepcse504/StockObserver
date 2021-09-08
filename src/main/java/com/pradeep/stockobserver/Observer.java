/*
 * Abstract observer class
 */
package com.pradeep.stockobserver;

/**
 *
 * @author Pradeep
 */
public abstract class Observer {
    protected PriceModel priceModel;
    public abstract void update();
}
