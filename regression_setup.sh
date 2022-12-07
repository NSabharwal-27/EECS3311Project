#!/bin/bash

mvn clean
mvn compile

java -classpath $(pwd)/target/classes/:$(pwd)/Randoop/randoop-all-4.2.1.jar randoop.main.Main gentests -testclass=classlist.txt -output-limit=500

rm *.class


