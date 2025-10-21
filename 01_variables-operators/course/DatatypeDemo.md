# DatatypeDemo

## Datentypen
* 8 verschiedene primitive Datentypen in Java
* Notwendig um verschiedene Werte darstellen zu können
* Typ legt fest was man mit den verschiedenen Variablen machen kann z.B. verschiedene Operatoren für *boolean* und *int*

## Deklaration einer Variable
* Variablen speichern Werte in einem Programm
* Um eine neue Variable im Programm anzulegen -> Variablendeklaration bestehend aus dem Datentyp gefolgt von einem Variablennamen
* In Java **;** um das Ende der Instruktion zu signalisieren
* Variablennamen beachten die Groß-/Kleinschreibung
* Variablennamen können frei gewählt werden, Leerzeichen und Java Schlüsselwörter sind nicht zulässig

## Initialisierung / Wertzuweisung
* Um Werte im Programm zu speichern, können sie den bereits angelegten Variablen zugewiesen werden
* Um im Code eine Zahl des Types *long* darzustellen und zuzuweisen, ist ein **L** am Ende notwendig, für *float* ein **F**
* Deklaration und Initialisierung ist auch in einer Instruktion möglich
* Chars werden in einfache Anführungszeichen gesetzt, z.B. **'€'**
* Variable kann im Verlauf des Programmes neue Werte zugewiesen bekommen

## Arithmetische Operatoren
* Berechnungen mithilfe arithmetischer Operatoren und Literale
* Berechnungen mit Variablen
* Korrekter Datentyp des Ergebnisses muss berücksichtigt werden

## String
* Kein primitiver Datentyp, deshalb auch großgeschrieben
* Spezielle Unterstützung von Strings (Literals, Concat Operator)
* Um Strings im Code darzustellen, wird der Text in doppelte Anführungszeichen gesetzt, z.B. **"John"**
* Operator *+* kann verwendet werden um zwei Strings aneinanderzuhängen


## - Optionales Kapitel: Typkonvertierung -
* Zwei Arten der Konvertierung
  * Erweiternde Konvertierung: Konvertierung zu einem höheren Datentyp, z.B. von einem *int* zu *long*. Jeder *long* hat größeren Wertebereich und kann jeden *int* repräsentieren -> Konvertierung unabhängig von der Belegung ohne Informationsverlust möglich. Das geschieht automatisch (implizit).
  * Einschränkende Konvertierung: Konvertierung zu einem nierigeren Datentyp, z.B. von *double* zu *int*. *int* kann die Zahl hinter dem Decimalpunkt nicht darstellen und abhängig vom tatsächlichen Wert auch nicht den ganzzahligen Teil.
* Typkonvertierungen können große Folgen haben
  * Beispiel des expliziten Castings der Variable *velocity*, als *double*, zu einer 16-bit Ganzzahl (*short*)
  * Zahl hinter dem Komma wird abgeschnitten, kein Problem, wenn diese Genauigkeit nicht wichtig für die Anwendung ist
  * Erste Konvertierung mit *velocity* im Wertebereich von *short* -> Konvertierung wie gewünscht
  * Frage: Was haben wir übersehen? Konvertierung mit *velocity* außerhalb von *short* -> Konvertierung geht schief
  * Dieses Problem wurde der Ariane 5 zum Verhängnis **Video**)