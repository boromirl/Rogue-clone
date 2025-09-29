#!/bin/bash
saved_stty=$(stty -g)
stty cbreak -echo

eval $(resize 2>/dev/null || true)
./gradlew --console=plain run
stty $saved_stty