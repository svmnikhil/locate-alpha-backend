package com.takehome.locateAlpha.repository;


import com.takehome.locateAlpha.DTO.NeighbourhoodDTO;
import com.takehome.locateAlpha.model.Neighbourhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighbourhoodRepository extends JpaRepository<Neighbourhood, String> {
    @Query("SELECT new com.takehome.locateAlpha.DTO.NeighbourhoodDTO(n.income, n.population, n.spatialObj) FROM Neighbourhood n")
    List<NeighbourhoodDTO> findAllWithoutKey();
}
