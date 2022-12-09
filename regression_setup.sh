#!/bin/bash

file="myclasses.txt"

mvn clean
mvn compile

while read -r line; do

java -classpath $(pwd)/target/classes/:$(pwd)/Randoop/randoop-all-4.2.1.jar randoop.main.Main gentests --testclass=$line --output-limit=500

rm *.class 

done<$file
