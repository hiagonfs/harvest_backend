package com.cyan.ChallengeCyanAgro.harvest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface MillRepository<T, ID extends Serializable> extends JpaRepository<Mill, Long> {
}
