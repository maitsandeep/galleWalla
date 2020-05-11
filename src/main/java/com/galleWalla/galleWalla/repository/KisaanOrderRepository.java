package com.galleWalla.galleWalla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galleWalla.galleWalla.bean.KisaanOrderDetails;
@Repository
public interface KisaanOrderRepository extends JpaRepository<KisaanOrderDetails, Integer> {

}
