#taking count of users and passwords
u=$(cat $1 | wc -l)
p=$(cat $2 | wc -l)

#checking equality
if [ "$u" -eq "$p" ]
then 

echo "equal"
paste $1 $2 | while IFS="$(printf '\t')" read -r f1 f2
do
  #creating user and assigning password
  sudo useradd $f1
  #echo "$f2" | passwd $f1 --stdin
  echo $f1:$f2 | chpasswd
  echo "new user:$f1 created with password:$f2"
 
done

else
 echo "not equal"
fi
