Array is like a row of reserved seats in a theater , everyting is sequential and size is fixed
if we have to add a seat in the middle we have to shift everyone over.

Linked List on the other hand is like a treasure hunt , each clue(element) tells two things:
    1. the element current spot(the data)
    2. the pointer / reference
because of this , the elements do not need to be next to each other in the memory , they can be scattered anywhere , they are linked via references.

#Node:
In java , we repreasent each element as an  object called node , a basic node contains two things ,
    **data** - the actual value you want to store (like an integer)
    **next** - a reference pointing to the next node object in the memory


Singly Linked List -  a chain of nodes forms a linked list(singly) , very first node is called head , last node points to null, indicating the end of list