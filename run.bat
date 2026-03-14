@echo off
if /I "%~1"=="ship" (
    echo Adding all changes...
    git add .
    
    echo Committing with message: "test"
    git commit -m "test"
    
    echo Pushing to origin main...
    git push origin main
    
    echo =================================================================
    echo 🚢 Shippity ship! Your code has successfully sailed to the main branch! 🚢
    echo =================================================================
) else (
    echo Command not recognized
)
