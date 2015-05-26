package com.unalm.tutoria.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "stock_daily_record", catalog = "elbernab")
public class StockDailyRecord1 implements Serializable {

	@SequenceGenerator(name = "LOG_ID_SEQ", sequenceName = "LOG_ID_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_SEQ")
	@Column(name = "RECORD_ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "PRICE_OPEN")
	private Integer priceOpen;

	@Column(name = "PRICE_CLOSE")
	private Integer priceClose;

	@Column(name = "PRICE_CHANGE")
	private Integer priceChange;

	@Column(name = "VOLUME")
	private Integer volume;


	/*
	@Column(name = "STOCK_ID")
	private Integer stockId;
	*/
	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "STOCK_ID", nullable = false)
	@JoinColumn(name = "STOCK_ID")
	private Stock stock;
	
	
	public StockDailyRecord1() {
	}

	public StockDailyRecord1(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPriceOpen() {
		return priceOpen;
	}

	public void setPriceOpen(Integer priceOpen) {
		this.priceOpen = priceOpen;
	}

	public Integer getPriceClose() {
		return priceClose;
	}

	public void setPriceClose(Integer priceClose) {
		this.priceClose = priceClose;
	}

	public Integer getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(Integer priceChange) {
		this.priceChange = priceChange;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}
/*
	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
*/
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}



	



}