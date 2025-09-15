# Dark Throne

Grundstruktur einer Forge 1.21.4 Mod. Das Projekt verwendet den Gradle Wrapper mit Version 8.7.
Der Wrapper enthält bewusst keine `gradle-wrapper.jar`, um keine Binärdateien ins Repository aufzunehmen.

## Build

Falls der Wrapper noch nicht initialisiert ist, kann er mit

```
gradle wrapper --gradle-version 8.7
```

erzeugt werden. Anschließend lässt sich das Projekt mit

```
./gradlew build --no-daemon --console=plain
```

kompilieren.

Die Datei `gradle-wrapper.jar` wird beim lokalen Aufruf von `gradle wrapper` erzeugt und bleibt unversioniert.

Weitere geplante Spielmechaniken und Rollen sind im [Konzeptdokument](docs/PLAN.md) skizziert.

Beim Start der Mod wird zur Kontrolle ein Log-Eintrag mit SLF4J ausgegeben.
Zurzeit existieren ein Pass-Item, einfache Manager für Fähigkeiten und Königreiche sowie mehrere Platzhalter-Befehle.
