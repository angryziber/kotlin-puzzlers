#!/bin/bash
# Conference Puzzler runner
# Configure it as an External Tool in IDEA with a keyboard shortcut
# Arguments: $FilePath$ $FileFQPackage$.$FileNameWithoutExtension$Kt

FILE=$1
CLASS=$2

IDEA=~/apps/idea

if [ -z "$2" ]; then
  echo "2 params required"
fi

DIR=`dirname $FILE`

echo "Drum roll..." >&2
screen -d -m mpg123 -k 50 drumroll.mp3
java -cp $IDEA/plugins/Kotlin/kotlinc/lib/kotlin-compiler.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-reflect.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-runtime.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-script-runtime.jar org.jetbrains.kotlin.cli.jvm.K2JVMCompiler -script $FILE

sleep 1
mpv --quiet --no-osc --ontop --no-border --autofit=50%x50% --geometry=100%:0% --loop $DIR/giphy.* 2>/dev/null >/dev/null
