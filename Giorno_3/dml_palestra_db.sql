

-- DML
-- Aggiorna l'email di uno dei soci con UPDATE. Poi imposta attivo = 0 per un socio (simulando una disiscrizione).  Elimina un'iscrizione.
select * from Corsi;
SELECT * from Iscrizioni;
DELETE  from  Iscrizioni  where  socio_id =9  ;

-- test
update Soci set email = 'inattivo'  WHERE nome = 'Sara';
update Soci set attivo = 0  WHERE nome = 'Sara';


-- aggiunta colonna corsi decimal

ALTER TABLE Corsi add Column costo_mensile DECIMAL(6,2);



-- Scrivi una JOIN tra SOCI, ISCRIZIONI e CORSI per ottenere un report che mostri: nome e cognome del socio, 
-- nome del corso, data di iscrizione. Filtra solo i soci attivi.

SELECT s.nome,s.cognome, c.nome AS corso, i.data_iscrizione
FROM Soci s
JOIN Iscrizioni i ON s.id = i.socio_id
JOIN Corsi c ON c.id = i.corso_id
WHERE s.attivo = 1;

-- Esegui infine la query GROUP BY per sapere quante iscrizioni ha ciascun corso.

SELECT  c.nome, COUNT(i.id) AS numero_iscrizioni
FROM Corsi c, Iscrizioni i
WHERE c.id = i.corso_id
GROUP BY c.nome;

