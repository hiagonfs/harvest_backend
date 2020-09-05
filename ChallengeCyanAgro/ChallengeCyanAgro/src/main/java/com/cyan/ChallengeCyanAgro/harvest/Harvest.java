package com.cyan.ChallengeCyanAgro.harvest;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Harvest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	@OneToMany(mappedBy = "harvest", fetch = FetchType.LAZY)
	private List<Farm> farms;

	public Harvest() {

	}

	public Harvest(long id, Date startDate, Date endDate, List<Farm> farms) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.farms = farms;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Farm> getFarms() {
		return farms;
	}

	public void setFarms(List<Farm> farms) {
		this.farms = farms;
	}

}
