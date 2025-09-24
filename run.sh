#!/bin/bash
saved_stty=$(stty -g)
stty cbreak -echo
./gradlew --console=plain run
stty $saved_stty