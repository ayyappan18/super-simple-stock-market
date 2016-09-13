package com.jpmorgan.sampath.stock.exception;

/**
 * Custom exception for any super simple stock errors.
 * @author ayyappan18@gmail.com
 */
public class SuperSimpleStockMarketException extends Exception {

  private static final long serialVersionUID = 1L;

  public SuperSimpleStockMarketException(String message) {
    super(message);
  }

}
