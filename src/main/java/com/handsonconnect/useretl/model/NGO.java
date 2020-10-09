package com.handsonconnect.useretl.model;
import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {

    public NGO() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ngo_id")
    private Integer ngo_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "populationServed_id", referencedColumnName = "populationServed_id")
    private PopulationServed populationServed;

    public Integer getNgo_id() {
        return ngo_id;
    }

    public void setNgo_id(Integer ngo_id) {
        this.ngo_id = ngo_id;
    }

    public PopulationServed getPopulationServed() {
        return populationServed;
    }

    public void setPopulationServed(PopulationServed populationServed) {
        this.populationServed = populationServed;
    }

    //    occurrenceID
//    status
//
//    impactOutcome
//
//    scheduleType
//
//    location
//    startDateTime
//    endDateTime
//    opportunityCoordinator
//    OpportunityCoordinatorEmail
//    volunteerLeaderNeeded
//    maximumAttendance
//    minimumAttendance
//    totalConfirmed
//    volunteersStillNeeded
//    totalAttended
//    totalNotAttended
//    totalHoursServed




}
