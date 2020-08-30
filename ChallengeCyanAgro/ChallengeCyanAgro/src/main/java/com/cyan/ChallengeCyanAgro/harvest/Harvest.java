package com.cyan.ChallengeCyanAgro.harvest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Harvest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
