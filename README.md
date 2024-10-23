# GRADASSI TOMMASO 


## Obbiettivo programma:
Il progetto simula una partita di pallavolo utilizzando concetti di multithreading in Java. Due o più giocatori, rappresentati da oggetti della classe Giocatore, incrementano il loro contatore di passaggi in un ciclo infinito, ciascuno eseguito all'interno di un thread separato. L'obiettivo è mostrare come funzionano i thread.    

## Metodi ed Attributi utilizzati:

### Attributi:
- **numeropassaggi** (private int)
 Questo attributo tiene traccia del numero di passaggi effettuati dal giocatore.

-**id** (public int)
 È l'identificatore univoco del giocatore. Viene assegnato al momento della creazione dell'oggetto Giocatore tramite il costruttore.

 -**priority** (private int)
 Indica la priorità del thread. I thread con priorità più alta hanno maggiore possibilità di ottenere tempo di esecuzione rispetto a quelli con priorità più bassa.

### Metodi:
-Nella classe "Giocatore.java" troviamo la classe **run** che ci permette di far partire il nostro
thread. 
- Un'altro aspetto importante inoltre è anche l'utilizzo del comando **yield**, con la chiamata di esso
 un altro thread(giocatore) può svolgere un passaggio. Quindi grazie a questo comando un thread si mette in pausa , per lasciare spazio a quello successivo in stato di ready.

 -main: classe in cui si avvia il programma.