package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.sql.Timestamp;

@Entity
@Table(name = "rating")
public class Rating {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	
    @NotBlank(message = "Moodys Rating is mandatory")
	private String moodysRating;
    
    @NotBlank(message = "Sand PRating is mandatory")
	private String sandPRating;
    
    @NotBlank(message = "Fitch Rating is mandatory")
	private String fitchRating;
    
    @NotNull(message = "Order is mandatory")
	private Integer orderNumber;
	
	public Rating(String moodys, String sand, String fitch, int order) {
		this.moodysRating = moodys;
		this.sandPRating = sand;
		this.fitchRating = fitch;
		this.orderNumber = order;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMoodysRating() {
		return moodysRating;
	}
	public void setMoodysRating(String moodysRating) {
		this.moodysRating = moodysRating;
	}
	public String getSandPRating() {
		return sandPRating;
	}
	public void setSandPRating(String sandPRating) {
		this.sandPRating = sandPRating;
	}
	public String getFitchRating() {
		return fitchRating;
	}
	public void setFitchRating(String fitchRating) {
		this.fitchRating = fitchRating;
	}
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
}
