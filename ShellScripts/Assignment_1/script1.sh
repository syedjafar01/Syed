#creating directory/folder
fn=Example
ct=$(date "+%Y.%m.%d-%H.%M.%S")
res=$fn_$ct
mkdir ./$res



#first create temp file in /tmp
cd /tmp
if [[ ! -f "test" ]]
then

  touch test

else
      echo "file test already exist"
fi

#moving files
mv /tmp/test /home/syedjafar/Desktop/Shell/$res
echo "successful moving"
