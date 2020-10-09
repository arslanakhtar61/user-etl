package com.handsonconnect.useretl.model;
import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {

    public NGO() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(mappedBy = "recordID")
    private VolunteerOpportunity volunteerOpportunity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VolunteerOpportunity getVolunteerOpportunity() {
        return volunteerOpportunity;
    }

    public void setVolunteerOpportunity(VolunteerOpportunity volunteerOpportunity) {
        this.volunteerOpportunity = volunteerOpportunity;
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
