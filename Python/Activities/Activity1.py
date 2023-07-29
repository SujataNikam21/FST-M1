name= input("Please enter your name:")
age = int(input('Please enter your age:'))
tage = 2023 + (100-age)
print(name + ", you will be 100 years old in the year " + str(tage))
print(type(tage))
# alternative way
Sage = str(2023 + (100-age))
print(name + " you will be 100 years old in the year " + Sage)
print(type(Sage))