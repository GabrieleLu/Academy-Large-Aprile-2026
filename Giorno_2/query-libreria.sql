
--autore Gabriele Luongo
--21/4/2026

-- seleziona libri con prezzo ascendente
select * from libri order by prezzo asc;


-- seleziona tutti i libri disponibili che abbiano un prezzo tra i 10 e 20 compresi
select * from libri where disponibile = true
AND prezzo BETWEEN 10.0 AND 20.0;

 -- seleziona la colonna anno nella t libri
select anno from libri;

-- seleziona titolo ed autore in una unica colonna rinominata informaxioni dove l'autore ha al suo interno la lettera a
SELECT CONCAT(titolo, ' - ', autore) AS informazioni
FROM libri
WHERE autore LIKE ('%a%');


-- seleziona tutti i libri tra l'anno 2000 e 2015 compresi ordinandoli in maniera decrescente con un limite di visualizzazioni di 5
SELECT * from libri 
WHERE anno BETWEEN  2000 and 2015
order by anno DESC
LIMIT 5


-- seleziona tutti i libri che hanno come categoria fantasy e fantascienza.
select * from libri 
where genere in('Fantasy','Fantascienza');





