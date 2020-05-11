package com.galleWalla.galleWalla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galleWalla.galleWalla.bean.Kisaan;

@Repository
public interface KisaanRepository extends JpaRepository<Kisaan, Integer> {

}
