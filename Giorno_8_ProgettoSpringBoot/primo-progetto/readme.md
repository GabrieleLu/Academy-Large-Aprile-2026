
---primo progetto

##  Configurazioni

- Porta server: `8081`
- Profilo attivo: `dev`
- Actuator: tutti gli endpoint abilitati

---

##  Endpoint disponibili

### 🔹 Saluto
- URL: `/saluto`
- Metodo: GET
- Descrizione: restituisce un messaggio di saluto

---

###  Info autore
- URL: `/info`
- Metodo: GET
- Descrizione: restituisce un JSON con il nome dell'autore

---

###  App Info
- URL: `/app-info`
- Metodo: GET
- Descrizione: mostra nome app, versione e messaggio di benvenuto

---

###  App Info
- URL: `/port-info`
- Metodo: GET
- Descrizione: mostra il numero della porta 

---



###  Actuator Health
- URL: `/actuator/health`
- Metodo: GET
- Descrizione: stato dell'applicazione

---

###  Actuator Mappings
- URL: `/actuator/mappings`
- Metodo: GET
- Descrizione: mostra tutti gli endpoint registrati