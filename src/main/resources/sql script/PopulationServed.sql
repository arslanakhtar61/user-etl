create table populationServed
(
populationServed_id int auto_increment primary key,
description varchar(500) NOT null,
);

INSERT INTO populationServed (description) VALUES ('Environmental education; Integrated');
INSERT INTO populationServed (description) VALUES ('Integrated');
INSERT INTO populationServed (description) VALUES ('Hunger & homelessness');
INSERT INTO populationServed (description) VALUES ('Environmental education');
INSERT INTO populationServed (description) VALUES ('Children and youth; Elderly; Hunger & homelessness');
INSERT INTO populationServed (description) VALUES ('Children and youth');
INSERT INTO populationServed (description) VALUES ('Children and youth; People with disabilities');
INSERT INTO populationServed (description) VALUES ('Environmental education; Women');
INSERT INTO populationServed (description) VALUES ('Hungers and homeless');
INSERT INTO populationServed (description) VALUES ('Elderly');
INSERT INTO populationServed (description) VALUES ('Children and youth; Environmental education');
INSERT INTO populationServed (description) VALUES ('Children and youth; Ethnic minorities');
INSERT INTO populationServed (description) VALUES ('People with mental illness');
INSERT INTO populationServed (description) VALUES ('Elderly; People with illness');
INSERT INTO populationServed (description) VALUES ('Adults; Elderly; Environmental education');
INSERT INTO populationServed (description) VALUES ('Adults; Children and youth; Elderly; People with disabilities');
INSERT INTO populationServed (description) VALUES ('Adults; Children and youth; Elderly');
INSERT INTO populationServed (description) VALUES ('Refugees and asylum seekers');
INSERT INTO populationServed (description) VALUES ('Other');
INSERT INTO populationServed (description) VALUES ('Adults; Children and youth; Elderly; Refugees and asylum seekers; Women');
INSERT INTO populationServed (description) VALUES ('Animals');
INSERT INTO populationServed (description) VALUES ('Women');
INSERT INTO populationServed (description) VALUES ('Environmental education; Hunger & homelessness');
INSERT INTO populationServed (description) VALUES ('People with disabilities; People with mental illness');
INSERT INTO populationServed (description) VALUES ('Children and youth; Refugees and asylum seekers');

DROP TABLE populationServed;
