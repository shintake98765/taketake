#!/bin/bash
collection="postman_collection.json"
testcase=test001
newman run /newman/shell/${collection} --verbose -r cli,junit --reporter-junit-export /newman/logs/${testcase}.xml > /newman/logs/${testcase}.log
if [ $? -ne 0 ]; then
#  echo ${testcase} >> /newman/logs/error.log
fi
exit $?
