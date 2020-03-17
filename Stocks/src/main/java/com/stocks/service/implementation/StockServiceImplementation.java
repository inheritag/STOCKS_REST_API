package com.stocks.service.implementation;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stocks.entity.Stocks;
import com.stocks.repository.StockRepository;
import com.stocks.service.StockService;

@Service
public class StockServiceImplementation implements StockService {
	 @Autowired
	 private StockRepository stockRepository;
	 
	 public void setstockRepository(StockRepository stockRepository) {
	  this.stockRepository = stockRepository;
	 }
	  
	 public List<Stocks> retrieveStocks() {
		 List<Stocks> stocks = new ArrayList<Stocks> ();
		 stockRepository.findAll().forEach(Feature->stocks.add(Feature));
		 return stocks;
	 }
	  
	 public Stocks getStock(Long stockId) {
		 return stockRepository.findById(stockId).get();
	 }
	  
	 public void createStock(Stocks stock){
	  stockRepository.save(stock);
	 }
	  
	 public void updateStock(Stocks stock) {
	  stockRepository.save(stock);
	 }
	
}
