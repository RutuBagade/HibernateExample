package com.dss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductInfo")
public class ProductInfo 
{
	@Id
	@Column
	@GeneratedValue
      private int ProdId;
	@Column
      private String ProdName;
	@Column
	private String Prodtype;
	@Column
	private int Prodcost;
	/**
	 * @return the prodId
	 */
	public int getProdId() {
		return ProdId;
	}
	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(int prodId) {
		this.ProdId = prodId;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return ProdName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.ProdName = prodName;
	}
	/**
	 * @return the prodtype
	 */
	public String getProdtype() {
		return Prodtype;
	}
	/**
	 * @param prodtype the prodtype to set
	 */
	public void setProdtype(String prodtype) {
		this.Prodtype = prodtype;
	}
	/**
	 * @return the prodcost
	 */
	public int getProdcost() {
		return Prodcost;
	}
	/**
	 * @param prodcost the prodcost to set
	 */
	public void setProdcost(int prodcost) {
		this.Prodcost = prodcost;
	}
	
	
}
