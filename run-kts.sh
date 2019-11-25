#!/bin/bash
# Conference Puzzler runner, requires screen, mpeg123 and mpv for audio/video playback
# Configure it as an External Tool in IDEA with a keyboard shortcut
# Arguments: $FilePath$

FILE=$1

[ -z "$FILE" ] && echo "File path should be given" && exit 1

if [ -z "$KOTLIN_HOME" ]; then
  LATEST_IDEA_CONFIG=$(ls -d ~/.IntelliJIdea* ~/.IdeaIC* 2> /dev/null | tail -n 1)
  KOTLIN_HOME="$LATEST_IDEA_CONFIG/config/plugins/Kotlin/kotlinc"
  if [ ! -e "$KOTLIN_HOME" ]; then
    KOTLIN_HOME=$(ls -d /snap/intellij-idea-{community,enterprise}/current/plugins/Kotlin/kotlinc 2> /dev/null)
  fi
fi

[ ! -e "$KOTLIN_HOME" ] && echo "KOTLIN_HOME does not exist" && exit 1
[ ! -x "$KOTLIN_HOME/bin/kotlinc" ] && chmod +x "$KOTLIN_HOME/bin/kotlin" "$KOTLIN_HOME/bin/kotlinc"

DIR=$(dirname "$FILE")

echo "Drum roll..." >&2
screen -d -m mpg123 -k 50 drumroll.mp3

KOTLINC_ARGS="-nowarn -progressive -Xuse-experimental=kotlin.ExperimentalUnsignedTypes -Xuse-experimental=kotlin.contracts.ExperimentalContracts"
KOTLIN_CLASSPATH=$KOTLIN_HOME/lib/kotlinx-coroutines-core-1*.jar

if [[ $FILE == *.kts ]]; then
  "$KOTLIN_HOME/bin/kotlinc" $KOTLINC_ARGS -cp $KOTLIN_CLASSPATH -script $FILE
else
  # compile & run package-less *.kt file
  OUT="out/production/kotlin-puzzlers"
  CLASS=$(basename ${FILE%.kt})Kt
  "$KOTLIN_HOME/bin/kotlinc" $KOTLINC_ARGS -cp $KOTLIN_CLASSPATH -d $OUT $FILE && \
  "$KOTLIN_HOME/bin/kotlin" -cp $OUT:$KOTLIN_CLASSPATH $CLASS
fi

sleep 1
mpv --quiet --no-osc --ontop --no-border --autofit=50%x50% --geometry=100%:0% --loop $DIR/giphy.* 2>/dev/null >/dev/null
