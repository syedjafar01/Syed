if [ $# -ne 2 ]
then
   cd `pwd`

#listing files and folders sorted by size
ls -lSR | awk '{print $5" "$9 }' | sort -hr
find . -size 0 -exec rm -i {} \;

#searching the required file
cd `find -name "*$1" | awk -F/ '{print $2}'`
res=()
for i in `find -name "*$1" | awk -F/ '{print $NF}'`
do
   res+=($i)
done
#pw=`pwd`
#echo "$pw"
#rename the file
for i in ${res[@]}
do
  echo "$i"
  if [[ $i == *.$1 ]]
  then
       mv "$i" "${i%.$1}.razorthink"      
  else
       mv "$i" "razorthink"
fi
done


#if part ends------------------->

else

   cd $1

#listing files and folders sorted by size
ls -lSR | awk '{print $5" "$9 }' | sort -hr
find . -size 0 -exec rm -i {} \;

#searching the required file
res=()
for i in `find -name "*$2" | awk -F/ '{print $NF}'`
do
   res+=($i)
done


#rename the file
for i in ${res[@]}
do
  #echo "$i"
  if [[ $i == *.$2 ]]
  then
       mv "$i" "${i%.$2}."      
  else
       mv "$i" "razorthink_$(echo "$(pwd)"| sed -r 's/[/]+/-/g')"
fi
done
echo "***END***"
fi









