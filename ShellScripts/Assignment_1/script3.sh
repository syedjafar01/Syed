#collecting all the pids and storing in a file.

ps aux | awk -F ' ' '{print $2}' > file.txt
