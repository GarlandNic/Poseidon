package com.nnk.springboot.domain;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;

import jakarta.validation.constraints.*;
import java.sql.Timestamp;


@Entity
@Table(name = "curvepoint")
public class CurvePoint {

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private Integer curveId;
	private Timestamp asOfDate;
	
    @NotNull(message = "Term is mandatory")
    @DecimalMin(value = "0.0", inclusive = false, message = "Term must be positive")
//    @Digits(integer=10, fraction=2, message = "Term must be a number")
	private Double term;
    
    @NotNull(message = "Value is mandatory")
    @DecimalMin(value = "0.0", inclusive = false, message = "Value must be positive")
//    @Digits(integer=10, fraction=2, message = "Value must be a number")
	private Double value;
    
	private Timestamp creationDate;
	
	public CurvePoint(int i, double term, double val) {
		this.curveId = i;
		this.term = term;
		this.value = val;
	}
	
	public Integer getCurveId() {
		return curveId;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setCurveId(Integer curveId) {
		this.curveId = curveId;
	}
	public Timestamp getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(Timestamp asOfDate) {
		this.asOfDate = asOfDate;
	}
	public Double getTerm() {
		return term;
	}
	public void setTerm(Double term) {
		this.term = term;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

}
