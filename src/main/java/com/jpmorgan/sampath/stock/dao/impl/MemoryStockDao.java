package com.jpmorgan.sampath.stock.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.jpmorgan.sampath.stock.dao.StockDao;
import com.jpmorgan.sampath.stock.model.Stock;

/**
 * In memory implementation of {@code StockDao}
 * @author ayyappan18@gmail.com
 */
public class MemoryStockDao implements StockDao {

  private Map<String, Stock> stockMap = new HashMap<String, Stock>();

  /**
   * @inheritDoc
   */
  public void addStock(Stock stock) {
    stockMap.put(stock.getSymbol(), stock);
  }

  /**
   * @inheritDoc
   */
  public Stock getStock(String symbol) {
    return stockMap.get(symbol);
  }

}
