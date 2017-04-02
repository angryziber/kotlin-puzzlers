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

if [[ $FILE == *.kts ]]; then
  java -cp $IDEA/plugins/Kotlin/kotlinc/lib/kotlin-compiler.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-reflect.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-runtime.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-script-runtime.jar org.jetbrains.kotlin.cli.jvm.K2JVMCompiler -script $FILE
else
  java -cp out/production/kotlin-puzzlers:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-runtime.jar:$IDEA/plugins/Kotlin/kotlinc/lib/kotlin-reflect.jar $CLASS
fi

mpv --quiet --ontop --no-border --autofit=50%x50% --geometry=100%:0% --loop $DIR/giphy.mp4 2>/dev/null >/dev/null
