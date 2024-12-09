@echo off
rem Gradle Wrapper for Windows
set VERSION=7.3.3
set DIST=gradle-%VERSION%-all.zip
set URL=https://services.gradle.org/distributions/%DIST%
set DIR=%CD%\gradle\wrapper\dists\%DIST%

if not exist "%DIR%" (
    mkdir "%DIR%"
    curl -L %URL% -o %DIR%
)
java -jar "%DIR%"