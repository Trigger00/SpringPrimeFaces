package com.unalm.tutoria.model;

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
public class StockDailyRecord implements java.io.Serializable {

	private Long recordId;
	private Stock stock;
	private Integer priceOpen;
	private Integer priceClose;
	private Integer priceChange;
	private Integer volume;

	public StockDailyRecord() {
	}

	public StockDailyRecord(Long recordId) {

		this.recordId = recordId;
	}

	/*public StockDailyRecord(Stock stock, Date date) {
		this.stock = stock;

	}

	public StockDailyRecord(Stock stock, Integer priceOpen, Integer priceClose,
			Integer priceChange, Integer volume, Date date) {
		this.stock = stock;
		this.priceOpen = priceOpen;
		this.priceClose = priceClose;
		this.priceChange = priceChange;
		this.volume = volume;

	}
	
	*/

	@SequenceGenerator(name = "LOG_ID_SEQ", sequenceName = "LOG_ID_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_SEQ")
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = IDENTITY)
	 */
//	@Column(name = "RECORD_ID", unique = true, nullable = false)
	@Column(name = "RECORD_ID")
	public Long getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "STOCK_ID", nullable = false)
	@JoinColumn(name = "STOCK_ID")
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Column(name = "PRICE_OPEN", precision = 6)
	public Integer getPriceOpen() {
		return this.priceOpen;
	}

	public void setPriceOpen(Integer priceOpen) {
		this.priceOpen = priceOpen;
	}

	@Column(name = "PRICE_CLOSE")
	public Integer getPriceClose() {
		return this.priceClose;
	}

	public void setPriceClose(Integer priceClose) {
		this.priceClose = priceClose;
	}

	@Column(name = "PRICE_CHANGE")
	public Integer getPriceChange() {
		return this.priceChange;
	}

	public void setPriceChange(Integer priceChange) {
		this.priceChange = priceChange;
	}

	@Column(name = "VOLUME")
	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

}