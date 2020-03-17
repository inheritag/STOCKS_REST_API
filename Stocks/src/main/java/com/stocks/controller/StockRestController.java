package com.stocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.entity.Stocks;
import com.stocks.service.StockService;

@RestController
public class StockRestController {
	  
	 @Autowired
	 private StockService stockService;
	  
	 public void setStockService(StockService stockService) {
	  this.stockService = stockService;
	 }
	 
	 @GetMapping("/api/stocks")
	 public List<Stocks> getStocks() {
	  List<Stocks> stocks = stockService.retrieveStocks();
	  return stocks;
	 }
	  
	 @GetMapping("/api/stocks/{stockId}")
	 public Stocks getStock(@PathVariable(name="stockId")Long stockId) {
	  return stockService.getStock(stockId);
	 }
	  
	 @PostMapping("/api/stocks")
	 public void createStock(@RequestBody Stocks stock){
	  stockService.createStock(stock);
	  System.out.println("Stock created Successfully");
	 }
	  
	  
	 @PutMapping("/api/stocks/{stockId}")
	 public void updatestock(@RequestBody Stocks stock,
	   @PathVariable(name="stockId") Long stockId){
	  Stocks emp = stockService.getStock(stockId);
	  if(emp != null){
	   stockService.updateStock(stock);
	  }
	   
	 }
}
