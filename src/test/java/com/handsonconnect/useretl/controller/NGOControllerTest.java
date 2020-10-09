package com.handsonconnect.useretl.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.handsonconnect.useretl.model.NGO;
import com.handsonconnect.useretl.model.VolunteerOpportunity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(NGOController.class)
public class NGOControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

//    @MockBean
//    private PersonService personService;

//    @MockBean
//    private PersonRepository personRepository;

    private JacksonTester<NGO> jsonTester;

    private NGO ngo;
    private VolunteerOpportunity volunteerOpportunity;

    @BeforeEach
    public void setup() {
        JacksonTester.initFields(this, objectMapper);
        ngo = new NGO();
        VolunteerOpportunity volunteerOpportunity = new VolunteerOpportunity();
        volunteerOpportunity.setName("Serve-A-Thon: Help with sorting donated goods at Crossroads (Youth Welcome)");
        ngo.setVolunteerOpportunity(volunteerOpportunity);
    }

    @Test
    public void test_NewPartner_Persisted() throws Exception{
        NGOController ngoController = new NGOController();

        final String ngoJson = jsonTester.write(ngo).getJson();
        //given(personService.isValid(any(PersonDTO.class))).willReturn(true);
        mockMvc
                .perform(post("/api/v1/ngo/partner").content(ngoJson).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
        //verify(personRepository).persist(any(PersonDTO.class));
    }


}
