package com.jpmorgan.sampath.stock.service.impl;

import java.util.List;

import com.jpmorgan.sampath.stock.dao.TradeDao;
import com.jpmorgan.sampath.stock.dao.impl.MemoryTradeDao;
import com.jpmorgan.sampath.stock.model.Stock;
import com.jpmorgan.sampath.stock.model.Trade;
import com.jpmorgan.sampath.stock.service.TradeService;

/**
 * Implementation of {@code TradeService}
 * @author ayyappan18@gmail.com
 */
public class TradeServiceImpl implements TradeService {

  private static TradeServiceImpl instance = null;

  public static TradeService getInstance() {
    if (instance == null) {
      instance = new TradeServiceImpl();
    }
    return instance;
  }

  private TradeDao tradeDao = new MemoryTradeDao();

  /**
   * @inheritDoc
   */
  public void recordTrade(Trade trade) {
    if (trade != null && trade.getStock() != null) {
      tradeDao.addTrade(trade);
    }
  }

  /**
   * @inheritDoc
   */
  public List<Trade> getTrades(Stock stock, int minutes) {
    return tradeDao.getTrades(stock, minutes);
  }

  /**
   * @inheritDoc
   */
  public List<Trade> getAllTrades() {
    return tradeDao.getAllTrades();
  }

}
