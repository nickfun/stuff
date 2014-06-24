#!/bin/bash
echo "=== compile"
mvn package
clear
echo "=== begin ==="
java -cp target/classes:target/dependency/* gs.nick.MyMain
echo "=== done ==="
