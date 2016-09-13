package com.jpmorgan.sampath.stock.dao;

import com.jpmorgan.sampath.stock.model.Stock;

/**
 * Interface for {@code Stock} database implementation.
 * @author ayyappan18@gmail.com
 */
public interface StockDao {

  /**
   * Add new {@code Stock} item to the db.
   * @param stock
   */
  void addStock(Stock stock);

  /**
   * Get {@code Stock} by stock symbol.
   * @param symbol
   * @return
   */
  Stock getStock(String symbol);

}
