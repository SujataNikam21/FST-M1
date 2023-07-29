list1 = [1,2,3,4,5]
list2 = [11,12,13,14,15]
print("List1 ",list1)
print("List2 ",list2)
list3= []
size_l1= len(list1)
size_l2 = len(list2)
for i in range (0,size_l1):
    if (list1[i] % 2!=0):
        list3.append(list1[i])
for j in range (0,size_l2):
    if (list2[j] % 2==0):
        list3.append(list2[j])
print("Combined list having odd numbers from 1st list and even from 2nd: ")
print(list3)