CREATE TABLE impactArea (
  impactArea_id INT NOT NULL AUTO_INCREMENT,
  description VARCHAR(1000) NOT NULL,
  PRIMARY KEY (impactArea_id)
);

INSERT INTO impactArea (description) VALUES ("Environmental Conservation");
INSERT INTO impactArea (description) VALUES ("Hunger & Homelessness");
INSERT INTO impactArea (description) VALUES ("Education and Empowerment for Children and Youth");
INSERT INTO impactArea (description) VALUES ("Assistance and Support for Elderly");
INSERT INTO impactArea (description) VALUES ("Civic & Community");
INSERT INTO impactArea (description) VALUES ("Education and Empowerment for Children and Youth");
INSERT INTO impactArea (description) VALUES ("Hygiene");
INSERT INTO impactArea (description) VALUES ("Disaster & Emergency Services");
INSERT INTO impactArea (description) VALUES ("Health and Wellness");
INSERT INTO impactArea (description) VALUES ("Refugee & Asylum Seekers Services");
INSERT INTO impactArea (description) VALUES ("Animal Welfare");
INSERT INTO impactArea (description) VALUES ("Empowerment and Support for Domestic and Migrant Workers");
INSERT INTO impactArea (description) VALUES ("Health & Wellness");

DROP TABLE impactArea;