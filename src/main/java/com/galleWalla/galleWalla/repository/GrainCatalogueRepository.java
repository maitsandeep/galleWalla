package com.galleWalla.galleWalla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galleWalla.galleWalla.bean.GrainCatalogue;
@Repository
public interface GrainCatalogueRepository extends JpaRepository<GrainCatalogue, Integer> {

}
