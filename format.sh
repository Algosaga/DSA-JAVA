#!/bin/bash

# Path to Google Java Format JAR
GOOGLE_JAVA_FORMAT_JAR="./tools/google-java-format-1.24.0-all-deps.jar"

# Find all Java files and format them
find . -name "*.java" | while read -r file; do
    java -jar "$GOOGLE_JAVA_FORMAT_JAR" --replace "$file"
done
