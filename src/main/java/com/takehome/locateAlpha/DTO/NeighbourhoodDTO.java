package com.takehome.locateAlpha.DTO;

import org.locationtech.jts.geom.Geometry;

public class NeighbourhoodDTO {
    private Integer income;
    private Integer population;
    private Geometry spatialObj;

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Geometry getSpatialObj() {
        return spatialObj;
    }

    public void setSpatialObj(Geometry spatialObj) {
        this.spatialObj = spatialObj;
    }

    public NeighbourhoodDTO(Integer income, Integer population, Geometry spatialObj) {
        this.income = income;
        this.population = population;
        this.spatialObj = spatialObj;
    }
}
