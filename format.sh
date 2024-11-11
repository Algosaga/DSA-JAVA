#!/bin/bash

# Path to Google Java Format JAR
GOOGLE_JAVA_FORMAT_JAR="path/to/google-java-format-1.15.0-all-deps.jar"

# Find all Java files and format them
find . -name "*.java" | while read -r file; do
    java -jar "$GOOGLE_JAVA_FORMAT_JAR" --replace "$file"
done
