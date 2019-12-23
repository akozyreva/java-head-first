#!/usr/bin/env sh
CLASS_NAME=$(echo "$1" | cut -f1 -d".")
javac $CLASS_NAME.java
java $CLASS_NAME
OCCUR=$(find . -name $CLASS_NAME.class)
if [ -z "$OCCUR" ]
then
    echo "Java file wasn't compiled - check previous messages"
else
    rm -rf *.class
fi