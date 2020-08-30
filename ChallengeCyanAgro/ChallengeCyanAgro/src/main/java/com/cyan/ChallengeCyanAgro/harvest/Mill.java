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

    public Mill(long id, String name, List<Harvest> harvests) {
        this.id = id;
        this.name = name;
        this.harvests = new ArrayList<>();
    }
}
