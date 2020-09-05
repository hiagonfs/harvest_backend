package com.cyan.ChallengeCyanAgro.harvest;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Farm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToMany(mappedBy = "harvest", fetch = FetchType.LAZY)
	private List<Countryside> fields;

	public Farm() {

	}

	public Farm(long id, String name, List<Countryside> fields) {
		super();
		this.id = id;
		this.name = name;
		this.fields = fields;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Countryside> getFields() {
		return fields;
	}

	public void setFields(List<Countryside> fields) {
		this.fields = fields;
	}

}
