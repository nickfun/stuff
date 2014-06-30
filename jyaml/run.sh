#!/bin/bash
echo "=== compile"
mvn package && java -cp target/classes:target/dependency/* gs.nick.MyMain
echo "=== done ==="
