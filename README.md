# Demo app using Javalite + JTE

## Run as

Exec `/src/main/java/app/Main.java` from the IDE.
Then go to: http://localhost:8083

Requires Java 11 since JTE requires it. Uses javalite 3.0-j11-SNAPSHOT.

Alternatively, run this command:

    mvn exec:java -Dexec.mainClass=app.Main -Dexec.classpathScope=compile

## Note to self

ActiveWeb expects to find those packages:

- app.config
- app.controllers

---

## URLs to check out for the demo

- / 
- /hello 
- /hello/fm 
- /hello/jte 
