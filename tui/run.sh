#!/bin/bash

mvn package
java -cp target/*.jar:target/classes MyMain
echo "Done"
