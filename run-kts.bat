@echo off
rem Contributor Puzzler runner for Windows
rem Configure it as an External Tool in IDEA with a keyboard shortcut
rem Arguments: "$FilePath$" "$FileFQPackage$.$FileNameWithoutExtension$Kt"

setlocal

set FILE=%1
set CLASS=%2

set FALLBACK_KOTLIN_HOME=%UserProfile%\.IntelliJIdea2018.3\config\plugins\Kotlin\kotlinc\lib
IF NOT EXIST "%KOTLIN_HOME%" (
  set KOTLIN_HOME=%FALLBACK_KOTLIN_HOME%
)
IF NOT EXIST "%KOTLIN_HOME%" (
  echo %KOTLIN_HOME% does not exist
  echo Please set KOTLIN_HOME to either something like %FALLBACK_KOTLIN_HOME% or to a Kotlin Standalone Compiler distribution directory
)

IF "%2" == "" (
  echo 2 params required
)

set DIR=%~dp1

echo Drum roll... >&2
rem TODO screen -d -m mpg123 -k 50 drumroll.mp3

set ARGS=-nowarn -progressive -Xuse-experimental=kotlin.ExperimentalUnsignedTypes
IF "%~x1" == ".kts" (
  java -cp "%KOTLIN_HOME%\lib\*" org.jetbrains.kotlin.cli.jvm.K2JVMCompiler %ARGS% -script %FILE%
) ELSE (
  rem TODO who compiles this?
  java -cp "%KOTLIN_HOME%\lib\*;out\production\kotlin-puzzlers" %CLASS%
)

rem TODO sleep 1
rem TODO mpv --quiet --no-osc --ontop --no-border --autofit=50%x50% --geometry=100%:0% --loop $DIR/giphy.* 2>/dev/null >/dev/null
