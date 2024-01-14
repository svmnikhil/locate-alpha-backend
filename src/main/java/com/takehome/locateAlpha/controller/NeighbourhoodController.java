package com.takehome.locateAlpha.controller;

import com.takehome.locateAlpha.DTO.NeighbourhoodDTO;
import com.takehome.locateAlpha.model.Neighbourhood;
import com.takehome.locateAlpha.service.NeighbourhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/neighbourhoods")
public class NeighbourhoodController {

    @Autowired
    private NeighbourhoodService neighbourhoodService;

    @GetMapping
    public List<NeighbourhoodDTO> getAllNeighbourhoods() {
        return neighbourhoodService.getAllNeighbourhoods();
    }
}
