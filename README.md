# java-fundamentals

## Lab 1 (25/7/2021)

Duration| 3 Hours
---|---
Methods|1. Finding radom number for in the second funtion that will used to find move between Tails and Heads 2. I also use local time Date to find out the time in Hour minets and seconds 3.I also used try and to catch any exception in case found in the last function 4. I also use many methods in differents function like if ..else while 


## lab 2 (26/7/2021)

Duration| 3 Hours
---|---
===================
Mehtods description
===================
Roll()
1. create function called roll that accept int n
2. craete empty array
3. identify first point and last point in the function 
4. create for loop to loop between first point and last point which create n radom number 
5. still inside for loop push the result inside an array 
6. return array 

containsDuplicate()
1. this function accept the result that procduce in the roll()
2. this function check it the numbers that produced in previos function duplicated or not
3. if its duplicated the fuction true (boolean) if not the function will return false 

Average()
1. this function will calculate the average of numbers that produced in the roll()
2. the function accept array and will return int
3. so i created for loop to loop over the nuber and find sum 
4. then go out form the loop and caculate the average by dividing the sum over n
5. return average 

lowestTemp ()

1. This function accept a two dim array 
2. create hash map that will accept avg of each array later and i choose it becuase it is accept two integer and compare between them 
2. I looped twice on the array to reach to  each value and find sum for each array 
4. exit for the second array and calculate the average of each on 
5. return the lowest arrayby using indexOf(Collections method)


## lab 3 (27/7/2021)

Duration| 8 Hours
---|---

===================
Mehtods description
===================

analyzeWeather()
1. Craete function that accept 2D array 
2. create Hashset that will accept number of intergers later to accept list of number without duplicated 
3. loop twice throught the two d array and number to Hashset that created before
4. Craete list that accept hashed 
5. sort the list by using Collectios.sort
6. idetify the max and min by using Collections.min and Collections.max
7. loop between min and max to find out the numbers that not contained between them by using Contains method 
8. push those number that found in the pervios step to empty string 
9. return string 

tally()
1. Create function called tally and that accept list of string 
2. Craete an empty map 
3. Craete for loop to find out the most common each of string and number repition  
4. create another for loop that find string that have max number of repitions
5. return string 

linter()
1. Cearte App class
2. Ceate couter to count the number of line that note have simicolon ,braces,etc
3. call the file that i need scan into by using new path obj
4. loop through the line by using for each and increase the counter if the condion applicable with else sout it
3. Using try and catch to catch any error 