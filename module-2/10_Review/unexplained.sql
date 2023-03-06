BEGIN TRANSACTION;

DROP TABLE IF EXISTS witness_sighting;
DROP TABLE IF EXISTS witness;
DROP TABLE IF EXISTS sighting;

CREATE TABLE sighting(

	--columns
	sighting_id serial,
	identification_explanation varchar(1000),
	sighting_datetime timestamp NOT NULL,
	city varchar(50),
	state_abbrevation varchar(2),
	description varchar(1000),
	debunked boolean DEFAULT(false),
	has_police_report boolean DEFAULT(false),
	
	--constraints
	CONSTRAINT pk_sighting PRIMARY KEY (sighting_id)
);

CREATE TABLE witness(

	witness_id serial,
	witness_name varchar(50),
	phone varchar(20),
	
	CONSTRAINT pk_witness PRIMARY KEY (witness_id)
);

CREATE TABLE witness_sighting(
	sighting_id int,
	witness_id int,
	
	CONSTRAINT pk_witness_sighting PRIMARY KEY(sighting_id, witness_id),
	CONSTRAINT fk_witness_sighting_witness FOREIGN KEY (witness_id) REFERENCES witness(witness_id),
	CONSTRAINT fk_witness_sighting_sighting FOREIGN KEY (sighting_id) REFERENCES sighting(sighting_id)
);

COMMIT;