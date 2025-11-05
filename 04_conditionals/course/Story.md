# Conditionals

## switch-case
### Grundaufbau
* Mit if-Abfragen können wir Kontrollflüsse in unseren Programmen implementieren
* Weiteres Beispiel: `DayOfWeek`-Klasse: Wandelt eine Zahl zwischen 1 und 7 in den jeweiligen Wochentag um (von Montag bis Freitag)
* Wenn wir das implementieren, haben wir sehr viele "else if"-Instanzen, der Code wird schnell unübersichtlich
* In Java gibt es noch ein weiteres Konstrukt, um den Kontrollfluss zu steuern, das gut auf diesen Anwendungsfall passt und den Code übersichtlicher macht: Das switch-Statement
  * Kann if-else-if-else aus dem vorigen Beispiel ersetzen
  * Grundidee: Werte den Wert einer Variable aus und führe auf Basis dessen einen Codezweig aus
* Grundaufbau von switch-case erläutern (anhand von dayOfWeek-Conversion):
  * Keyword `switch`, gefolgt von auszuwertender Variable in Klammern, danach geschweifte Klammern, z.B. `switch(foo) {}` 
  * Die auszuwertende Variable kann nur einen primitiven Datentyp haben oder ein String sein!
  * Innerhalb der geschweiften Klammern definieren wir nun sogenannte 'cases' mit dem `case` Schlüsselwort: Das sind die möglichen Werte, die unsere Variable annehmen kann.
  * Nach `case` folgt stets ein Wert, den unsere Variable annehmen könnte, in unserem Beispiel sind das Zahlen von 1 bis 7
  * Nach dem Doppelpunkt können wir dann (in einer neuen Zeile) Code schreiben, der nur für diesen Fall gilt.
  * Optional können wir noch einen Standardfall mit dem `default`-Keyword definieren: Dieser würde dann ausgeführt werden, wenn keiner der vorher definierten Fälle zutrifft. Trifft kein Fall zu und gibt es auch keinen default-Fall, passiert nichts. Im Fall der Wochentagkonvertierung kann ein Fehler in der Konsole ausgegeben werden.
  * Switch-Case für Konversion soll jetzt fertig implementiert sein (aber noch ohne `break`). Beispieleingaben herzeigen - was kommt bei Auswertung der Methode raus? => Falle :)

### `break`-Schlüsselwort
* Wichtig bei Switch-Statements: Das `break`-Schlüsselwort!
* Steht in der Regel am Ende eines jeden case-Statements
  *  Andernfalls wird der Code aller Folge-Cases (inklusive Default-Case) mit ausgeführt!
* Warum ist das so?
  * Das hat hauptsächlich historische Gründe: In C (was in etwa der "Opa" aller modernen Programmiersprachen ist) wurde switch-case so designed
  * Dass bei Weglassen von `break` die darunterliegenden Fälle ausgeführt werden, nennt man auch "fall-through", was explizit ein Feature war
  * Beim Sprachendesign von Java hat man sich u.a. an C orientiert und das 1:1 übernommen
* Fall-Through sieht man heute aber eher selten :) 

### switch-expressions (optional)
* Seit Java 12 gibt es zusätzlich eine andere Form von switch: switch expressions
* Dort wird das "break"-Schlüsselwort nicht mehr benötigt
* Statt ":" wird ein Case mit "->" definiert

### Übung zu switch-case
* In der Übungsaufgabe sollen die Studierenden ein eigenes switch-case implementieren
* Hierzu soll in der BankAccount-Klasse eine Methode implementiert werden, welche den aktuellen Kontostand (in Euro) in verschiedene ausländische Währungen umrechnet
* Verschiedene Wechselkurse sind auf dem Übungsblatt aufgelistet
