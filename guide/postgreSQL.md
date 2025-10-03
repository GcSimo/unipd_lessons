# Guida all'utilizzo PostgreSQL da terminale

## Inizializzazione e avvio di PostgreSQL
```bash
psql -U nome_utente -d database -p numero_porta
```
- nome_utente di default: `postgres` o lo username del sistema
- database di default: `postgres`
- numero_porta di default: `5432`

## Comandi utili in psql
consigli sulla sintassi ``\h command``
consigli su comandi psql ``?``

per uscire da psql
```sql
\q
```

## Comandi SQL di base
creare uno schema
```sql
CREATE SCHEMA nome_schema;
```

creare una tabella
```sql
CREATE TABLE nome_schema.nome_tabella (
	colonna1 tipo_dato,
	colonna2 tipo_dato,
	...
);
```
