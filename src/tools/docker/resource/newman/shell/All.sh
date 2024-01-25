#!/bin/bash
docker exec -i newman /newman/shell/001.sh
if [ -f ./test ]; then
  exit 1;
fi
