#!/bin/bash
gcc -o server server.c && ./server >> serverlog.txt &
