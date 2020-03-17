package com.stocks.service;

import java.util.List;

import com.stocks.entity.Stocks;

public interface StockService {
	public List<Stocks> retrieveStocks();
	  
	public Stocks getStock(Long stockId);
	  
	public void createStock(Stocks stock);
	  
	public void updateStock(Stocks stock);
	
}
