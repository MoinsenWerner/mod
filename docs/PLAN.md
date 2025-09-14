# Dark Throne – Konzept

Dieses Dokument fasst geplante Spielmechaniken der "Dark Throne" Forge‑Mod zusammen. Die Liste dient nur als Entwurf und ist noch nicht implementiert.

## Fähigkeiten
- Jedes Königreich bietet drei unterschiedliche Fähigkeiten, pro Spieler ist nur eine aktiv.
- Fähigkeit kann erst einen Tag nach Beitritt gewählt werden.
- Nutzung trainiert die Fähigkeit: sie wird stärker und der Cooldown sinkt.
- Administratoren können die Fähigkeit eines Spielers einmalig zurücksetzen: `/abillity change <Spieler>`.

### Eisbiom
- **Eis Spikes:** im Kampf einsetzbare Eisstacheln.
- **Schneesturm:** blendet Gegner; eigene Spieler sind immun.
- **Foodoo:** beschwört zufällige Nahrungsitems (Art und Menge konfigurierbar).

### Wüstenbiom
- **Kaktusschwert:** Steinschwert mit Textur, vergiftet Ziele bis zu 2 s.
- **Sandsturm:** analog zum Schneesturm.
- **Sandsegen:** füllt Hungerbalken der Verbündeten bis ¾.

### Weitere Biome
- **Sumpf – Matschball:** Projektile verursachen 3 Herzen Schaden.
- **Dschungel – Fallensteller:** versteckte Falle schleudert Gegner in die Luft.

## Königreiche
- Zu Saisonbeginn 4 Königreiche, insgesamt 2–6 möglich.
- Admin‑Befehle zum Setzen, Versetzen und Löschen von Regionen.
- Diplomateninsel mit `/nopvp`.
- Pässe als nicht droppbares Item; Spione dürfen zwei besitzen.

## Positionen
- Rollen wie König, Spion, Bote, Ritter, Bauer und Minenarbeiter.
- König wird gewählt (`/vote king <Spieler>`), kann Kriege erklären, Pässe vergeben und Spieler ins Exil schicken.
- Weitere Rollen besitzen besondere Befehle und Einschränkungen.

## Gameplay und Kriege
- Königreiche werden durch Tötung des gegnerischen Königs erobert.
- Tod im Krieg kann zum Ausscheiden aus dem Projekt führen.
- Nur Könige dürfen Kriege starten; nach Ende eines Kriegs besteht eine Woche Friedenspflicht.

## Sonstiges
- Dynamische Events wie Krankheiten oder Hungersnöte.
- Eigene Währungssysteme und Quests/NPCs.
- Alle Daten werden in einer Datenbank gespeichert; fehlende Datenbank wird beim Start erstellt.

