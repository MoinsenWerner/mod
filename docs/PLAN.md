# Dark Throne – Konzept

Dieses Dokument beschreibt geplante Spielmechaniken der "Dark Throne" Forge-Mod. Die Liste dient als Entwurf und ist noch nicht implementiert.

## Fähigkeiten
- Pro Königreich existieren drei unterschiedliche Fähigkeiten; pro Spieler ist nur eine aktiv.
- Die Fähigkeit kann erst einen Tag nach dem Beitritt gewählt werden.
- Training steigert die Stärke und verkürzt den Cooldown der Fähigkeit.
- Administratoren können die Fähigkeit eines Spielers einmal ändern: `/abillity change <Playername>`.

### Eisbiom
- **Eis Spikes** – PVP‑fähige Eisstacheln.
- **Schneesturm** – blendet Gegner, Verbündete sind immun.
- **Foodoo** – beschwört zufälliges Essen; Art wird über die Config vorgegeben, Menge zufällig 10–64.

### Wüstenbiom
- **Kaktusschwert** – Steinschwert mit eigener Textur, vergiftet für 2 s; jeder Treffer setzt die Vergiftung auf maximal 2 s zurück.
- **Sandsturm** – analog zum Schneesturm.
- **Sandsegen** – füllt für alle Reichsmitglieder den Hungerbalken bis zu ¾.

### Sumpfbiom
- **Matschball** – schleudert eine Ladung Matschbälle in Blickrichtung, 3 Herzen Schaden pro Treffer.

### Dschungelbiom
- **Fallensteller** – platziert eine getarnte Falle, die Gegner in die Luft schleudert.

## Königreiche
- Pro Season existieren 2–6 Königreiche; Start‑Season: 4.
- Regionen werden mit `/kingdom <Kingdom> <Pos1> <Pos2> [set|relocate]` angelegt oder verschoben (nur Admins).
- Löschen per `/delkingdom <Kingdom>` (nur Admins).
- `/nopvp <Pos1> <Pos2>` definiert die Diplomateninsel (nur Admins).
- Jedes Königreich besitzt einen eigenen Pass (Custom Item).
- Pro Königreich maximal zwei Spione.

## Pässe
- Können nicht gedroppt oder in Behälter gelegt werden und bleiben beim Tod erhalten.
- Optionaler zusätzlicher Inventarslot möglich.
- Spieler besitzen nur einen Pass; Spione dürfen zwei besitzen.

## Positionen
- Spieler wählen ihre Rolle mit `/career <Position>`; der König kann sie ändern.

### König (king) – max. 1/Königreich
- Wird zu Seasonbeginn mit `/vote king <Playername>` gewählt.
- Besitzt mehr Lebenspunkte.
- Wird er von Untertanen getötet, übernimmt der Killer den Titel.
- Erklärt Kriege: `/war <Gegnerisches Kingdom>`.
- Vergibt Pässe und Rollen: `/career <Position> <Playername> set`.
- Verbannt Spieler: `/exil <Playername>`.

### Spion (spy) – max. 1/König, insgesamt max. 2/Königreich
- Darf zwei Pässe halten und Fähigkeiten beider Reiche nutzen.
- Kann das eigene Königreich verraten.
- Muss innerhalb weniger Tage einen zweiten Pass erhalten, sonst Verlust der Rolle (für die Season keine erneute Spion-Rolle).

### Bote (courier) – max. 1/König
- Optional.
- Kann über `/horse` ein einziges Pferd spawnen; stirbt es, lässt sich ein neues rufen.
- König wird benachrichtigt, wenn der Bote angegriffen wird.
- Permanenter Regeneration-I-Effekt.

### Ritter (knight) – unbegrenzt/König
- Einmaliges Starterkit: `/knight equip` gibt ein getaggtes Full-Iron-Set; bei Rollenverlust wird es gelöscht.
- Errichten Gebäude und sorgen in Friedenszeiten für Ordnung.

### Bauer (farmer) – unbegrenzt/König
- Sammelt oberirdische Ressourcen.

### Minenarbeiter (miner) – unbegrenzt/König
- Sammelt unterirdische Ressourcen.

## Gameplay
- Königreiche werden erobert, indem der gegnerische König getötet wird.
- Spieler, die im Krieg sterben, scheiden aus dem Projekt aus (optional zwei Leben: erster Tod = Respawn, zweiter Tod = Ausschluss).
- Besiegte Königreiche können sich erheben und mit `/vote king <Playername>` einen neuen König wählen.

## Kriege
- Nur Könige können Kriege erklären: `/war <Gegnerisches Kingdom>`.
- Nach einem Krieg besteht für alle beteiligten Könige eine Woche Kriegs‑Cooldown.
- Frieden wird auf der Diplomatie‑Insel geschlossen: `/peace <Königreich>`.
- Andere Königreiche können mit `/joinwar <Gegnerisches Kingdom>` einem Krieg beitreten; sie erhalten ebenfalls den Cooldown.

## Dynamische Events
- Globale, unvorhersehbare Ereignisse wie Krankheiten oder Hungersnöte erzwingen Handel oder Kriege.

## Wirtschaft
- Eigene Ressource als Währung (z. B. „Kronen").
- Optional besitzt jedes Reich eine eigene Währung; Wechselkurse werden von Spieler‑Banken bestimmt.

## Quests & NPCs
- NPCs vertiefen die Lore, vergeben Quests und erzählen Geschichten.
- Spieler können eigene Quests beisteuern.

## Individuelle Spieler-Stories
- Zufällige Geheimquests wie „Erhebe dich selbst zum König", „Sorge für Frieden" oder „Verrate dein Reich".

## Politik-System
- Abstimmungen über Gesetze oder Kriege, z. B. via Buch & Feder oder Web/Discord-Integration.

## Mod-Konfiguration
- Konfigurierbar: maximale Combat-Time.
- Konfigurierbar: maximale Anzahl aktiver Königreiche (2–6).
- Alle Daten werden in einer Datenbank gespeichert; existiert keine, wird sie erstellt.

## Zuständigkeiten
- Felix
- Daniel

