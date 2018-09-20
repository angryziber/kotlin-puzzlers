#!/bin/bash
# Conference Puzzler runner
# Configure it as an External Tool in IDEA with a keyboard shortcut
# Arguments: $FilePath$ $FileFQPackage$.$FileNameWithoutExtension$Kt

FILE=$1
CLASS=$2

KOTLIN_LIB=~/.IntelliJIdea2018.2/config/plugins/Kotlin/kotlinc/lib

if [ -z "$2" ]; then
  echo "2 params required"
fi

DIR=`dirname $FILE`

echo "Drum roll..." >&2
screen -d -m mpg123 -k 50 drumroll.mp3

if [[ $FILE == *.kts ]]; then
    java -cp $KOTLIN_LIB'/*' org.jetbrains.kotlin.cli.jvm.K2JVMCompiler \
         -nowarn -Xuse-experimental=kotlin.ExperimentalUnsignedTypes -script $FILE
else
    java -cp $KOTLIN_LIB'/*':out/production/kotlin-puzzlers $CLASS
fi

sleep 1
mpv --quiet --no-osc --ontop --no-border --autofit=50%x50% --geometry=100%:0% --loop $DIR/giphy.* 2>/dev/null >/dev/null
