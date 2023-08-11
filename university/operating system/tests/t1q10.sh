#!/bin/bash
a= $(while true; do echo -n “Add two statement” > output.txt; sleep 1; done) &

jobs
echo "hey bro /n"
PID=$!
echo "$a"
echo "$PID" >> output.txt
sleep 1
pkill -SIGKILL  $PID
exit 0