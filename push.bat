@echo off
if "%~1"=="" (
    echo Please provide a commit message.
    echo Usage: push.bat "Your commit message here"
    exit /b 1
)

echo Adding all changes...
git add .

echo Committing with message: "%~1"
git commit -m "%~1"

echo Pushing to origin main...
git push origin main

echo =================================================================
echo 🚀 Whoosh! Your code has been launched into the remote repository successfully! 🚀
echo =================================================================
