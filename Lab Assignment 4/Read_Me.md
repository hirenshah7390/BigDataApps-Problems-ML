
Lab Assignment 4

Mutual friend finding 
We are using map reduce over here to find the common friend of any two friends. Below is the step by step process to achieve this.
Let say we stored friends as Person->[List of Friends]:

A -> B C D

B -> A C D E

C -> A B D E

D -> A B C E

E -> B C D

Here we will take key as a friend along with a person and value will be list of friend. The all mapper will be look like below, let say for A it will be: 

For map (A -> B C D) :

(A B) -> B C D

(A C) -> B C D

(A D) -> B C D

The same way it will be look for all rows. We need to group them as per keys before sending them to reducer. 

(A B) -> (A C D E) (B C D)

(A C) -> (A B D E) (B C D)

(A D) -> (A B C E) (B C D)

(B C) -> (A B D E) (A C D E)

Now we can pass this to reducer and reducer will take these lists as sets and will find out common values from it and the result will be as follow.

(A B) -> (C D)

(A C) -> (B D)

(A D) -> (B C)

(B C) -> (A D E)

(B D) -> (A C E)

(B E) -> (C D)

(C D) -> (A B E)

(C E) -> (B D)

(D E) -> (B C)


Q-2 I have used the face++ services for face detection of this application. 
    User can select the image by clicking on Browse image and then it will locate the face. 
