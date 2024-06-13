package com.example.lesson02.domain;

import java.time.LocalTime;

public class UsedGoods {
	private int id;
	private int sellerId;
	private String title;
	private String description;
	private int price;
	private String pictureUrl;
	private LocalTime createdAt;
	private LocalTime updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public LocalTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
