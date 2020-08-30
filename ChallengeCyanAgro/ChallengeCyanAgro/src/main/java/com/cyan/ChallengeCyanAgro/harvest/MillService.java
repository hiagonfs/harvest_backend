package com.cyan.ChallengeCyanAgro.harvest;

import org.springframework.stereotype.Service;

@Service
public class MillService {

    private MillRepository<Mill, Long> millsDAO;

    public MillService(MillRepository<Mill, Long> millsDAO) {
        super();
        this.millsDAO = millsDAO;
    }

    public Mill registerMill(Mill mill) {
        return this.millsDAO.save(mill);
    }
}
