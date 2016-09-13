package com.jpmorgan.sampath.stock.service;

import java.util.List;

import com.jpmorgan.sampath.stock.model.Stock;
import com.jpmorgan.sampath.stock.model.Trade;

/**
 * Trade service for {@code Trade}s
 * @author ayyappan18@gmail.com
 */
public interface TradeService {

  /**
   * Record a {@code Trade}
   * @param trade
   */
  public void recordTrade(Trade trade);

  /**
   * Get a list of {@code Trade}s for {@code Stock} within the last x minutes
   * @param stock
   * @param numberOfMinutes
   * @return
   */
  public List<Trade> getTrades(Stock stock, int numberOfMinutes);

  /**
   * Get all {@code Trade}s
   * @return
   */
  public List<Trade> getAllTrades();
}
