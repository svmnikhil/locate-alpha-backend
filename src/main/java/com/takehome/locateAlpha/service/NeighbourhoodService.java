package com.takehome.locateAlpha.service;


import com.takehome.locateAlpha.DTO.NeighbourhoodDTO;
import com.takehome.locateAlpha.repository.NeighbourhoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighbourhoodService {

    @Autowired
    private NeighbourhoodRepository neighbourhoodRepository;

    public List<NeighbourhoodDTO> getAllNeighbourhoods() {
        return neighbourhoodRepository.findAllWithoutKey();
    }
}