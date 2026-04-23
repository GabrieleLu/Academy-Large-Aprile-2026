-- DDL

--  Crea database
CREATE DATABASE palestra_db;

-- Seleziona database
USE palestra_db;

-- Tabella Soci
CREATE TABLE Soci (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cognome VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    data_iscrizione DATE,
    attivo INT DEFAULT 1
);

--  Tabella Corsi
CREATE TABLE Corsi (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    istruttore VARCHAR(100),
    max_partecipanti INT,
    livello VARCHAR(20)
);

-- Tabella Iscrizioni
CREATE TABLE Iscrizioni (
    id INT AUTO_INCREMENT PRIMARY KEY,
    socio_id INT,
    corso_id INT,
    data_iscrizione DATE
);

