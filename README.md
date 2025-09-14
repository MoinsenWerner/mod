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
