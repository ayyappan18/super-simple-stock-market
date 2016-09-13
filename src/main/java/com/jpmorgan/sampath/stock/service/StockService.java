package com.jpmorgan.sampath.stock.service;

import java.util.List;

import com.jpmorgan.sampath.stock.model.Stock;
import com.jpmorgan.sampath.stock.model.Trade;

/**
 * Stock service for {@code Stock}s
 * @author ayyappan18@gmail.com
 */
public interface StockService {

  /**
   * Add a {@code Stock}
   * @param stock
   */
  public void addStock(Stock stock);

  /**
   * Get a {@code Stock}
   * @param symbol
   * @return
   */
  public Stock getStock(String symbol);

  /**
   * Calculate the dividend yield for an {@code Stock} and price
   * @param stock
   * @param price
   * @return
   */
  public double calculateDividendYield(Stock stock, double price);

  /**
   * Calculate the P/E ration for an {@code Stock} and price
   * @param stock
   * @param price
   * @return
   */
  public double calculatePERatio(Stock stock, double price);

  /**
   * Calculate the volume weighted stock price based on a list of {@code Trades}
   * @param trades
   * @return
   */
  public double calculateVolumeWeightedStockPrice(List<Trade> trades);

  /**
   * Calculate the GBCE for a list of {@code Trades}
   * @param trades
   * @return
   */
  public double calculateGBCE(List<Trade> trades);
}
