package com.patrickkilpatrick.dojosAndNinjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="dojos")
public class Dojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@OneToMany(mappedBy="dojo", fetch=FetchType.LAZY)
	private List<Ninja> ninjas;
	
	public Dojo() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinja(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
	
	@PrePersist
	void createdAt() {
		this.createdAt = new Date();
	}
	@PreUpdate
	void updatedAt() {
		this.updatedAt = new Date();
	}
}
