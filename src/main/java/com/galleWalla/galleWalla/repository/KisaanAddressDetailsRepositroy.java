package com.galleWalla.galleWalla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galleWalla.galleWalla.bean.KisaanAddressDetails;
@Repository
public interface KisaanAddressDetailsRepositroy extends JpaRepository<KisaanAddressDetails, Integer> {

}
