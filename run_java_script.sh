#!/usr/bin/env sh

javac $1.java
java $1
mv $1.class classes