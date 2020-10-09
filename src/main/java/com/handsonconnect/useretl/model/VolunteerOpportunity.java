package com.handsonconnect.useretl.model;

import javax.persistence.*;

@Entity
@Table(name = "VolunteerOpportunity")
public class VolunteerOpportunity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "totalHoursServed")
    private String totalHoursServed;

    @Column(name = "populationsServed")
    private String populationsServed;

    @Column(name = "primaryImpactArea")
    private String primaryImpactArea;

    @Column(name = "name")
    private String name;

    @Column(name = "registrationType")
    private String registrationType;

    @Column(name = "recordID")
    private String recordID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}