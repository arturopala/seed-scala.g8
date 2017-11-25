#!/usr/bin/env bash

if [ -f ./build.sbt ] && [ -d ./src/main/g8 ]; then

    export TEMPLATE=`pwd | xargs basename`
    echo "Testing template ${TEMPLATE} ..."
    mkdir -p target/sandbox
    cd target/sandbox
    rm -r my-project
    g8 file://../../../${TEMPLATE} --name="My Project"
    cd my-project
    sbt compile test
    echo "All done."

else

    echo "WARNING: run test in the template root folder"
    exit -1

fi

