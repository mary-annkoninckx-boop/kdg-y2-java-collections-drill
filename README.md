# Java Collections Framework - Praktijkoefeningen

Dit project bevat een reeks praktijkoefeningen om de kernconcepten van het Java Collections Framework, objectvergelijking en uniciteit grondig te testen.

---

## 📚 Overzicht van de Oefeningen

<Image alt="Java Collections Framework hiërarchie en interfaces" caption="De Java Collections hiërarchie" src="image_agent_tag_8397108703179377314" />

---

### 📍 Oefening 1: Postcodes Filteren en Sorteren (`Set`)

**Doel:** Kiezen van de juiste `Collection` voor uniciteit en automatische sortering.

**Casus:**  
Je ontvangt een lijst met ongeordende postcodes waarin dubbelgangers voorkomen:  
`[2000, 9000, 1000, 2000, 3000, 1000, 9000]`

**Vragen:**
1. Welke interface/klasse gebruik je om alle dubbele postcodes automatisch te verwijderen?
2. Welke specifieke klasse (`HashSet`, `TreeSet`, of `LinkedHashSet`) kies je als de postcodes ook meteen **automatisch gesorteerd** van klein naar groot moeten staan?

<details>
<summary>💡 Oplossing & Antwoord</summary>

1. **`Set`** verwijdert automatisch dubbels.
2. **`TreeSet`** zorgt er daarnaast voor dat de elementen direct in hun natuurlijke volgorde (van klein naar groot) worden opgeslagen.
</details>

---

### 👨‍💼 Oefening 2: Externe Sortering op Werknemers (`Comparator`)

**Doel:** Objecten sorteren waarvan je de oorspronkelijke klasse niet mag of kunt aanpassen.

**Casus:**  
Gegeven is een klasse `Werknemer` met `naam` en `salaris`. Je wilt een `List<Werknemer>` sorteren op salaris van **laag naar hoog**, maar de klasse `Werknemer` mag **geen** `implements Comparable` krijgen.

**Vragen:**
1. Welke interface gebruik je om een externe sorteerder te maken: `Comparable` of `Comparator`?
2. Wat moet de methode `compare(Werknemer w1, Werknemer w2)` teruggeven als `w1` minder verdient dan `w2` en je van laag naar hoog wilt sorteren?

<details>
<summary>💡 Oplossing & Antwoord</summary>

1. **`Comparator<Werknemer>`** (bijvoorbeeld via een Lambda of een aparte klasse).
2. Een **negatief getal** (zoals `-1` of `Double.compare(w1.getSalaris(), w2.getSalaris())`), want `w1` moet **vóór** `w2` in de lijst komen te staan.
</details>

---

### 🔤 Oefening 3: Woorden Tellen (`Map`)

**Doel:** Werken met Key-Value paren en frequenties bijhouden.

**Casus:**  
Je verwerkt een reeks woorden: `"appel"`, `"banaan"`, `"appel"`, `"citroen"`, `"banaan"`, `"appel"`. Je wilt per woord bijhouden hoe vaak het voorkomt.

**Vragen:**
1. Welke datastructuur `Map<K, V>` kies je en wat zijn de types van Key (`K`) en Value (`V`)?
2. Hoe verwerk je een woord als het al in de Map zit vs. als het er nog niet in zit?

<details>
<summary>💡 Oplossing & Antwoord</summary>

1. **`Map<String, Integer>`** (bijvoorbeeld een `HashMap<String, Integer>`).
2. **Logica:**
    * Als de sleutel nog **niet** bestaat: voeg toe met waarde `1`.
    * Als de sleutel **wel** bestaat: haal de huidige waarde op, doe `+ 1`, en overschrijf de sleutel.
</details>