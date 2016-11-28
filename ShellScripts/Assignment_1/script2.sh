#checking file present or not, if present then delete or else archive the folder
if [ -f $2/$1 ]
then

  cd $2
  rm $1
  echo "file deleted"

else
  echo "file not exist"
  tar -zcvf $1.tar.gz $2
  echo "archived"

fi
