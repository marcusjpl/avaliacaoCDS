package com.cds.model;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_ORDER")
public class Order {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String customer;
	
	private String reference;
	
	private Date orderDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ORDER_ID")
	private Collection<Item> items = new LinkedHashSet<Item>();

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the items
	 */
	public Collection<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	

}
