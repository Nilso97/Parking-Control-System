-- Database: "parking-control-database"

-- DROP DATABASE "parking-control-database";

CREATE DATABASE "parking-control-database"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;


-- Table: tb_parking_spot

-- DROP TABLE tb_parking_spot;

CREATE TABLE tb_parking_spot
(
  id uuid NOT NULL,
  apartament character varying(30) NOT NULL,
  block character varying(30) NOT NULL,
  brand_car character varying(70) NOT NULL,
  color_car character varying(70) NOT NULL,
  license_plate_car character varying(7) NOT NULL,
  model_car character varying(70) NOT NULL,
  parking_spot_number character varying(10) NOT NULL,
  registration_date timestamp without time zone NOT NULL,
  reponsible_name character varying(130) NOT NULL,
  CONSTRAINT tb_parking_spot_pkey PRIMARY KEY (id),
  CONSTRAINT uk_678owtycsgr3anxf3qw4s9r8u UNIQUE (parking_spot_number),
  CONSTRAINT uk_sms6qglh44hhw4bpgwnp8umw1 UNIQUE (license_plate_car)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_parking_spot
  OWNER TO postgres;


SELECT * FROM tb_parking_spot;