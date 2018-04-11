git add *
echo off
set /p cm="Type commit message: "
git commit -m "%cm%"
git push
