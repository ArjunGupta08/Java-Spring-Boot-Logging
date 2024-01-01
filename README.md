
##        THERE ARE TWO TYPES OF LOGGING SYSTEM AVAILABLE : ->
####        1) - USING SLF4J
####        2) - USING LOGBACK

         If (U r using slf4j) {
             Use application.yaml to enable debug Log, 
             IT'LL NOT CREATE ANY LOG FILE
         } else if (U r using LogBack) {
             Use logback.xml to enable debug Log,
             logback creates a file, WHERE ALL LOGS OF CONSOLE GET PRINTED
         }
