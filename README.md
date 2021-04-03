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
- /hello/world 
- /hello/world2 
- /hello2/world2 <-- this one does not work 

Failing with this error message (cleanup for clarity):

    Failed to render hello2/hello.jte,
        type mismatch for parameter: 
            Expected 
                app.controllers.HelloController$HelloPage 
            got 
                app.controllers.HelloController$HelloPage


Pointing to here: https://github.com/casid/jte/blob/4a3825ab3be1aed76761f00c421c132135d29326/jte-runtime/src/main/java/gg/jte/runtime/Template.java#L43
