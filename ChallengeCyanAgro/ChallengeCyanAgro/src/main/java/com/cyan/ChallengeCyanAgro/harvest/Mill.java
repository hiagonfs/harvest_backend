package com.cyan.ChallengeCyanAgro.harvest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToMany(mappedBy = "harvest", fetch = FetchType.LAZY)
	private List<Harvest> harvests;
	
	public Mill () {
		
	}

	public Mill(long id, String name, List<Harvest> harvests) {
		this.id = id;
		this.name = name;
		this.harvests = new ArrayList<>();
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

	public List<Harvest> getHarvests() {
		return harvests;
	}

	public void setHarvests(List<Harvest> harvests) {
		this.harvests = harvests;
	}

}
