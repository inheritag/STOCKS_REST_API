package com.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stocks.entity.Stocks;

@Repository
public interface StockRepository extends JpaRepository<Stocks,Long>{
	 
}
