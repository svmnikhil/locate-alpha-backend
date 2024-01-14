package com.takehome.locateAlpha.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "dfw_demo", schema = "public")
public class Neighbourhood {

    @Id
    @Column(name = "Key")
    private String key;

    @Column(name = "income")
    private Integer income;

    @Column(name = "population")
    private Integer population;

    @Column(name = "spatialobj", columnDefinition = "geometry(Polygon,4326)")
    private Geometry spatialObj;

    // Standard getters and setters

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

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
}