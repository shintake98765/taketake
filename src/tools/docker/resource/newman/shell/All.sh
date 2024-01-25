#!/bin/bash
docker exec -i newman /newman/shell/001.sh
if [ -f ../logs/error.log ]; then
  exit 1;
fi
