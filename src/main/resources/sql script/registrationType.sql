CREATE TABLE registrationType (
  registrationType_id INT NOT NULL AUTO_INCREMENT,
  description VARCHAR(1000) NOT NULL,
  PRIMARY KEY (registrationType_id)
);

INSERT INTO registrationType (description) VALUES ("Sign Up");
INSERT INTO registrationType (description) VALUES ("Express Interest");

DROP TABLE registrationType;
