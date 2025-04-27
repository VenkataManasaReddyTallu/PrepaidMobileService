package com.aits.mobileprepaid.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class RechargeHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private User user;
	@ManyToOne
	private RechargePlan plan;
	private String paymentMethod;
	private LocalDateTime rechargeDate;
	public RechargeHistory() {
		super();
	}
	public RechargeHistory(User user, RechargePlan plan, String paymentMethod, LocalDateTime rechargeDate) {
		super();
		this.user = user;
		this.plan = plan;
		this.paymentMethod = paymentMethod;
		this.rechargeDate = rechargeDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public RechargePlan getPlan() {
		return plan;
	}
	public void setPlan(RechargePlan plan) {
		this.plan = plan;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public LocalDateTime getRechargeDate() {
		return rechargeDate;
	}
	public void setRechargeDate(LocalDateTime rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	

}