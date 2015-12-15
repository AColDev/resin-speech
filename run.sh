#!/bin/bash

cd /App
CP() { local IFS=:; echo "$*";}
javac -d . -cp "$(CP libs/*.jar)" src/com/gdg/javaspeechendpoints/*.java

CP() { local IFS=:; echo "$*";}
java -cp .:"$(CP libs/*.jar)":"$(CP src/*)" com.gdg.javaspeechendpoints.JavaSpeechEndPoints