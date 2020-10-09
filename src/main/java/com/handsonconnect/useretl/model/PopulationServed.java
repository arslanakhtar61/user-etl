package com.handsonconnect.useretl.model;

import javax.persistence.*;

@Entity
@Table(name = "populationServed")
public class PopulationServed {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "populationServed_id")
    private Integer populationServed_id;

    @Column(name = "description")
    private String description;

    public Integer getPopulationServed_id() {
        return populationServed_id;
    }

    public void setPopulationServed_id(Integer populationServed_id) {
        this.populationServed_id = populationServed_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
