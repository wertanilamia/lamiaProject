package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Direction implements Serializable {
 @Id
 @GeneratedValue
	private int idirect ;
	private String  nomdirect ;
	
	public Direction() {
		super();
	}
	public Direction(String nomdirect) {
		super();
		this.nomdirect = nomdirect;
	}
	public int getIdirect() {
		return idirect;
	}
	public void setIdirect(int idirect) {
		this.idirect = idirect;
	}
	public String getNomdirect() {
		return nomdirect;
	}
	public void setNomdirect(String nomdirect) {
		this.nomdirect = nomdirect;
	}
	
}
